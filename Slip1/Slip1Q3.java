import java.util.Scanner;

class Person {
    int pid, age;
    String pname, gender;

    Person() {
        pid = 0;
        age = 0;
        pname = "Unknown";
        gender = "Unknown";
    }

    Person(int id, String name, int a, String g) {
        pid = id;
        pname = name;
        age = a;
        gender = g;
    }

    void display() {
        System.out.println(pid + "\t" + pname + "\t" + age + "\t" + gender);
    }
}

class Slip1Q3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Person p[] = new Person[5];

        for (int i = 0; i < 5; i++) {
            System.out.print("Enter ID, Name, Age, Gender: ");
            int id = sc.nextInt();
            String name = sc.next();
            int age = sc.nextInt();
            String gender = sc.next();

            p[i] = new Person(id, name, age, gender);
        }

        System.out.println("\nID\tName\tAge\tGender");

        for (int i = 0; i < 5; i++) {
            p[i].display();
        }

        sc.close();
    }
}