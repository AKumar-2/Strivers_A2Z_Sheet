import java.util.Arrays;

public class InsertionSort {

    public static int[] insertionSort(int[] nums) {
        for (int i = 1; i < nums.length; i++) {
            for(int j = 0; j < i; j++) {
                if (nums[j] > nums[i]) {
                    int temp = nums[j];
                    nums[j] = nums[i];
                    nums[i] = temp;
                }
            }
            System.out.println(Arrays.toString(nums));
        }
        return nums;
    }

    public static void main(String[] args) {
        int[] arr = {7, 4, 1, 5, 3};

        int[] finalArr = insertionSort(arr);;
        System.out.println(Arrays.toString(finalArr));
    }
}
