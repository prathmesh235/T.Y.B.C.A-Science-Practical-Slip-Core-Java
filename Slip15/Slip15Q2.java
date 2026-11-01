import java.util.Scanner;

interface Shape {
    void area();
    void volume();
}

class Circle implements Shape {
    double radius;

    Circle(double radius) {
        this.radius = radius;
    }

    public void area() {
        System.out.println("Area of Circle = " + (3.14 * radius * radius));
    }

    public void volume() {
        System.out.println("Volume of Circle = Not Applicable");
    }
}

class Cylinder implements Shape {
    double radius, height;

    Cylinder(double radius, double height) {
        this.radius = radius;
        this.height = height;
    }

    public void area() {
        System.out.println("Area of Cylinder = " +
                (2 * 3.14 * radius * (radius + height)));
    }

    public void volume() {
        System.out.println("Volume of Cylinder = " +
                (3.14 * radius * radius * height));
    }
}

class Slip15Q2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter radius: ");
        double r = sc.nextDouble();

        System.out.print("Enter height: ");
        double h = sc.nextDouble();

        Circle c = new Circle(r);
        Cylinder cy = new Cylinder(r, h);

        c.area();
        c.volume();

        cy.area();
        cy.volume();
    }
}