# Savitribai Phule Pune University (SPPU)
## TYBCA Semester - V (CA-321 VSEC: Core JAVA Programming)
### Master Practical Solutions Manual (Slips 1 to 25)

---

## Slip 1

### Q.1) Write a Java program to find addition of Two Numbers using Command Line Arguments. [10 Marks]
```java
public class Slip1_Q1 {
    public static void main(String[] args) {
        if (args.length < 2) {
            System.out.println("Please provide two numbers as command line arguments.");
            System.out.println("Usage: java Slip1_Q1 <num1> <num2>");
            return;
        }
        try {
            int num1 = Integer.parseInt(args[0]);
            int num2 = Integer.parseInt(args[1]);
            int sum = num1 + num2;
            System.out.println("Addition of " + num1 + " and " + num2 + " is: " + sum);
        } catch (NumberFormatException e) {
            System.out.println("Error: Please provide valid integers as arguments.");
        }
    }
}
```

### Q.2) Write a Java program to define a class Book with data members bookId, bookName, and price. Store details of 5 books using an array of objects and display it. [20 Marks]
```java
import java.util.Scanner;

class Book {
    int bookId;
    String bookName;
    double price;

    void accept(Scanner sc) {
        System.out.print("Enter Book ID: ");
        bookId = sc.nextInt();
        sc.nextLine(); // consume newline
        System.out.print("Enter Book Name: ");
        bookName = sc.nextLine();
        System.out.print("Enter Price: ");
        price = sc.nextDouble();
    }

    void display() {
        System.out.printf("%-10d %-25s %-10.2f\n", bookId, bookName, price);
    }
}

public class Slip1_Q2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Book[] books = new Book[5];

        System.out.println("--- Enter Details of 5 Books ---");
        for (int i = 0; i < 5; i++) {
            System.out.println("\nBook " + (i + 1) + ":");
            books[i] = new Book();
            books[i].accept(sc);
        }

        System.out.println("\n----------------- Book Details -----------------");
        System.out.printf("%-10s %-25s %-10s\n", "Book ID", "Book Name", "Price");
        System.out.println("------------------------------------------------");
        for (Book b : books) {
            b.display();
        }
        sc.close();
    }
}
```

### OR Q.2) Write a Java program to define a class Person (pid, pname, age, gender). Define default and parameterized constructor. Overload the constructor. Accept the 5 person details and display it. (use this keyword). [20 Marks]
```java
import java.util.Scanner;

class Person {
    int pid;
    String pname;
    int age;
    String gender;

    // Default Constructor
    Person() {
        this(0, "Not Assigned", 0, "Unknown");
    }

    // Parameterized Constructor
    Person(int pid, String pname, int age, String gender) {
        this.pid = pid;
        this.pname = pname;
        this.age = age;
        this.gender = gender;
    }

    void display() {
        System.out.println("ID: " + this.pid + " | Name: " + this.pname + 
                           " | Age: " + this.age + " | Gender: " + this.gender);
    }
}

public class Slip1_Q2_OR {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Person[] persons = new Person[5];

        for (int i = 0; i < 5; i++) {
            System.out.println("\nEnter details for Person " + (i + 1) + ":");
            System.out.print("Enter Person ID: ");
            int id = sc.nextInt();
            sc.nextLine();
            System.out.print("Enter Name: ");
            String name = sc.nextLine();
            System.out.print("Enter Age: ");
            int age = sc.nextInt();
            System.out.print("Enter Gender: ");
            String gender = sc.next();

            persons[i] = new Person(id, name, age, gender);
        }

        System.out.println("\n--- Person Records ---");
        for (Person p : persons) {
            p.display();
        }
        sc.close();
    }
}
```

---

## Slip 2

### Q.1) Write a Java program to accept n names of cities from user and display them in descending order. [10 Marks]
```java
import java.util.Scanner;
import java.util.Arrays;
import java.util.Collections;

public class Slip2_Q1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of cities (n): ");
        int n = sc.nextInt();
        sc.nextLine();

        String[] cities = new String[n];
        for (int i = 0; i < n; i++) {
            System.out.print("Enter city " + (i + 1) + ": ");
            cities[i] = sc.nextLine();
        }

        Arrays.sort(cities, Collections.reverseOrder());

        System.out.println("\nCities in Descending Order:");
        for (String city : cities) {
            System.out.println(city);
        }
        sc.close();
    }
}
```

### Q.2) Write a Java program to derive a class Square from class Rectangle. Create one more class Circle. Create an interface with only one method called area(). Implement this interface in all classes. Include appropriate data members and constructors. Accept details of Square, Circle & Rectangle and display the area. [20 Marks]
```java
import java.util.Scanner;

interface ShapeArea {
    void area();
}

class Rectangle implements ShapeArea {
    double length, breadth;

    Rectangle(double length, double breadth) {
        this.length = length;
        this.breadth = breadth;
    }

    public void area() {
        System.out.println("Area of Rectangle: " + (length * breadth));
    }
}

class Square extends Rectangle {
    Square(double side) {
        super(side, side);
    }

    @Override
    public void area() {
        System.out.println("Area of Square: " + (length * length));
    }
}

class Circle implements ShapeArea {
    double radius;

    Circle(double radius) {
        this.radius = radius;
    }

    public void area() {
        System.out.println("Area of Circle: " + (Math.PI * radius * radius));
    }
}

public class Slip2_Q2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter length and breadth of Rectangle: ");
        double l = sc.nextDouble();
        double b = sc.nextDouble();
        Rectangle rect = new Rectangle(l, b);

        System.out.print("Enter side of Square: ");
        double side = sc.nextDouble();
        Square sq = new Square(side);

        System.out.print("Enter radius of Circle: ");
        double r = sc.nextDouble();
        Circle circ = new Circle(r);

        System.out.println("\n--- Areas ---");
        rect.area();
        sq.area();
        circ.area();
        sc.close();
    }
}
```

### OR Q.2) Write a Java program to create a Hash table containing Employee name and Salary. Display the details of the hash table. Also search for a specific Employee and display Salary of that Employee. [20 Marks]
```java
import java.util.Hashtable;
import java.util.Map;
import java.util.Scanner;

public class Slip2_Q2_OR {
    public static void main(String[] args) {
        Hashtable<String, Double> empTable = new Hashtable<>();
        Scanner sc = new Scanner(System.in);

        empTable.put("Rohan", 55000.0);
        empTable.put("Pooja", 72000.0);
        empTable.put("Amit", 48000.0);
        empTable.put("Sneha", 63000.0);

        System.out.println("--- Employee Hashtable Contents ---");
        for (Map.Entry<String, Double> entry : empTable.entrySet()) {
            System.out.println("Employee: " + entry.getKey() + " | Salary: Rs. " + entry.getValue());
        }

        System.out.print("\nEnter Employee Name to search: ");
        String searchName = sc.next();

        if (empTable.containsKey(searchName)) {
            System.out.println("Employee Found! " + searchName + "'s Salary: Rs. " + empTable.get(searchName));
        } else {
            System.out.println("Employee '" + searchName + "' not found in records.");
        }
        sc.close();
    }
}
```

---

## Slip 3

### Q.1) Write a Java program to create a simple applet that displays a message. [10 Marks]
```java
import java.applet.Applet;
import java.awt.Graphics;
import java.awt.Color;
import java.awt.Font;

/*
<applet code="Slip3_Q1.class" width="400" height="200">
</applet>
*/

public class Slip3_Q1 extends Applet {
    public void paint(Graphics g) {
        g.setColor(Color.BLUE);
        g.setFont(new Font("Arial", Font.BOLD, 18));
        g.drawString("Welcome to Core Java Practical (TYBCA)!", 30, 100);
    }
}
```

### Q.2) Write a Java Program which define class Employee with data member as id, name and salary. Store the information of n employees and display the name of employee having maximum salary (Use array of object). [20 Marks]
```java
import java.util.Scanner;

class Employee {
    int id;
    String name;
    double salary;

    Employee(int id, String name, double salary) {
        this.id = id;
        this.name = name;
        this.salary = salary;
    }
}

public class Slip3_Q2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of employees: ");
        int n = sc.nextInt();

        Employee[] empList = new Employee[n];

        for (int i = 0; i < n; i++) {
            System.out.println("\nEnter details for employee " + (i + 1) + ":");
            System.out.print("ID: ");
            int id = sc.nextInt();
            sc.nextLine();
            System.out.print("Name: ");
            String name = sc.nextLine();
            System.out.print("Salary: ");
            double salary = sc.nextDouble();

            empList[i] = new Employee(id, name, salary);
        }

        Employee maxEmp = empList[0];
        for (int i = 1; i < n; i++) {
            if (empList[i].salary > maxEmp.salary) {
                maxEmp = empList[i];
            }
        }

        System.out.println("\nEmployee with Maximum Salary:");
        System.out.println("Name: " + maxEmp.name + " | Salary: Rs. " + maxEmp.salary);
        sc.close();
    }
}
```

### OR Q.2) Write a Java program to define an abstract class Staff with members name and address. Define two sub-classes: FullTimeStaff (dept, salary, hra 8%, da 5%) and PartTimeStaff (number-of-hours, rate-per-hour). Define abstract method calculateSalary() in Staff class. Create n objects by asking user choice and display details with salary. [20 Marks]
```java
import java.util.Scanner;

abstract class Staff {
    String name, address;

    Staff(String name, String address) {
        this.name = name;
        this.address = address;
    }

    abstract double calculateSalary();
    abstract void display();
}

class FullTimeStaff extends Staff {
    String department;
    double basicSalary;

    FullTimeStaff(String name, String address, String department, double basicSalary) {
        super(name, address);
        this.department = department;
        this.basicSalary = basicSalary;
    }

    double calculateSalary() {
        double hra = 0.08 * basicSalary;
        double da = 0.05 * basicSalary;
        return basicSalary + hra + da;
    }

    void display() {
        System.out.println("Full-Time Staff | Name: " + name + " | Addr: " + address +
                           " | Dept: " + department + " | Net Salary: Rs. " + calculateSalary());
    }
}

class PartTimeStaff extends Staff {
    int numberOfHours;
    double ratePerHour;

    PartTimeStaff(String name, String address, int numberOfHours, double ratePerHour) {
        super(name, address);
        this.numberOfHours = numberOfHours;
        this.ratePerHour = ratePerHour;
    }

    double calculateSalary() {
        return numberOfHours * ratePerHour;
    }

    void display() {
        System.out.println("Part-Time Staff | Name: " + name + " | Addr: " + address +
                           " | Hours: " + numberOfHours + " | Net Salary: Rs. " + calculateSalary());
    }
}

public class Slip3_Q2_OR {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter total number of staff: ");
        int n = sc.nextInt();

        Staff[] list = new Staff[n];

        for (int i = 0; i < n; i++) {
            System.out.print("\nSelect Type for Staff " + (i + 1) + " (1: FullTime, 2: PartTime): ");
            int ch = sc.nextInt();
            sc.nextLine();
            System.out.print("Enter Name: ");
            String name = sc.nextLine();
            System.out.print("Enter Address: ");
            String addr = sc.nextLine();

            if (ch == 1) {
                System.out.print("Enter Department: ");
                String dept = sc.nextLine();
                System.out.print("Enter Basic Salary: ");
                double sal = sc.nextDouble();
                list[i] = new FullTimeStaff(name, addr, dept, sal);
            } else {
                System.out.print("Enter Working Hours: ");
                int hours = sc.nextInt();
                System.out.print("Enter Rate Per Hour: ");
                double rate = sc.nextDouble();
                list[i] = new PartTimeStaff(name, addr, hours, rate);
            }
        }

        System.out.println("\n--- All Staff Details ---");
        for (Staff s : list) {
            s.display();
        }
        sc.close();
    }
}
```

---

## Slip 4

### Q.1) Write a Java program to check whether a given number is Positive or negative. [10 Marks]
```java
import java.util.Scanner;

public class Slip4_Q1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter an integer number: ");
        int num = sc.nextInt();

        if (num > 0) {
            System.out.println(num + " is a Positive Number.");
        } else if (num < 0) {
            System.out.println(num + " is a Negative Number.");
        } else {
            System.out.println("The number is Zero.");
        }
        sc.close();
    }
}
```

### Q.2) Write a Java program to define a class CricketPlayer (name, no_of_innings, no_of_times_notout, total_runs, bat_avg). Create an array of 'n' player objects. Calculate batting average using static method avg(). Handle exception while calculating. Define static method sortPlayer() to sort based on average. [20 Marks]
```java
import java.util.Scanner;
import java.util.Arrays;

class CricketPlayer {
    String name;
    int no_of_innings;
    int no_of_times_notout;
    int total_runs;
    double bat_avg;

    CricketPlayer(String name, int innings, int notout, int runs) {
        this.name = name;
        this.no_of_innings = innings;
        this.no_of_times_notout = notout;
        this.total_runs = runs;
        this.bat_avg = avg(runs, innings, notout);
    }

    static double avg(int runs, int innings, int notout) {
        try {
            int dismissals = innings - notout;
            if (dismissals == 0) {
                return runs; // player remained not out
            }
            return (double) runs / dismissals;
        } catch (ArithmeticException e) {
            System.out.println("Math error while calculating batting average!");
            return 0.0;
        }
    }

    static void sortPlayer(CricketPlayer[] players) {
        Arrays.sort(players, (p1, p2) -> Double.compare(p2.bat_avg, p1.bat_avg));
    }

    void display() {
        System.out.printf("%-15s %-10d %-10d %-10d %-10.2f\n", 
                          name, no_of_innings, no_of_times_notout, total_runs, bat_avg);
    }
}

public class Slip4_Q2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of players (n): ");
        int n = sc.nextInt();

        CricketPlayer[] players = new CricketPlayer[n];

        for (int i = 0; i < n; i++) {
            System.out.println("\nEnter player " + (i + 1) + " details:");
            System.out.print("Name: ");
            String name = sc.next();
            System.out.print("Innings: ");
            int inn = sc.nextInt();
            System.out.print("Times Not Out: ");
            int no = sc.nextInt();
            System.out.print("Total Runs: ");
            int runs = sc.nextInt();

            players[i] = new CricketPlayer(name, inn, no, runs);
        }

        CricketPlayer.sortPlayer(players);

        System.out.println("\n---------------- Player Ranking (By Average) ----------------");
        System.out.printf("%-15s %-10s %-10s %-10s %-10s\n", "Name", "Innings", "NotOut", "Runs", "Average");
        System.out.println("-------------------------------------------------------------");
        for (CricketPlayer p : players) {
            p.display();
        }
        sc.close();
    }
}
```

### OR Q.2) Write a package for String operation which has two classes Con and Comp. Con class concatenates two strings, and Comp class compares two strings. Display proper message on execution. [20 Marks]
```java
// File 1: StringOp/Con.java
package StringOp;

public class Con {
    public static String concatenate(String s1, String s2) {
        return s1 + s2;
    }
}

// File 2: StringOp/Comp.java
package StringOp;

public class Comp {
    public static boolean compareStrings(String s1, String s2) {
        return s1.equals(s2);
    }
}

// File 3: Slip4_Q2_OR.java
import StringOp.Con;
import StringOp.Comp;
import java.util.Scanner;

public class Slip4_Q2_OR {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter String 1: ");
        String str1 = sc.nextLine();
        System.out.print("Enter String 2: ");
        String str2 = sc.nextLine();

        // Testing Con class
        String joined = Con.concatenate(str1, str2);
        System.out.println("Concatenated Output: " + joined);

        // Testing Comp class
        boolean isEqual = Comp.compareStrings(str1, str2);
        if (isEqual) {
            System.out.println("Comparison: Both strings are exactly identical.");
        } else {
            System.out.println("Comparison: Strings are NOT identical.");
        }
        sc.close();
    }
}
```

---

## Slip 5

### Q.1) Write a Java program to display the contents of a file in reverse order. [10 Marks]
```java
import java.io.FileReader;
import java.io.IOException;

public class Slip5_Q1 {
    public static void main(String[] args) {
        String filename = "sample.txt";
        StringBuilder content = new StringBuilder();

        try (FileReader fr = new FileReader(filename)) {
            int ch;
            while ((ch = fr.read()) != -1) {
                content.append((char) ch);
            }
            System.out.println("--- Reversed File Content ---");
            System.out.println(content.reverse().toString());
        } catch (IOException e) {
            System.out.println("File Error: " + e.getMessage());
        }
    }
}
```

### Q.2) Write a Java program to create base class Employee (empcode, empname). Derive Manager (designation, club_dues) and Scientist (deptname, publications). Accept details of n employees and display. [20 Marks]
```java
import java.util.Scanner;

class Employee {
    int empcode;
    String empname;

    Employee(int code, String name) {
        empcode = code;
        empname = name;
    }
}

class Manager extends Employee {
    String designation;
    double club_dues;

    Manager(int code, String name, String desig, double dues) {
        super(code, name);
        this.designation = desig;
        this.club_dues = dues;
    }

    void display() {
        System.out.println("Manager [Code: " + empcode + ", Name: " + empname + 
                           ", Desig: " + designation + ", Club Dues: Rs. " + club_dues + "]");
    }
}

class Scientist extends Employee {
    String deptname;
    int publications;

    Scientist(int code, String name, String dept, int pubs) {
        super(code, name);
        this.deptname = dept;
        this.publications = pubs;
    }

    void display() {
        System.out.println("Scientist [Code: " + empcode + ", Name: " + empname + 
                           ", Dept: " + deptname + ", Publications: " + publications + "]");
    }
}

public class Slip5_Q2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of Managers: ");
        int mCount = sc.nextInt();
        Manager[] managers = new Manager[mCount];
        for (int i = 0; i < mCount; i++) {
            System.out.print("Code, Name, Designation, Club Dues: ");
            managers[i] = new Manager(sc.nextInt(), sc.next(), sc.next(), sc.nextDouble());
        }

        System.out.print("\nEnter number of Scientists: ");
        int sCount = sc.nextInt();
        Scientist[] scientists = new Scientist[sCount];
        for (int i = 0; i < sCount; i++) {
            System.out.print("Code, Name, Dept, Publications: ");
            scientists[i] = new Scientist(sc.nextInt(), sc.next(), sc.next(), sc.nextInt());
        }

        System.out.println("\n--- Manager Details ---");
        for (Manager m : managers) m.display();

        System.out.println("\n--- Scientist Details ---");
        for (Scientist s : scientists) s.display();
        sc.close();
    }
}
```

### OR Q.2) Write a Java program to create an abstract class Shape with methods area & volume. Derive Sphere (radius) and Cylinder (radius, height). Calculate area and volume. (Use Method Overriding). [20 Marks]
```java
abstract class Shape {
    abstract double area();
    abstract double volume();
}

class Sphere extends Shape {
    double radius;

    Sphere(double r) {
        radius = r;
    }

    @Override
    double area() {
        return 4 * Math.PI * radius * radius;
    }

    @Override
    double volume() {
        return (4.0 / 3.0) * Math.PI * Math.pow(radius, 3);
    }
}

class Cylinder extends Shape {
    double radius, height;

    Cylinder(double r, double h) {
        radius = r;
        height = h;
    }

    @Override
    double area() {
        return (2 * Math.PI * radius * height) + (2 * Math.PI * radius * radius);
    }

    @Override
    double volume() {
        return Math.PI * radius * radius * height;
    }
}

public class Slip5_Q2_OR {
    public static void main(String[] args) {
        Shape sp = new Sphere(5.0);
        System.out.println("--- Sphere ---");
        System.out.printf("Surface Area: %.2f\n", sp.area());
        System.out.printf("Volume: %.2f\n", sp.volume());

        Shape cy = new Cylinder(4.0, 10.0);
        System.out.println("\n--- Cylinder ---");
        System.out.printf("Total Surface Area: %.2f\n", cy.area());
        System.out.printf("Volume: %.2f\n", cy.volume());
    }
}
```

---

## Slip 6

### Q.1) Accept username and password; if not same, generate user-defined exception "Incorrect Password Exception". [10 Marks]
```java
import java.util.Scanner;

class IncorrectPasswordException extends Exception {
    public IncorrectPasswordException(String message) {
        super(message);
    }
}

public class Slip6_Q1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Username: ");
        String username = sc.nextLine();
        System.out.print("Enter Password: ");
        String password = sc.nextLine();

        try {
            if (!username.equals(password)) {
                throw new IncorrectPasswordException("Incorrect Password Exception: Username and Password do not match!");
            }
            System.out.println("Authentication Successful!");
        } catch (IncorrectPasswordException e) {
            System.out.println("Login Failed: " + e.getMessage());
        } finally {
            sc.close();
        }
    }
}
```

### Q.2) Create a package named Series having three different classes to print series: a. Fibonacci series b. Cube of numbers c. Square of numbers. Generate "n" terms. [20 Marks]
```java
// File 1: Series/Fibonacci.java
package Series;

public class Fibonacci {
    public static void printSeries(int n) {
        int a = 0, b = 1;
        System.out.print("Fibonacci (" + n + " terms): ");
        for (int i = 1; i <= n; i++) {
            System.out.print(a + " ");
            int next = a + b;
            a = b;
            b = next;
        }
        System.out.println();
    }
}

// File 2: Series/Cube.java
package Series;

public class Cube {
    public static void printSeries(int n) {
        System.out.print("Cubes: ");
        for (int i = 1; i <= n; i++) {
            System.out.print((i * i * i) + " ");
        }
        System.out.println();
    }
}

// File 3: Series/Square.java
package Series;

public class Square {
    public static void printSeries(int n) {
        System.out.print("Squares: ");
        for (int i = 1; i <= n; i++) {
            System.out.print((i * i) + " ");
        }
        System.out.println();
    }
}

// File 4: Slip6_Q2.java
import Series.Fibonacci;
import Series.Cube;
import Series.Square;
import java.util.Scanner;

public class Slip6_Q2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of terms (n): ");
        int n = sc.nextInt();

        Fibonacci.printSeries(n);
        Cube.printSeries(n);
        Square.printSeries(n);
        sc.close();
    }
}
```

### OR Q.2) Write a Java program that displays the number of characters, lines, and words of a file. [20 Marks]
```java
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Slip6_Q2_OR {
    public static void main(String[] args) {
        String filename = "sample.txt";
        int lineCount = 0;
        int wordCount = 0;
        int charCount = 0;

        try (BufferedReader br = new BufferedReader(new FileReader(filename))) {
            String line;
            while ((line = br.readLine()) != null) {
                lineCount++;
                charCount += line.length();
                String[] words = line.trim().split("\\s+");
                if (words.length > 0 && !words[0].isEmpty()) {
                    wordCount += words.length;
                }
            }
            System.out.println("File Statistics for: " + filename);
            System.out.println("Total Lines: " + lineCount);
            System.out.println("Total Words: " + wordCount);
            System.out.println("Total Characters: " + charCount);
        } catch (IOException e) {
            System.out.println("Error reading file: " + e.getMessage());
        }
    }
}
```

---

## Slip 7

### Q.1) Write a package game which will have 2 classes Indoor & Outdoor. Use a function display() to generate the list of players for the specific game. Use default & parameterized constructor. [10 Marks]
```java
// File 1: game/Indoor.java
package game;

public class Indoor {
    String player;
    public Indoor() { this.player = "Default Indoor Player"; }
    public Indoor(String player) { this.player = player; }
    public void display() { System.out.println("Indoor Player: " + player); }
}

// File 2: game/Outdoor.java
package game;

public class Outdoor {
    String player;
    public Outdoor() { this.player = "Default Outdoor Player"; }
    public Outdoor(String player) { this.player = player; }
    public void display() { System.out.println("Outdoor Player: " + player); }
}

// File 3: Slip7_Q1.java
import game.Indoor;
import game.Outdoor;

public class Slip7_Q1 {
    public static void main(String[] args) {
        Indoor p1 = new Indoor("Vishwanathan Anand (Chess)");
        Outdoor p2 = new Outdoor("Virat Kohli (Cricket)");
        p1.display();
        p2.display();
    }
}
```

### Q.2) Define class MyDate (day, month, year) with methods to accept & display. Throw user defined exception "InvalidDateException" if date is invalid. (e.g. 12 15 2015, 31 6 1990, 29 2 2001). [20 Marks]
```java
import java.util.Scanner;

class InvalidDateException extends Exception {
    InvalidDateException(String msg) { super(msg); }
}

class MyDate {
    int day, month, year;

    void acceptAndValidate(int d, int m, int y) throws InvalidDateException {
        if (m < 1 || m > 12) {
            throw new InvalidDateException("Invalid Month: " + m);
        }
        int[] daysInMonth = {0, 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
        boolean isLeap = (y % 4 == 0 && y % 100 != 0) || (y % 400 == 0);
        if (isLeap) daysInMonth[2] = 29;

        if (d < 1 || d > daysInMonth[m]) {
            throw new InvalidDateException("Invalid Day " + d + " for Month " + m + ", Year " + y);
        }

        this.day = d;
        this.month = m;
        this.year = y;
    }

    void display() {
        System.out.println("Valid Date: " + day + "/" + month + "/" + year);
    }
}

public class Slip7_Q2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Date (dd mm yyyy): ");
        int d = sc.nextInt();
        int m = sc.nextInt();
        int y = sc.nextInt();

        MyDate date = new MyDate();
        try {
            date.acceptAndValidate(d, m, y);
            date.display();
        } catch (InvalidDateException e) {
            System.out.println("Date Error: " + e.getMessage());
        }
        sc.close();
    }
}
```

### OR Q.2) Write a Java program to define a class Student having rollno, name and percentage. Define Default and parameterized constructor. Overload constructor. Accept 5 student details and display. (use this keyword). [20 Marks]
```java
import java.util.Scanner;

class Student {
    int rollno;
    String name;
    double percentage;

    Student() {
        this(0, "N/A", 0.0);
    }

    Student(int rollno, String name, double percentage) {
        this.rollno = rollno;
        this.name = name;
        this.percentage = percentage;
    }

    void display() {
        System.out.println("Roll No: " + this.rollno + " | Name: " + this.name + " | Percentage: " + this.percentage + "%");
    }
}

public class Slip7_Q2_OR {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Student[] arr = new Student[5];

        for (int i = 0; i < 5; i++) {
            System.out.print("Enter Roll, Name, Percentage for student " + (i + 1) + ": ");
            int r = sc.nextInt();
            String n = sc.next();
            double p = sc.nextDouble();
            arr[i] = new Student(r, n, p);
        }

        System.out.println("\n--- 5 Students Details ---");
        for (Student s : arr) s.display();
        sc.close();
    }
}
```

---

## Slip 8

### Q.1) Write a Java program to accept names of 'n' cities, insert same into ArrayList collection, display the contents, and also remove all these elements. [10 Marks]
```java
import java.util.ArrayList;
import java.util.Scanner;

public class Slip8_Q1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<String> cities = new ArrayList<>();

        System.out.print("Enter count of cities (n): ");
        int n = sc.nextInt();
        sc.nextLine();

        for (int i = 0; i < n; i++) {
            System.out.print("City " + (i + 1) + ": ");
            cities.add(sc.nextLine());
        }

        System.out.println("\nArrayList Contents: " + cities);

        cities.clear(); // remove all elements
        System.out.println("After removing all elements: " + cities);
        sc.close();
    }
}
```

### Q.2) Create 2 files F1 and F2. Copy contents of F1 by changing case into F2 (F2=F1). Also copy contents of F1 and F2 into F3 (F3=F1+F2). Display contents of F3. [20 Marks]
```java
import java.io.*;

public class Slip8_Q2 {
    public static void main(String[] args) throws IOException {
        // Step 1: Create sample F1.txt
        FileWriter fw1 = new FileWriter("F1.txt");
        fw1.write("Hello Pune BCA Java Practical");
        fw1.close();

        // Step 2: Read F1, invert case, write to F2
        FileReader fr1 = new FileReader("F1.txt");
        FileWriter fw2 = new FileWriter("F2.txt");
        int ch;
        while ((ch = fr1.read()) != -1) {
            char c = (char) ch;
            if (Character.isUpperCase(c)) fw2.write(Character.toLowerCase(c));
            else if (Character.isLowerCase(c)) fw2.write(Character.toUpperCase(c));
            else fw2.write(c);
        }
        fr1.close();
        fw2.close();

        // Step 3: Copy F1 and F2 into F3
        FileInputStream fis1 = new FileInputStream("F1.txt");
        FileInputStream fis2 = new FileInputStream("F2.txt");
        FileOutputStream fos3 = new FileOutputStream("F3.txt");
        SequenceInputStream sis = new SequenceInputStream(fis1, fis2);

        while ((ch = sis.read()) != -1) {
            fos3.write(ch);
        }
        sis.close();
        fos3.close();

        // Step 4: Display contents of F3
        System.out.println("Contents of F3.txt (F1 + F2):");
        FileReader fr3 = new FileReader("F3.txt");
        while ((ch = fr3.read()) != -1) {
            System.out.print((char) ch);
        }
        System.out.println();
        fr3.close();
    }
}
```

### OR Q.2) Create class Customer (cid, cname, billAmount). Create array of 'n' customers and sort them based on bill amount in ascending order. [20 Marks]
```java
import java.util.Scanner;
import java.util.Arrays;

class Customer {
    int cid;
    String cname;
    double billAmount;

    Customer(int cid, String cname, double billAmount) {
        this.cid = cid;
        this.cname = cname;
        this.billAmount = billAmount;
    }

    void display() {
        System.out.printf("%-10d %-20s %-12.2f\n", cid, cname, billAmount);
    }
}

public class Slip8_Q2_OR {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of customers: ");
        int n = sc.nextInt();

        Customer[] list = new Customer[n];
        for (int i = 0; i < n; i++) {
            System.out.print("Enter ID, Name, Bill Amount: ");
            list[i] = new Customer(sc.nextInt(), sc.next(), sc.nextDouble());
        }

        Arrays.sort(list, (c1, c2) -> Double.compare(c1.billAmount, c2.billAmount));

        System.out.println("\n--- Sorted Customers (Ascending Order of Bill) ---");
        System.out.printf("%-10s %-20s %-12s\n", "Cust ID", "Name", "Bill Amount");
        for (Customer c : list) {
            c.display();
        }
        sc.close();
    }
}
```

---

## Slip 9

### Q.1) Write a Java program to calculate area of Cylinder and Circle. (use super keyword) [10 Marks]
```java
class CircleBase {
    double radius;

    CircleBase(double radius) {
        this.radius = radius;
    }

    double area() {
        return Math.PI * radius * radius;
    }
}

class CylinderDerived extends CircleBase {
    double height;

    CylinderDerived(double radius, double height) {
        super(radius);
        this.height = height;
    }

    @Override
    double area() {
        // Total surface area = 2 * (base area) + 2*pi*r*h
        return (2 * super.area()) + (2 * Math.PI * radius * height);
    }
}

public class Slip9_Q1 {
    public static void main(String[] args) {
        CircleBase circ = new CircleBase(5.0);
        System.out.printf("Circle Area: %.2f\n", circ.area());

        CylinderDerived cyl = new CylinderDerived(5.0, 10.0);
        System.out.printf("Cylinder Total Surface Area: %.2f\n", cyl.area());
    }
}
```

### Q.2) Accept 'n' integers from user and store them in a collection. Display in sorted order. Collection should not accept duplicates. Search for an element using predefined search method. [20 Marks]
```java
import java.util.Scanner;
import java.util.TreeSet;

public class Slip9_Q2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        TreeSet<Integer> set = new TreeSet<>(); // Automatically unique and sorted

        System.out.print("Enter how many numbers to insert (n): ");
        int n = sc.nextInt();

        System.out.println("Enter " + n + " integers:");
        for (int i = 0; i < n; i++) {
            set.add(sc.nextInt());
        }

        System.out.println("\nSorted Unique Collection: " + set);

        System.out.print("Enter number to search: ");
        int search = sc.nextInt();

        if (set.contains(search)) {
            System.out.println("Element " + search + " is present in the collection.");
        } else {
            System.out.println("Element " + search + " is NOT present in the collection.");
        }
        sc.close();
    }
}
```

### OR Q.2) Create class MyDate (dd, mm, yy). Implement default & parameterized constructors. Display date in dd-mm-yy format using this keyword. [20 Marks]
```java
class MyDate {
    int dd, mm, yy;

    MyDate() {
        this(1, 1, 2024);
    }

    MyDate(int dd, int mm, int yy) {
        this.dd = dd;
        this.mm = mm;
        this.yy = yy;
    }

    void display() {
        System.out.printf("%02d-%02d-%04d\n", this.dd, this.mm, this.yy);
    }
}

public class Slip9_Q2_OR {
    public static void main(String[] args) {
        MyDate d1 = new MyDate();
        MyDate d2 = new MyDate(21, 10, 2024);

        System.out.print("Default Date: ");
        d1.display();

        System.out.print("Parameterized Date: ");
        d2.display();
    }
}
```

---

## Slip 10

### Q.1) Write a Java program to create class Rectangle having length and breadth. Calculate and display the Area and Perimeter. [10 Marks]
```java
import java.util.Scanner;

class RectangleMeasure {
    double length, breadth;

    RectangleMeasure(double l, double b) {
        length = l;
        breadth = b;
    }

    double getArea() { return length * breadth; }
    double getPerimeter() { return 2 * (length + breadth); }
}

public class Slip10_Q1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter length and breadth: ");
        double l = sc.nextDouble();
        double b = sc.nextDouble();

        RectangleMeasure rect = new RectangleMeasure(l, b);
        System.out.println("Area: " + rect.getArea());
        System.out.println("Perimeter: " + rect.getPerimeter());
        sc.close();
    }
}
```

### Q.2) Create a hash table to maintain mobile number and student name. Display details using Enumeration interface. [20 Marks]
```java
import java.util.Hashtable;
import java.util.Enumeration;

public class Slip10_Q2 {
    public static void main(String[] args) {
        Hashtable<String, String> phoneBook = new Hashtable<>();
        phoneBook.put("9876543210", "Amit Sharma");
        phoneBook.put("9123456780", "Sneha Joshi");
        phoneBook.put("9988776655", "Pratik Patil");

        Enumeration<String> mobileKeys = phoneBook.keys();

        System.out.println("--- Student Mobile Directory (Using Enumeration) ---");
        while (mobileKeys.hasMoreElements()) {
            String mobile = mobileKeys.nextElement();
            String name = phoneBook.get(mobile);
            System.out.println("Mobile Number: " + mobile + " => Student Name: " + name);
        }
    }
}
```

### OR Q.2) Superclass Vehicle (Company, Price). Derive LightMotorVehicle (mileage) and HeavyMotorVehicle (capacity_in_tons). Accept 'n' vehicles and ask user vehicle type first. [20 Marks]
```java
import java.util.Scanner;

class Vehicle {
    String company;
    double price;

    Vehicle(String company, double price) {
        this.company = company;
        this.price = price;
    }
}

class LightMotorVehicle extends Vehicle {
    double mileage;

    LightMotorVehicle(String company, double price, double mileage) {
        super(company, price);
        this.mileage = mileage;
    }

    void display() {
        System.out.println("Light Motor Vehicle | Company: " + company + 
                           " | Price: Rs. " + price + " | Mileage: " + mileage + " km/l");
    }
}

class HeavyMotorVehicle extends Vehicle {
    double capacityInTons;

    HeavyMotorVehicle(String company, double price, double capacityInTons) {
        super(company, price);
        this.capacityInTons = capacityInTons;
    }

    void display() {
        System.out.println("Heavy Motor Vehicle | Company: " + company + 
                           " | Price: Rs. " + price + " | Capacity: " + capacityInTons + " Tons");
    }
}

public class Slip10_Q2_OR {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of vehicles: ");
        int n = sc.nextInt();

        Object[] vehicles = new Object[n];

        for (int i = 0; i < n; i++) {
            System.out.print("\nEnter type for vehicle " + (i + 1) + " (1: Light, 2: Heavy): ");
            int type = sc.nextInt();
            System.out.print("Company: ");
            String comp = sc.next();
            System.out.print("Price: ");
            double price = sc.nextDouble();

            if (type == 1) {
                System.out.print("Mileage: ");
                double mileage = sc.nextDouble();
                vehicles[i] = new LightMotorVehicle(comp, price, mileage);
            } else {
                System.out.print("Capacity in Tons: ");
                double cap = sc.nextDouble();
                vehicles[i] = new HeavyMotorVehicle(comp, price, cap);
            }
        }

        System.out.println("\n--- Vehicle Details ---");
        for (Object v : vehicles) {
            if (v instanceof LightMotorVehicle) ((LightMotorVehicle) v).display();
            else if (v instanceof HeavyMotorVehicle) ((HeavyMotorVehicle) v).display();
        }
        sc.close();
    }
}
```

---

## Slip 11

### Q.1) Write a Java program to accept a number from user and print all prime numbers upto that number (Use BufferedReader class). [10 Marks]
```java
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Slip11_Q1 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.print("Enter upper bound number: ");
        int limit = Integer.parseInt(br.readLine());

        System.out.println("Prime numbers up to " + limit + ":");
        for (int i = 2; i <= limit; i++) {
            boolean isPrime = true;
            for (int j = 2; j * j <= i; j++) {
                if (i % j == 0) {
                    isPrime = false;
                    break;
                }
            }
            if (isPrime) {
                System.out.print(i + " ");
            }
        }
        System.out.println();
    }
}
```

### Q.2) Write a program to copy the contents from one file into another file in upper case. [20 Marks]
```java
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class Slip11_Q2 {
    public static void main(String[] args) {
        String sourceFile = "source.txt";
        String targetFile = "dest_upper.txt";

        try (FileReader fr = new FileReader(sourceFile);
             FileWriter fw = new FileWriter(targetFile)) {
            int ch;
            while ((ch = fr.read()) != -1) {
                fw.write(Character.toUpperCase((char) ch));
            }
            System.out.println("Contents copied successfully to " + targetFile + " in uppercase.");
        } catch (IOException e) {
            System.out.println("I/O Error: " + e.getMessage());
        }
    }
}
```

### OR Q.2) Define Employee (id, name, department, salary). Create subclass Worker with private member bonus. Define accept & display in both. Create 'n' Worker objects and display worker with maximum total salary (salary+bonus). [20 Marks]
```java
import java.util.Scanner;

class Employee {
    int id;
    String name, department;
    double salary;

    void accept(Scanner sc) {
        System.out.print("ID: "); id = sc.nextInt();
        System.out.print("Name: "); name = sc.next();
        System.out.print("Department: "); department = sc.next();
        System.out.print("Salary: "); salary = sc.nextDouble();
    }

    void display() {
        System.out.print("ID: " + id + " | Name: " + name + " | Dept: " + department + " | Basic: " + salary);
    }
}

class Worker extends Employee {
    private double bonus;

    void accept(Scanner sc) {
        super.accept(sc);
        System.out.print("Bonus: ");
        this.bonus = sc.nextDouble();
    }

    double getTotalSalary() {
        return salary + bonus;
    }

    void display() {
        super.display();
        System.out.println(" | Bonus: " + bonus + " | Total: " + getTotalSalary());
    }
}

public class Slip11_Q2_OR {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of workers: ");
        int n = sc.nextInt();

        Worker[] workers = new Worker[n];
        for (int i = 0; i < n; i++) {
            System.out.println("\nWorker " + (i + 1) + ":");
            workers[i] = new Worker();
            workers[i].accept(sc);
        }

        Worker maxWorker = workers[0];
        for (int i = 1; i < n; i++) {
            if (workers[i].getTotalSalary() > maxWorker.getTotalSalary()) {
                maxWorker = workers[i];
            }
        }

        System.out.println("\n--- Worker with Maximum Total Salary ---");
        maxWorker.display();
        sc.close();
    }
}
```

---

## Slip 12

### Q.1) Define an Interface Shape with abstract method area(). Write a Java program to calculate area of Circle and Sphere. (use final keyword) [10 Marks]
```java
interface Shape {
    final double PI = 3.14159;
    void area();
}

final class CircleShape implements Shape {
    private final double radius;

    CircleShape(double radius) {
        this.radius = radius;
    }

    public void area() {
        System.out.printf("Area of Circle: %.2f\n", (PI * radius * radius));
    }
}

final class SphereShape implements Shape {
    private final double radius;

    SphereShape(double radius) {
        this.radius = radius;
    }

    public void area() {
        System.out.printf("Surface Area of Sphere: %.2f\n", (4 * PI * radius * radius));
    }
}

public class Slip12_Q1 {
    public static void main(String[] args) {
        Shape c = new CircleShape(4.0);
        Shape s = new SphereShape(4.0);
        c.area();
        s.area();
    }
}
```

### Q.2) Write an applet program to draw rectangle and oval. [20 Marks]
```java
import java.applet.Applet;
import java.awt.Color;
import java.awt.Graphics;

/*
<applet code="Slip12_Q2.class" width="400" height="250">
</applet>
*/

public class Slip12_Q2 extends Applet {
    public void paint(Graphics g) {
        // Draw Rectangle
        g.setColor(Color.RED);
        g.drawRect(30, 40, 150, 100);
        g.drawString("Rectangle", 70, 160);

        // Draw Oval
        g.setColor(Color.BLUE);
        g.drawOval(220, 40, 150, 100);
        g.drawString("Oval", 270, 160);
    }
}
```

### OR Q.2) Class MyNumber having one private integer data member. Default constructor to 0, parameterized to value. Methods: isNegative, isPositive, isOdd, isEven. Pass value via CLI. [20 Marks]
```java
class MyNumber {
    private int value;

    MyNumber() {
        this.value = 0;
    }

    MyNumber(int value) {
        this.value = value;
    }

    boolean isNegative() { return value < 0; }
    boolean isPositive() { return value > 0; }
    boolean isOdd() { return value % 2 != 0; }
    boolean isEven() { return value % 2 == 0; }
    int getValue() { return value; }
}

public class Slip12_Q2_OR {
    public static void main(String[] args) {
        if (args.length == 0) {
            System.out.println("Please provide a number via command line!");
            return;
        }

        int val = Integer.parseInt(args[0]);
        MyNumber obj = new MyNumber(val);

        System.out.println("Testing value: " + obj.getValue());
        System.out.println("isPositive: " + obj.isPositive());
        System.out.println("isNegative: " + obj.isNegative());
        System.out.println("isEven: " + obj.isEven());
        System.out.println("isOdd: " + obj.isOdd());
    }
}
```

---

## Slip 13

### Q.1) Accept a number from user; if Zero then throw user defined exception "Number is 0", otherwise check whether prime or not. [10 Marks]
```java
import java.util.Scanner;

class ZeroNumberException extends Exception {
    ZeroNumberException(String msg) {
        super(msg);
    }
}

public class Slip13_Q1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter an integer: ");
        int num = sc.nextInt();

        try {
            if (num == 0) {
                throw new ZeroNumberException("Number is 0");
            }

            boolean isPrime = num > 1;
            for (int i = 2; i * i <= num; i++) {
                if (num % i == 0) {
                    isPrime = false;
                    break;
                }
            }

            if (isPrime) {
                System.out.println(num + " is a Prime number.");
            } else {
                System.out.println(num + " is NOT a Prime number.");
            }
        } catch (ZeroNumberException e) {
            System.out.println("Exception: " + e.getMessage());
        }
        sc.close();
    }
}
```

### Q.2) Accept Doctor Name from user and check whether valid or not. (No digits and special symbols). If not valid throw user defined Exception "Name is Invalid", otherwise display. [20 Marks]
```java
import java.util.Scanner;

class InvalidDoctorNameException extends Exception {
    InvalidDoctorNameException(String msg) {
        super(msg);
    }
}

public class Slip13_Q2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Doctor's Name: ");
        String name = sc.nextLine();

        try {
            if (!name.matches("^[a-zA-Z\\s.]+$")) {
                throw new InvalidDoctorNameException("Name is Invalid");
            }
            System.out.println("Valid Doctor Name: Dr. " + name);
        } catch (InvalidDoctorNameException e) {
            System.out.println("Exception: " + e.getMessage());
        }
        sc.close();
    }
}
```

### OR Q.2) Accept details of 'n' customers (c_id, cname, address, mobile_no) from user and store in a file using DataOutputStream class. [20 Marks]
```java
import java.io.DataOutputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Scanner;

public class Slip13_Q2_OR {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of customers: ");
        int n = sc.nextInt();

        try (DataOutputStream dos = new DataOutputStream(new FileOutputStream("customer.dat"))) {
            for (int i = 0; i < n; i++) {
                System.out.println("\nCustomer " + (i + 1) + ":");
                System.out.print("ID: ");
                int cid = sc.nextInt();
                sc.nextLine();
                System.out.print("Name: ");
                String name = sc.nextLine();
                System.out.print("Address: ");
                String address = sc.nextLine();
                System.out.print("Mobile No: ");
                String mobile = sc.next();

                dos.writeInt(cid);
                dos.writeUTF(name);
                dos.writeUTF(address);
                dos.writeUTF(mobile);
            }
            System.out.println("\nAll records written successfully using DataOutputStream.");
        } catch (IOException e) {
            System.out.println("File Error: " + e.getMessage());
        }
        sc.close();
    }
}
```

---

## Slip 14

### Q.1) Accept names of 'n' cities, insert into ArrayList, display and remove all. [10 Marks]
`[REPEATED - Exactly identical to Slip 8, Q.1]`
*(Refer to `Slip8_Q1.java` for code)*

### Q.2) Construct a LinkedList containing colors: red, blue, yellow, orange.
i. Display contents using Iterator
ii. Display contents in reverse order using ListIterator
iii. Insert pink and green between blue and yellow [20 Marks]
```java
import java.util.LinkedList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.ListIterator;

public class Slip14_Q2 {
    public static void main(String[] args) {
        LinkedList<String> colors = new LinkedList<>(Arrays.asList("red", "blue", "yellow", "orange"));

        // i. Display using Iterator
        System.out.print("i. Colors using Iterator: ");
        Iterator<String> it = colors.iterator();
        while (it.hasNext()) {
            System.out.print(it.next() + " ");
        }
        System.out.println();

        // ii. Display in reverse using ListIterator
        System.out.print("ii. Colors in Reverse: ");
        ListIterator<String> lit = colors.listIterator(colors.size());
        while (lit.hasPrevious()) {
            System.out.print(lit.previous() + " ");
        }
        System.out.println();

        // iii. Insert pink and green between blue and yellow
        int yellowIndex = colors.indexOf("yellow");
        colors.add(yellowIndex, "pink");
        colors.add(yellowIndex + 1, "green");

        System.out.println("iii. Modified List: " + colors);
    }
}
```

### OR Q.2) Read the contents of "abc.txt" file, display contents in uppercase as output. [20 Marks]
```java
import java.io.FileReader;
import java.io.IOException;

public class Slip14_Q2_OR {
    public static void main(String[] args) {
        try (FileReader fr = new FileReader("abc.txt")) {
            int ch;
            while ((ch = fr.read()) != -1) {
                System.out.print(Character.toUpperCase((char) ch));
            }
        } catch (IOException e) {
            System.out.println("Error reading abc.txt: " + e.getMessage());
        }
    }
}
```

---

## Slip 15

### Q.1) Write a Java program to reverse a number. Accept number using command line arguments. [10 Marks]
```java
public class Slip15_Q1 {
    public static void main(String[] args) {
        if (args.length == 0) {
            System.out.println("Please provide an integer via command line!");
            return;
        }

        int num = Integer.parseInt(args[0]);
        int original = num;
        int reversed = 0;

        while (num != 0) {
            int digit = num % 10;
            reversed = reversed * 10 + digit;
            num /= 10;
        }

        System.out.println("Original Number: " + original);
        System.out.println("Reversed Number: " + reversed);
    }
}
```

### Q.2) Create class Circle (member: radius), Cylinder (members: radius, height) which implements this interface. Calculate and display area and volume. [20 Marks]
```java
interface Operation {
    double PI = 3.142;
    void area();
    void volume();
}

class Circle15 implements Operation {
    double radius;

    Circle15(double radius) {
        this.radius = radius;
    }

    public void area() {
        System.out.printf("Circle Area: %.2f\n", (PI * radius * radius));
    }

    public void volume() {
        System.out.println("Circle Volume: 0.0 (2D shape has no volume)");
    }
}

class Cylinder15 implements Operation {
    double radius, height;

    Cylinder15(double radius, double height) {
        this.radius = radius;
        this.height = height;
    }

    public void area() {
        double a = (2 * PI * radius * height) + (2 * PI * radius * radius);
        System.out.printf("Cylinder Area: %.2f\n", a);
    }

    public void volume() {
        System.out.printf("Cylinder Volume: %.2f\n", (PI * radius * radius * height));
    }
}

public class Slip15_Q2 {
    public static void main(String[] args) {
        Circle15 c = new Circle15(3.5);
        c.area();
        c.volume();

        Cylinder15 cyl = new Cylinder15(3.5, 7.0);
        cyl.area();
        cyl.volume();
    }
}
```

### OR Q.2) Write a Java program to create using Runnable interface to display traffic signal. [20 Marks]
```java
class TrafficLightRunnable implements Runnable {
    public void run() {
        try {
            while (true) {
                System.out.println("=== RED LIGHT: STOP (Wait 3 sec) ===");
                Thread.sleep(3000);

                System.out.println("=== YELLOW LIGHT: READY (Wait 1 sec) ===");
                Thread.sleep(1000);

                System.out.println("=== GREEN LIGHT: GO (Wait 3 sec) ===");
                Thread.sleep(3000);
            }
        } catch (InterruptedException e) {
            System.out.println("Traffic system interrupted.");
        }
    }
}

public class Slip15_Q2_OR {
    public static void main(String[] args) {
        Thread signal = new Thread(new TrafficLightRunnable());
        signal.start();
    }
}
```

---

## Slip 16

### Q.1) Write a Java program to display Fibonacci series. [10 Marks]
```java
import java.util.Scanner;

public class Slip16_Q1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of terms: ");
        int n = sc.nextInt();

        int a = 0, b = 1;
        System.out.print("Fibonacci Series: ");
        for (int i = 1; i <= n; i++) {
            System.out.print(a + " ");
            int c = a + b;
            a = b;
            b = c;
        }
        System.out.println();
        sc.close();
    }
}
```

### Q.2) Write a program to sort HashMap by keys and display details before and after sorting. [20 Marks]
```java
import java.util.HashMap;
import java.util.TreeMap;

public class Slip16_Q2 {
    public static void main(String[] args) {
        HashMap<Integer, String> map = new HashMap<>();
        map.put(103, "Ravi");
        map.put(101, "Suresh");
        map.put(105, "Anil");
        map.put(102, "Kavita");

        System.out.println("Before Sorting (HashMap):");
        map.forEach((k, v) -> System.out.println("Key: " + k + " | Value: " + v));

        // Sorting by Keys using TreeMap
        TreeMap<Integer, String> sortedMap = new TreeMap<>(map);

        System.out.println("\nAfter Sorting by Keys (TreeMap):");
        sortedMap.forEach((k, v) -> System.out.println("Key: " + k + " | Value: " + v));
    }
}
```

### OR Q.2) Define an interface "Operation" which has methods area(), volume(). Define constant PI = 3.142. [20 Marks]
`[REPEATED - Conceptually matches Slip 15, Q.2 and Slip 21 OR Q.2]`
*(Refer to `Slip15_Q2.java` for full interface and implementations)*

---

## Slip 17

### Q.1) Define an Interface "Integer" with an abstract method check(). Write a Java program to check whether a given number is Positive or Negative. [10 Marks]
```java
import java.util.Scanner;

interface IntegerCheck {
    void check(int num);
}

public class Slip17_Q1 implements IntegerCheck {
    public void check(int num) {
        if (num >= 0) {
            System.out.println(num + " is Positive.");
        } else {
            System.out.println(num + " is Negative.");
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter an integer: ");
        int n = sc.nextInt();

        new Slip17_Q1().check(n);
        sc.close();
    }
}
```

### Q.2) Write a Java program to demonstrate Synchronization Example. [20 Marks]
```java
class TablePrinter {
    synchronized void printTable(int n) {
        for (int i = 1; i <= 5; i++) {
            System.out.println(Thread.currentThread().getName() + " -> " + (n * i));
            try {
                Thread.sleep(300);
            } catch (InterruptedException e) {
                System.out.println(e);
            }
        }
    }
}

class ThreadWorker extends Thread {
    TablePrinter tp;
    int number;

    ThreadWorker(TablePrinter tp, int number, String name) {
        super(name);
        this.tp = tp;
        this.number = number;
    }

    public void run() {
        tp.printTable(number);
    }
}

public class Slip17_Q2 {
    public static void main(String[] args) {
        TablePrinter obj = new TablePrinter();
        ThreadWorker t1 = new ThreadWorker(obj, 5, "Thread-Table-5");
        ThreadWorker t2 = new ThreadWorker(obj, 10, "Thread-Table-10");

        t1.start();
        t2.start();
    }
}
```

### OR Q.2) Create a LinkedList of integer objects. i. Add element at first position ii. Delete last element iii. Display size of linked list. [20 Marks]
```java
import java.util.LinkedList;

public class Slip17_Q2_OR {
    public static void main(String[] args) {
        LinkedList<Integer> list = new LinkedList<>();
        list.add(20);
        list.add(30);
        list.add(40);
        System.out.println("Initial List: " + list);

        // i. Add element at first position
        list.addFirst(10);
        System.out.println("After addFirst(10): " + list);

        // ii. Delete last element
        list.removeLast();
        System.out.println("After removeLast(): " + list);

        // iii. Display size of LinkedList
        System.out.println("Current Size of List: " + list.size());
    }
}
```

---

## Slip 18

### Q.1) Write a Java program to find sum of elements of an array. Also display elements in ascending order. [10 Marks]
```java
import java.util.Arrays;
import java.util.Scanner;

public class Slip18_Q1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter size of array: ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        int sum = 0;

        System.out.println("Enter " + n + " elements:");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
            sum += arr[i];
        }

        Arrays.sort(arr);

        System.out.println("\nSum of elements: " + sum);
        System.out.println("Elements in Ascending Order: " + Arrays.toString(arr));
        sc.close();
    }
}
```

### Q.2) Define class Product (id, name, price). Store information of 5 products and display name of product having minimum price. [20 Marks]
```java
import java.util.Scanner;

class Product {
    int id;
    String name;
    double price;

    Product(int id, String name, double price) {
        this.id = id;
        this.name = name;
        this.price = price;
    }
}

public class Slip18_Q2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Product[] products = new Product[5];

        for (int i = 0; i < 5; i++) {
            System.out.print("Enter ID, Name, Price for product " + (i + 1) + ": ");
            products[i] = new Product(sc.nextInt(), sc.next(), sc.nextDouble());
        }

        Product minProd = products[0];
        for (int i = 1; i < 5; i++) {
            if (products[i].price < minProd.price) {
                minProd = products[i];
            }
        }

        System.out.println("\n--- Product with Minimum Price ---");
        System.out.println("Name: " + minProd.name + " | Price: Rs. " + minProd.price);
        sc.close();
    }
}
```

### OR Q.2) Accept 'N' student names through command line, store them in collection and display using Iterator and ListIterator interface. [20 Marks]
```java
import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;

public class Slip18_Q2_OR {
    public static void main(String[] args) {
        if (args.length == 0) {
            System.out.println("Please pass student names via command line!");
            return;
        }

        ArrayList<String> names = new ArrayList<>();
        for (String s : args) {
            names.add(s);
        }

        System.out.println("--- Display using Iterator ---");
        Iterator<String> it = names.iterator();
        while (it.hasNext()) {
            System.out.println(it.next());
        }

        System.out.println("\n--- Display using ListIterator (Forward & Backward) ---");
        ListIterator<String> lit = names.listIterator();
        System.out.println("Forward:");
        while (lit.hasNext()) {
            System.out.println(lit.next());
        }

        System.out.println("Backward:");
        while (lit.hasPrevious()) {
            System.out.println(lit.previous());
        }
    }
}
```

---

## Slip 19

### Q.1) Define Interface Shape with abstract method area(). Calculate area of Circle and Sphere. (use final keyword) [10 Marks]
`[REPEATED - Exactly identical to Slip 12, Q.1]`
*(Refer to `Slip12_Q1.java` for complete code)*

### Q.2) Store student names and Roll numbers using an appropriate collection.
i. Add student and Roll number (No duplicates)
ii. Remove a student
iii. Search student and display roll number [20 Marks]
```java
import java.util.HashMap;
import java.util.Scanner;

public class Slip19_Q2 {
    public static void main(String[] args) {
        HashMap<String, Integer> map = new HashMap<>();
        Scanner sc = new Scanner(System.in);

        // i. Add new student (No duplicate keys in Map)
        map.put("Swapnil", 101);
        map.put("Priyanka", 102);
        map.put("Aditya", 103);
        System.out.println("Initial Records: " + map);

        // ii. Remove a student
        map.remove("Aditya");
        System.out.println("After removing Aditya: " + map);

        // iii. Search for a student
        System.out.print("\nEnter student name to search: ");
        String search = sc.next();
        if (map.containsKey(search)) {
            System.out.println(search + "'s Roll Number is: " + map.get(search));
        } else {
            System.out.println("Student record not found!");
        }
        sc.close();
    }
}
```

### OR Q.2) Write a Java program to demonstrate Synchronization Example. [20 Marks]
`[REPEATED - Exactly identical to Slip 17, Q.2]`
*(Refer to `Slip17_Q2.java` for code)*

---

## Slip 20

### Q.1) Accept a number using BufferedReader class and generate multiplication table. [10 Marks]
```java
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Slip20_Q1 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.print("Enter number to generate table: ");
        int n = Integer.parseInt(br.readLine());

        System.out.println("--- Table of " + n + " ---");
        for (int i = 1; i <= 10; i++) {
            System.out.printf("%d * %2d = %d\n", n, i, (n * i));
        }
    }
}
```

### Q.2) Write a Java program to show Multiple Threads Execution. [20 Marks]
```java
class TaskThread extends Thread {
    TaskThread(String name) {
        super(name);
    }

    public void run() {
        for (int i = 1; i <= 4; i++) {
            System.out.println(getName() + " executing iteration " + i);
            try {
                Thread.sleep(400);
            } catch (InterruptedException e) {
                System.out.println(e);
            }
        }
    }
}

public class Slip20_Q2 {
    public static void main(String[] args) {
        TaskThread t1 = new TaskThread("Thread-Alpha");
        TaskThread t2 = new TaskThread("Thread-Beta");
        TaskThread t3 = new TaskThread("Thread-Gamma");

        t1.start();
        t2.start();
        t3.start();
    }
}
```

### OR Q.2) Store city names and STD codes using appropriate collection.
i. Add city and code (No duplicates)
ii. Remove city
iii. Search city and display code [20 Marks]
```java
import java.util.HashMap;
import java.util.Scanner;

public class Slip20_Q2_OR {
    public static void main(String[] args) {
        HashMap<String, String> stdCodes = new HashMap<>();
        Scanner sc = new Scanner(System.in);

        // i. Add
        stdCodes.put("Pune", "020");
        stdCodes.put("Mumbai", "022");
        stdCodes.put("Delhi", "011");
        System.out.println("STD Registry: " + stdCodes);

        // ii. Remove
        stdCodes.remove("Delhi");
        System.out.println("After removing Delhi: " + stdCodes);

        // iii. Search
        System.out.print("\nEnter City Name to find STD code: ");
        String city = sc.next();
        if (stdCodes.containsKey(city)) {
            System.out.println("STD Code for " + city + " is: " + stdCodes.get(city));
        } else {
            System.out.println("City not found in STD directory!");
        }
        sc.close();
    }
}
```

---

## Slip 21

### Q.1) Calculate area of Cylinder and Circle. (Use super keyword) [10 Marks]
`[REPEATED - Exactly identical to Slip 9, Q.1]`
*(Refer to `Slip9_Q1.java` for code)*

### Q.2) Class Product (id, name, price). Store 5 products and display name of product with minimum price. [20 Marks]
`[REPEATED - Exactly identical to Slip 18, Q.2]`
*(Refer to `Slip18_Q2.java` for code)*

### OR Q.2) Interface Operation (area, volume, PI=3.142). Class Circle, Cylinder. Calculate area and volume. [20 Marks]
`[REPEATED - Exactly identical to Slip 15, Q.2]`
*(Refer to `Slip15_Q2.java` for code)*

---

## Slip 22

### Q.1) Accept number from user and print all prime numbers up to that number (Use BufferedReader). [10 Marks]
`[REPEATED - Exactly identical to Slip 11, Q.1]`
*(Refer to `Slip11_Q1.java` for code)*

### Q.2) Accept 'N' student names through command line, store in collection, display using Iterator and ListIterator. [20 Marks]
`[REPEATED - Exactly identical to Slip 18, OR Q.2]`
*(Refer to `Slip18_Q2_OR.java` for code)*

### OR Q.2) Create LinkedList of String objects:
i. Add element at end of list
ii. Delete first element
iii. Display contents in reverse order [20 Marks]
```java
import java.util.LinkedList;
import java.util.Iterator;

public class Slip22_Q2_OR {
    public static void main(String[] args) {
        LinkedList<String> list = new LinkedList<>();
        list.add("Java");
        list.add("Python");
        list.add("C++");
        System.out.println("Initial List: " + list);

        // i. Add element at the end of the list
        list.addLast("Kotlin");
        System.out.println("After addLast(): " + list);

        // ii. Delete first element of the list
        list.removeFirst();
        System.out.println("After removeFirst(): " + list);

        // iii. Display contents in reverse order
        System.out.println("Reverse order:");
        Iterator<String> revIt = list.descendingIterator();
        while (revIt.hasNext()) {
            System.out.println(revIt.next());
        }
    }
}
```

---

## Slip 23

### Q.1) Calculate area of Cylinder and Circle. (Use super keyword) [10 Marks]
`[REPEATED - Exactly identical to Slip 9, Q.1]`
*(Refer to `Slip9_Q1.java` for code)*

### Q.2) Program to sort HashMap by keys and display details before and after sorting. [20 Marks]
`[REPEATED - Exactly identical to Slip 16, Q.2]`
*(Refer to `Slip16_Q2.java` for code)*

### OR Q.2) Display traffic signal using Runnable interface. [20 Marks]
`[REPEATED - Exactly identical to Slip 15, OR Q.2]`
*(Refer to `Slip15_Q2_OR.java` for code)*

---

## Slip 24

### Q.1) Accept n names of cities from user and display them in descending order. [10 Marks]
`[REPEATED - Exactly identical to Slip 2, Q.1]`
*(Refer to `Slip2_Q1.java` for code)*

### Q.2) Create abstract class Shape with methods area & volume. Derive Sphere (radius) and Cylinder (radius, height). (Method Overriding). [20 Marks]
`[REPEATED - Exactly identical to Slip 5, OR Q.2]`
*(Refer to `Slip5_Q2_OR.java` for code)*

### OR Q.2) Accept 'N' student names through command line, store in collection, display using Iterator and ListIterator. [20 Marks]
`[REPEATED - Exactly identical to Slip 18, OR Q.2]`
*(Refer to `Slip18_Q2_OR.java` for code)*

---

## Slip 25

### Q.1) Write a Java program to reverse a number. Accept number using command line arguments. [10 Marks]
`[REPEATED - Exactly identical to Slip 15, Q.1]`
*(Refer to `Slip15_Q1.java` for code)*

### Q.2) Write a package game which will have 2 classes Indoor & Outdoor. Use display() to generate list of players. Default & parameterized constructor. [20 Marks]
`[REPEATED - Exactly identical to Slip 7, Q.1]`
*(Refer to `Slip7_Q1.java` for code)*

### OR Q.2) Create 2 files F1 and F2. Copy contents of F1 by changing case into F2. Also copy contents of F1 and F2 in F3. Display contents of F3. [20 Marks]
`[REPEATED - Exactly identical to Slip 8, Q.2]`
*(Refer to `Slip8_Q2.java` for code)*

---