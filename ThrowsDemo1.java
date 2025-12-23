import java.util.Scanner;
public class ThrowsDemo1 {
    static void func(int a, int b) throws  ArithmeticException , ArrayIndexOutOfBoundsException
    {
        System.out.println(10/a);
        int[] arr={1,2,3};
        System.out.println(arr[b]);
    }
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        try {
            func(in.nextInt(),in.nextInt());
        } catch (ArithmeticException e) {
            System.out.println("Cant divide by zero");
        }catch(ArrayIndexOutOfBoundsException e){
            System.out.println("Out of bounds!");
        }
    }
}
  