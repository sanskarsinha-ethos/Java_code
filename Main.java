import java.util.*;

abstract class Geometry {
    abstract void collectData();
    abstract void calculateData();
    abstract void displayData();
    float area;
}

class Circle extends Geometry {
    float radius;
    final float pi = 3.14f;

    @Override
    void collectData() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter radius of circle: ");
        radius = sc.nextFloat();
    }

    @Override
    void calculateData() {
        area = pi * radius * radius;
    }

    @Override
    void displayData() {
        System.out.println("Area of Circle: " + area);
    }
}

class Square extends Geometry {
    float side;

    @Override
    void collectData() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter side of square: ");
        side = sc.nextFloat();
    }

    @Override
    void calculateData() {
        area = side * side;
    }

    @Override
    void displayData() {
        System.out.println("Area of Square: " + area);
    }
}

class Rectangle extends Geometry {
    float length, breadth;

    @Override
    void collectData() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter length of rectangle: ");
        length = sc.nextFloat();
        System.out.print("Enter breadth of rectangle: ");
        breadth = sc.nextFloat();
    }

    @Override
    void calculateData() {
        area = length * breadth;
    }

    @Override
    void displayData() {
        System.out.println("Area of Rectangle: " + area);
    }
}

public class Main {
    public static void main(String[] args) {
        Geometry shape;

        shape = new Circle();
        shape.collectData();
        shape.calculateData();
        shape.displayData();

        shape = new Square();
        shape.collectData();
        shape.calculateData();
        shape.displayData();

        shape = new Rectangle();
        shape.collectData();
        shape.calculateData();
        shape.displayData();
    }
}