import java.util.Scanner;
class MethodEx {
    public static void main(String[] args) 
    {
        int num ;
        long fact=0;
        Scanner s=new Scanner(System.in);
        System.out.println("Enter any +ve number >=0");
        num = s.nextInt();
        fact = factorial(num);
        System.out.println("Factorial is" +fact);

    }
    long factorial(int x)
    {
        long res;
        for(int i=1;i<=x;i++)
        {
            res=res*i;

        }
        return res;
    }

}
