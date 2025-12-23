import java.util.Scanner;
public class while {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter a number n: ");
        int n = sc.nextInt();
        
        int i = 1; 
        while (i <= n) {
            System.out.println(i);
            i++; 
        }
        
        scanner.close();
    }
}