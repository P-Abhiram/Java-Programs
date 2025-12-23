interface Shape {
    void getArea(); // Abstract method
    default void display()
    {
      System.out.println("this is interface demo");
    
     }
   static void mesg()
     {
      System.out.println("this is static method of interface ");
     }
}

class Circle implements Shape {
    private double radius;

     Circle(double radius) {
        this.radius = radius;
    }

    @Override //annotation
   public void getArea() {
        double area = Math.PI * radius * radius;
        System.out.println("Area of Circle: " + area);
    }
}

class Rectangle implements Shape {
    private double length;
    private double width;

     Rectangle(double length, double width) {
        this.length = length;
        this.width = width;
    }

    @Override
   public void getArea() {
        double area = length * width;
        System.out.println("Area of Rectangle: " + area);
    }
}

public class InterfaceDemo {
    public static void main(String[] args) 
   {
        Shape circle = new Circle(5);//upcasting
        Shape rectangle = new Rectangle(4, 6);
        circle.display();//calling default method of interface
        circle.getArea();
          rectangle.display();//calling default method of interface
        rectangle.getArea();
        circle.display();
         Shape.mesg();//calling static method of interface
     
            }
}