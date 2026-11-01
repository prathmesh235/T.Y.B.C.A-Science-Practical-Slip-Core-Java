import java.util.Scanner;

class Product {
    int id;
    String name;
    double price;

    void accept(Scanner sc) {
        System.out.print("Enter Product ID: ");
        id = sc.nextInt();

        System.out.print("Enter Product Name: ");
        name = sc.next();

        System.out.print("Enter Product Price: ");
        price = sc.nextDouble();
    }

    void display() {
        System.out.println("Product Name: " + name);
        System.out.println("Minimum Price: " + price);
    }
}

class Slip21Q2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Product p[] = new Product[5];

        for (int i = 0; i < 5; i++) {
            System.out.println("\nEnter Product " + (i + 1) + " Details:");
            p[i] = new Product();
            p[i].accept(sc);
        }

        int min = 0;

        for (int i = 1; i < 5; i++) {
            if (p[i].price < p[min].price) {
                min = i;
            }
        }

        System.out.println("\nProduct Having Minimum Price:");
        p[min].display();

        sc.close();
    }
}