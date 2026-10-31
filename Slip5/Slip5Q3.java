import java.util.Scanner;

abstract class Shape {
    abstract void area();
    abstract void volume();
}

class Sphere extends Shape {
    double r;

    Sphere(double r) {
        this.r = r;
    }

    void area() {
        System.out.println("Sphere Area = " + (4 * 3.14 * r * r));
    }

    void volume() {
        System.out.println("Sphere Volume = " + (4.0 / 3 * 3.14 * r * r * r));
    }
}

class Cylinder extends Shape {
    double r, h;

    Cylinder(double r, double h) {
        this.r = r;
        this.h = h;
    }

    void area() {
        System.out.println("Cylinder Area = " + (2 * 3.14 * r * (r + h)));
    }

    void volume() {
        System.out.println("Cylinder Volume = " + (3.14 * r * r * h));
    }
}

class Slip5Q3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Sphere radius: ");
        double r = sc.nextDouble();

        Sphere s = new Sphere(r);
        s.area();
        s.volume();

        System.out.print("\nEnter Cylinder radius and height: ");
        r = sc.nextDouble();
        double h = sc.nextDouble();

        Cylinder c = new Cylinder(r, h);
        c.area();
        c.volume();

        sc.close();
    }
}