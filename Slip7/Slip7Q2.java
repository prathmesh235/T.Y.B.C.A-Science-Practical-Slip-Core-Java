import java.util.Scanner;

class InvalidDateException extends Exception {
    InvalidDateException(String msg) {
        super(msg);
    }
}

class MyDate {
    int day, month, year;

    void accept() throws InvalidDateException {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter day, month, year: ");
        day = sc.nextInt();
        month = sc.nextInt();
        year = sc.nextInt();

        if (year <= 0 || month < 1 || month > 12 ||
            day < 1 || day > 31 ||
            (month == 2 && day > (year % 400 == 0 ||
            (year % 4 == 0 && year % 100 != 0) ? 29 : 28)) ||
            ((month == 4 || month == 6 || month == 9 ||
            month == 11) && day > 30)) {
            throw new InvalidDateException("Invalid Date!");
        }
    }

    void display() {
        System.out.println("Date: " + day + "/" + month + "/" + year);
    }
}

class Slip7Q2 {
    public static void main(String[] args) {
        MyDate d = new MyDate();

        try {
            d.accept();
            d.display();
        } catch (InvalidDateException e) {
            System.out.println(e.getMessage());
        }
    }
}