import java.util.Scanner;

class Employee {
    int empcode;
    String empname;

    void accept(Scanner sc) {
        System.out.print("Enter Code and Name: ");
        empcode = sc.nextInt();
        empname = sc.next();
    }

    void display() {
        System.out.println("Code: " + empcode);
        System.out.println("Name: " + empname);
    }
}

class Manager extends Employee {
    String designation;
    int club_dues;

    void accept(Scanner sc) {
        super.accept(sc);
        System.out.print("Enter Designation and Club Dues: ");
        designation = sc.next();
        club_dues = sc.nextInt();
    }

    void display() {
        super.display();
        System.out.println("Designation: " + designation);
        System.out.println("Club Dues: " + club_dues);
    }
}

class Scientist extends Employee {
    String deptname;
    int publications;

    void accept(Scanner sc) {
        super.accept(sc);
        System.out.print("Enter Department and Publications: ");
        deptname = sc.next();
        publications = sc.nextInt();
    }

    void display() {
        super.display();
        System.out.println("Department: " + deptname);
        System.out.println("Publications: " + publications);
    }
}

class Slip5Q2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of employees: ");
        int n = sc.nextInt();

        Employee e[] = new Employee[n];

        for (int i = 0; i < n; i++) {
            System.out.print("1.Manager  2.Scientist: ");
            int ch = sc.nextInt();

            if (ch == 1) {
                e[i] = new Manager();
            } else {
                e[i] = new Scientist();
            }

            if (e[i] instanceof Manager)
                ((Manager)e[i]).accept(sc);
            else
                ((Scientist)e[i]).accept(sc);
        }

        System.out.println("\nEmployee Details:");
        for (int i = 0; i < n; i++) {
            e[i].display();
        }

        sc.close();
    }
}