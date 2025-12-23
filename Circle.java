class Circle {
    double radius;

    void area() {
        System.out.println("Area is " + (3.14 * radius * radius));
    }

    void perimeter() {
        System.out.println("Perimeter is " + (2 * 3.14 * radius));
    }
}

class CircleDemo {
    public static void main(String[] args) {
        Circle c1 = new Circle();
        c1.radius = 5; // Assign a radius value
        c1.area();
        c1.perimeter();
    }
}
