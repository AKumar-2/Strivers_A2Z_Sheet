import java.util.Arrays;

public class MergeSort {

    public static int[] mergeSort(int[] arr) {
        int[] temp = new  int[arr.length];
        mergeSortHelper(arr, 0, arr.length - 1, temp);
        return arr;
    }

    private static void mergeSortHelper(int[] arr, int left, int right, int[] temp) {
        if (left >= right) {
            return;
        }

        int mid = left + (right - left)/2;

        mergeSortHelper(arr, left, mid, temp);
        mergeSortHelper(arr, mid + 1, right, temp);

        merge(arr, left, mid, right, temp);
    }

    private static void merge(int[] arr, int left, int mid, int right, int[] temp) {

    }

    public static void main(String[] args) {
        int[] arr = {2,8,4,9,3};

        int[] finalArr = mergeSort(arr);;
        System.out.println(Arrays.toString(finalArr));
    }
}
