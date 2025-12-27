import java.util.Arrays;

public class SelectionSort {



    public static int[] selectionSort(int[] arr) {

        for (int i = 0; i < arr.length; i++){
            int minVal = i;

            for (int j = i + 1; j < arr.length; j++) {
                if (arr[j] < arr[i]){
                    minVal = j;
                }
            }

            if (i != minVal){
                int temp = arr[i];
                arr[i] = arr[minVal];
                arr[minVal] = temp;
            }
        }

        return arr;
    }

    public static void main(String[] args) {
        int[] arr = {2,8,4,9,3};

        int[] finalArr = selectionSort(arr);;
        System.out.println(Arrays.toString(finalArr));
    }
}
