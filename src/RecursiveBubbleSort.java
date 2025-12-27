import java.util.Arrays;

public class RecursiveBubbleSort {

    public static void main(String[] args) {
        int[] arr = {2,8,4,9,3, 214, 11, 88, 78, 88};

        int[] finalArr = recursiveBubbleSort(arr);
        System.out.println(Arrays.toString(finalArr));
    }

    private static int[] recursiveBubbleSort(int[] arr) {
        bubbleSort(arr, arr.length);
        return arr;
    }

    private static void bubbleSort(int[] arr, int num) {
        if (num <= 0) {
            return;
        }
        boolean swapHappen = false;

        for (int i = 0; i < num - 1; i++){
            if (arr[i] > arr[i + 1]){
                int temp = arr[i];
                arr[i] = arr[i + 1];
                arr[i + 1] = temp;
                swapHappen = true;
            }
        }

        if (!swapHappen) return;

        bubbleSort(arr, num - 1);
    }
}
