import java.util.Scanner;

public class AdditionInput {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("Enter first number: ");
        int a = in.nextInt();
        System.out.print("Enter second number: ");
        int b = in.nextInt();
        int sum = a + b;
        System.out.println("Sum = " + sum);

    }
}
