import java.util.Scanner;

interface Shape {
    void area();
}

class Rectangle implements Shape {
    double length, breadth;

    Rectangle(double l, double b) {
        length = l;
        breadth = b;
    }

    public void area() {
        System.out.println("Rectangle Area = " + (length * breadth));
    }
}

class Square extends Rectangle {
    Square(double side) {
        super(side, side);
    }

    public void area() {
        System.out.println("Square Area = " + (length * breadth));
    }
}

class Circle implements Shape {
    double radius;

    Circle(double r) {
        radius = r;
    }

    public void area() {
        System.out.println("Circle Area = " + (3.14 * radius * radius));
    }
}

class Slip2Q2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter square side: ");
        double s = sc.nextDouble();

        System.out.print("Enter rectangle length and breadth: ");
        double l = sc.nextDouble();
        double b = sc.nextDouble();

        System.out.print("Enter circle radius: ");
        double r = sc.nextDouble();

        Square sq = new Square(s);
        Rectangle rec = new Rectangle(l, b);
        Circle c = new Circle(r);

        sq.area();
        rec.area();
        c.area();

        sc.close();
    }
}