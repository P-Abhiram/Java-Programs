public class Multicatch {
    public static void main(String[] args) {
        try {
            int a = args.length; 
            System.out.println("a = " + a); 

            int b = 42 / a; // 
            int[] c = {1, 2, 3};
            c[42] = 99;

        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Array index out of bounds: " + e);
        } catch (ArithmeticException e) {
            System.out.println("Division by zero: " + e);
        } catch (Exception e) {
            System.out.println("Generic Exception: " + e);
        }
    }
}
