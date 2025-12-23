import java.lang.Math;
import java.util.Scanner;
public class Sqrt
{
    public static void main(String[] args)
    {
        double num,res;
        Scanner in=new Scanner(System.in);
        System.out.println(x:"Enter real value to find square root");
        num=in.nextDouble();
        res=Math.sqrt(num);
        System.out.println("Square root is" +res);
    }
}
