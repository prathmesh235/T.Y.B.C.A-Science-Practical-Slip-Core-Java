import java.util.Scanner;

class Employee {
    int id;
    String name, department;
    double salary;

    Employee() {
        id = 0;
        name = "";
        department = "";
        salary = 0;
    }

    Employee(int id, String name, String department, double salary) {
        this.id = id;
        this.name = name;
        this.department = department;
        this.salary = salary;
    }

    void accept(Scanner sc) {
        System.out.print("Enter ID, Name, Department, Salary: ");
        id = sc.nextInt();
        name = sc.next();
        department = sc.next();
        salary = sc.nextDouble();
    }

    void display() {
        System.out.println("ID: " + id);
        System.out.println("Name: " + name);
        System.out.println("Department: " + department);
        System.out.println("Salary: " + salary);
    }
}

class Worker extends Employee {
    private double bonus;

    void accept(Scanner sc) {
        super.accept(sc);
        System.out.print("Enter Bonus: ");
        bonus = sc.nextDouble();
    }

    void display() {
        super.display();
        System.out.println("Bonus: " + bonus);
        System.out.println("Total Salary: " + (salary + bonus));
    }

    double totalSalary() {
        return salary + bonus;
    }
}

class Slip11Q3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of workers: ");
        int n = sc.nextInt();

        Worker w[] = new Worker[n];

        for (int i = 0; i < n; i++) {
            w[i] = new Worker();
            w[i].accept(sc);
        }

        int max = 0;

        for (int i = 1; i < n; i++) {
            if (w[i].totalSalary() > w[max].totalSalary()) {
                max = i;
            }
        }

        System.out.println("\nWorker having Maximum Total Salary:");
        w[max].display();
    }
}