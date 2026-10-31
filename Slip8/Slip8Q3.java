import java.util.Scanner;

class Customer {
    int cid;
    String cname;
    double billAmount;

    void accept(Scanner sc) {
        System.out.print("Enter ID, Name and Bill Amount: ");
        cid = sc.nextInt();
        cname = sc.next();
        billAmount = sc.nextDouble();
    }

    void display() {
        System.out.println(cid + " " + cname + " " + billAmount);
    }
}

class Slip8Q3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of customers: ");
        int n = sc.nextInt();

        Customer c[] = new Customer[n];

        for (int i = 0; i < n; i++) {
            c[i] = new Customer();
            c[i].accept(sc);
        }

        // Sort in ascending order
        for (int i = 0; i < n - 1; i++) {
            for (int j = i + 1; j < n; j++) {
                if (c[i].billAmount > c[j].billAmount) {
                    Customer temp = c[i];
                    c[i] = c[j];
                    c[j] = temp;
                }
            }
        }

        System.out.println("\nCustomers sorted by Bill Amount:");
        for (int i = 0; i < n; i++) {
            c[i].display();
        }
    }
}