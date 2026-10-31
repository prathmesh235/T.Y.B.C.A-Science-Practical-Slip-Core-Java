import java.util.Scanner;

class MyDate {
    int dd, mm, yy;

    MyDate() {
        dd = 1;
        mm = 1;
        yy = 2000;
    }

    MyDate(int dd, int mm, int yy) {
        this.dd = dd;
        this.mm = mm;
        this.yy = yy;
    }

    void display() {
        System.out.println("Date: " + dd + "-" + mm + "-" + yy);
    }
}

class Slip9Q3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        MyDate d1 = new MyDate();
        d1.display();

        System.out.print("Enter day, month and year: ");
        int dd = sc.nextInt();
        int mm = sc.nextInt();
        int yy = sc.nextInt();

        MyDate d2 = new MyDate(dd, mm, yy);
        d2.display();
    }
}