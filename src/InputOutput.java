import java.util.Scanner;

public class InputOutput {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Please enter name: ");
        String name = scanner.nextLine().trim();

        System.out.println("please enter age: ");
        Integer age = scanner.nextInt();

        System.out.println("Hello " + name + " welcome to age group " + age);
    }
}