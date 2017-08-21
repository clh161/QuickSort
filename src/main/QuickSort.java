/**
 * @author Jacob Ho
 */
public class QuickSort {
    public static void sort(int[] ints) {
        sort(ints, 0, ints.length - 1);
    }

    private static void sort(int[] ints, int start, int end) {
        if (end - start == 1 && ints[start] > ints[end])
            swap(ints, start, end);
        else if (end - start > 1) {
            int pivotIndex = start + (int) (Math.random() * (end - start));
            int i = start + 1;
            int pivot = ints[pivotIndex];
            swap(ints, start, pivotIndex);
            for (int j = i; j < end + 1; j++) {
                if (ints[j] < pivot) {
                    swap(ints, j, i);
                    i++;
                }
            }
            swap(ints, start, i - 1);
            sort(ints, start, i - 1);
            sort(ints, i, end);
        }
    }

    private static void swap(int[] ints, int a, int b) {
        int temp = ints[a];
        ints[a] = ints[b];
        ints[b] = temp;
    }
}
