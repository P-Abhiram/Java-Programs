import java.util.Scanner;
class SumOfNMeth {
    public static void main(String[] args) {
    int n,sum=0;
    Scanner s=new Scanner(System.in);
    System.out.println("Enter a Number");
    n = s.nextInt();
    sum = Naturalsum(n);
    System.out.println("Sum is "+sum);
    
}
static int Naturalsum(int x)
{
    int res=0;
    for (int i =1; i <=x; i++) {
        res=res+i;
    }
    return res;
}
}