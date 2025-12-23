import java.util.Scanner;

public class StudentData {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Enter student details:");

        System.out.print("Name: ");
        String name = scanner.nextLine();

        System.out.print("Email: ");
        String email = scanner.nextLine();

        System.out.print("Mobile Number: ");
        long Mno = scanner.nextLong();
        scanner.nextLine(); 

        System.out.print("Roll Number: ");
        String rollNumber = scanner.nextLine();

        System.out.println("\nStudent Details:");
        System.out.println("Name: " + name);
        System.out.println("Email: " + email);
        System.out.println("Mobile number: " + Mno);
        System.out.println("Roll Number: " + rollNumber);

        scanner.close();
    }
}
