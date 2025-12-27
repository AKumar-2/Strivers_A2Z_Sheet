import java.util.Arrays;

public class InsertionSort {

    public static int[] insertionSort(int[] nums) {
        for (int i = 1; i < nums.length; i++) {
            RecursiveInsertionSort.insertionSort(nums, i);
        }
        return nums;
    }

    public static void main(String[] args) {
        int[] arr = {7, 4, 1, 5, 3};

        int[] finalArr = insertionSort(arr);
        System.out.println(Arrays.toString(finalArr));
    }
}
