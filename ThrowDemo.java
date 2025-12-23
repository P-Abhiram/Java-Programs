public class ThrowDemo {

    public static void divide(int numerator, int denominator) {
        if (denominator == 0) {
            // Throw an ArithmeticException if division by zero is attempted
            throw new ArithmeticException("Division by zero is not allowed.");
        }
        System.out.println("Result of division: " + (numerator / denominator));
    }

    public static void main(String[] args) {
        try {
            // Call the divide method with a potential for division by zero
            divide(10, 0); 
        } catch (ArithmeticException e) {
            // Catch the thrown ArithmeticException and print its message
            System.out.println("Caught an exception: " + e.getMessage());
        }
    }
}