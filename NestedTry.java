public class NestedTry {
    public static void main(String[] args) {
        try {
            try {
                int[] a= {1,2,3};
                System.out.println(a[1]);
            } catch (ArrayIndexOutOfBoundsException e) {
                System.out.println("Out of bounds");
            }
            System.out.println(4/2);
        } catch (ArithmeticException e) {
            System.out.println("ArthmeticException : divide by 0");
        }
    }
}
