import java.util.Scanner;

abstract class Shape {
    abstract void area();
    abstract void volume();
}

class Sphere extends Shape {
    double radius;

    Sphere(double r) {
        radius = r;
    }

    void area() {
        System.out.println("Area of Sphere = " +
                (4 * 3.142 * radius * radius));
    }

    void volume() {
        System.out.println("Volume of Sphere = " +
                (4.0 / 3 * 3.142 * radius * radius * radius));
    }
}

class Cylinder extends Shape {
    double radius, height;

    Cylinder(double r, double h) {
        radius = r;
        height = h;
    }

    void area() {
        System.out.println("Area of Cylinder = " +
                (2 * 3.142 * radius * (radius + height)));
    }

    void volume() {
        System.out.println("Volume of Cylinder = " +
                (3.142 * radius * radius * height));
    }
}

class Slip24Q2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Sphere Radius: ");
        double r1 = sc.nextDouble();

        Sphere s = new Sphere(r1);
        s.area();
        s.volume();

        System.out.print("\nEnter Cylinder Radius: ");
        double r2 = sc.nextDouble();

        System.out.print("Enter Cylinder Height: ");
        double h = sc.nextDouble();

        Cylinder c = new Cylinder(r2, h);
        c.area();
        c.volume();

        sc.close();
    }
}