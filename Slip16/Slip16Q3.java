interface Operation {
    double PI = 3.142;

    void area();
    void volume();
}

class Circle implements Operation {
    double r = 5;

    public void area() {
        System.out.println("Area of Circle = " + (PI * r * r));
    }

    public void volume() {
        System.out.println("Volume is not applicable for Circle.");
    }
}

class Cylinder implements Operation {
    double r = 5, h = 10;

    public void area() {
        System.out.println("Area of Cylinder = " + (2 * PI * r * (r + h)));
    }

    public void volume() {
        System.out.println("Volume of Cylinder = " + (PI * r * r * h));
    }
}

class Slip16Q3 {
    public static void main(String[] args) {
        Circle c = new Circle();
        Cylinder cy = new Cylinder();

        c.area();
        c.volume();

        cy.area();
        cy.volume();
    }
}