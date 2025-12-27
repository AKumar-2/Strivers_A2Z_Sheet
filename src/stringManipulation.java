import java.util.Arrays;
import java.util.Scanner;

public class stringManipulation {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Input some data: ");
        String input = scanner.nextLine();

        int length = input.length();
        System.out.println("Total length of input: " + length);

        String[] arr = input.split(" ");
        System.out.println(Arrays.toString(arr));

        int length1 = arr.length;
    }
}
