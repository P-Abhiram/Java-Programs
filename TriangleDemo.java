class Triangle
{
//instance variables
double base;
double height;
// method returns area of triangle
 double area()
{
 return (0.5*base *height);
}
}
public class TriangleDemo
{
 public static void main(String[]args)
{
 Triangle t1=new Triangle();
 Triangle t2=new Triangle();
 t1.base=5;
 t1.height=8;
 t2.base=13;
 t2.height=8;
 double res;
 res=t1.area();
 System.out.println("area of T1 is"+res);
 res=t2.area();
 System.out.println("area of T2 is"+res);
}
}
