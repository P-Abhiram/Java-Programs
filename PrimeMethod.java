import java.util.Scanner;
public class PrimeMethod {
    public static void main(String[] args) {
        int n;
        System.out.println("Enter a number");
        Scanner s = new Scanner(System.in);
        n = s.nextInt();
        pcheck(n);
    }

    static void pcheck(int x) {
        int count = 0;
        for (int i = 1; i <= x; i++) {
            if (x % i == 0) {
                count++;
            }
        }
        if (count == 2) {
            System.out.println(x + " is a prime number");
        } else {
            System.out.println(x + " is not a prime number");
        }
    }
}
