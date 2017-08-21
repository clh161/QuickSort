import org.junit.Test;

import java.util.Arrays;
import java.util.Random;

import static org.junit.Assert.assertTrue;

/**
 * @author Jacob Ho
 */
public class QuickSortTest {
    @Test
    public void sort() throws Exception {
        int loop = 100;
        int sampleSize = 100;
        for (int i = 0; i < loop; i++) {
            int[] randomArray = getRandomArray(sampleSize);
            QuickSort.sort(randomArray);
            for (int j = 0; j < randomArray.length - 1; j++) {
                assertTrue(Arrays.toString(randomArray), randomArray[j] < randomArray[j + 1]);
            }
        }
    }

    private int[] getRandomArray(int len) {
        Random random = new Random();
        int[] ints = new int[len];
        for (int i = 0; i < len; i++) {
            int position = random.nextInt(len - i);
            for (int j = 0; j < len; j++) {
                if (ints[j] == 0) {
                    if (position == 0) {
                        ints[j] = i + 1;
                        break;
                    }
                    position--;
                }
            }
        }
        return ints;
    }
}