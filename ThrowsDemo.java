public class ThrowsDemo {
    static void function1(int a) throws ArithmeticException
    {
        System.out.println(10/a);
    }
    public static void main(String[] args) {
        try {
            function1(10);
            function1(0);
        } catch (Exception e) {
            System.out.println("Cant divide by zero "+e);
        }

    }
}
