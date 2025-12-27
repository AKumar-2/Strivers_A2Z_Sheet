import java.util.Arrays;

public class BubbleSort {

    public static void main(String[] args) {
        int[] arr = {2,8,4,9,3};

        int[] finalArr = bubbleSort(arr);;
        System.out.println(Arrays.toString(finalArr));
    }

    private static int[] bubbleSort(int[] arr) {
        for (int i = arr.length - 1; i >= 0; i--) {
            for (int j = 0; j < i; j++) {
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }
        return arr;
    }
}
