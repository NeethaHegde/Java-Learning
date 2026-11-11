

class Shape {
    double calculateArea() {
        return 0;
    }
}

class Circle extends Shape {
    double radius;

    @Override
    double calculateArea() {
        return 3.14 * radius * radius;
    }
}

class Rectangle extends Shape {
    double length, breadth;

    @Override
    double calculateArea() {
        return length * breadth;
    }
}

class Triangle extends Shape {
    double base, height;

    @Override
    double calculateArea() {
        return 0.5 * base * height;
    }
}

public class ShapeCalculation {
    public static void main(String[] args) {

        Circle c = new Circle();
        c.radius = 5;
        System.out.println("Circle: "+c.calculateArea());

        Rectangle r = new Rectangle();
        r.length = 10;
        r.breadth = 5;
        System.out.println("Rectangle Area: "+r.calculateArea());

        Triangle t = new Triangle();
        t.base = 8;
        t.height = 4;
        System.out.println("Triangle Area: "+t.calculateArea());
    }
}
