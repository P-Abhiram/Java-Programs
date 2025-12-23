class StaticDemo
{
    static int a=10;
    static int b=20;
    static void show()
    {
        System.out.println("a="+a);
    }

}
public class StaticByName {
    public static void main(String[] args) {
        StaticDemo.show();
        System.out.println("b="+StaticDemo.b);
    }
}
