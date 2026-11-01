import java.util.Scanner;

interface Operation {
    double PI = 3.142;

    void area();
    void volume();
}

class Circle implements Operation {
    double radius;

    Circle(double r) {
        radius = r;
    }

    public void area() {
        System.out.println("Area of Circle = " + (PI * radius * radius));
    }

    public void volume() {
        System.out.println("Volume of Circle = Not Applicable");
    }
}

class Cylinder implements Operation {
    double radius, height;

    Cylinder(double r, double h) {
        radius = r;
        height = h;
    }

    public void area() {
        System.out.println("Area of Cylinder = " +
                (2 * PI * radius * (radius + height)));
    }

    public void volume() {
        System.out.println("Volume of Cylinder = " +
                (PI * radius * radius * height));
    }
}

class Slip21Q3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Circle Radius: ");
        double r1 = sc.nextDouble();

        Circle c = new Circle(r1);
        c.area();
        c.volume();

        System.out.print("\nEnter Cylinder Radius: ");
        double r2 = sc.nextDouble();

        System.out.print("Enter Cylinder Height: ");
        double h = sc.nextDouble();

        Cylinder cy = new Cylinder(r2, h);
        cy.area();
        cy.volume();

        sc.close();
    }
}