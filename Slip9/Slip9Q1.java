import java.util.Scanner;

class Circle {
    double r;

    Circle(double r) {
        this.r = r;
    }

    void area() {
        System.out.println("Area of Circle = " + (3.14 * r * r));
    }
}

class Cylinder extends Circle {
    double h;

    Cylinder(double r, double h) {
        super(r);
        this.h = h;
    }

    void area() {
        super.area();
        System.out.println("Area of Cylinder = " +
                           (2 * 3.14 * r * (r + h)));
    }
}

class Slip9Q1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter radius: ");
        double r = sc.nextDouble();

        System.out.print("Enter height: ");
        double h = sc.nextDouble();

        Cylinder c = new Cylinder(r, h);
        c.area();
    }
}