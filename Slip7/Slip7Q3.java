import java.util.Scanner;

class Student {
    int rollno;
    String name;
    double percentage;

    Student() {
        rollno = 0;
        name = "Unknown";
        percentage = 0;
    }

    Student(int rollno, String name, double percentage) {
        this.rollno = rollno;
        this.name = name;
        this.percentage = percentage;
    }

    void display() {
        System.out.println(rollno + " " + name + " " + percentage);
    }
}

class Slip7Q3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Student s[] = new Student[5];

        for (int i = 0; i < 5; i++) {
            System.out.print("Enter rollno, name and percentage: ");
            int r = sc.nextInt();
            String n = sc.next();
            double p = sc.nextDouble();

            s[i] = new Student(r, n, p);
        }

        System.out.println("\nStudent Details:");
        for (int i = 0; i < 5; i++) {
            s[i].display();
        }
    }
}