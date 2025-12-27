import java.util.Arrays;

public class RecursiveInsertionSort {

    public static void main(String[] args) {
        int[] arr = {2,8,4,9,3, 214, 11, 88, 78, 88};

        recursiveInsertionSort(arr, 1);
        System.out.println(Arrays.toString(arr));
    }

    private static void recursiveInsertionSort(int[] arr, int n) {
        if (n >= arr.length) return;

        insertionSort(arr, n);
        recursiveInsertionSort(arr, n + 1);
    }

    static void insertionSort(int[] arr, int n) {
        int i = n - 1;
        int curr = arr[n];

        while (i >= 0 && arr[i] > curr) {
            arr[i + 1] = arr[i];
            i--;
        }
        arr[i + 1] = curr;
    }
}
