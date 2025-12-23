class Shape {

    double area(double radius) {
        return Math.PI * radius * radius;
    }
    double area(double length, double breadth) {
        return length * breadth;
    }
}
class Triangle extends Shape {

    
    @Override
    double area(double base, double height) {
        return 0.5 * base * height;
    }
}

public class Main {
    public static void main(String[] args) {
        Shape s = new Shape();
        Triangle t = new Triangle();

        double circleArea = s.area(5);            
        double rectangleArea = s.area(6, 4);       
        double triangleArea = t.area(8, 5);       

        System.out.println("Area of Circle: " + circleArea);
        System.out.println("Area of Rectangle: " + rectangleArea);
        System.out.println("Area of Triangle: " + triangleArea);
    }
}
