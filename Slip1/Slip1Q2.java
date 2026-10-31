import java.util.Scanner;

class Book {
    int bookId;
    String bookName;
    double price;

    void accept(Scanner sc) {
        System.out.print("Enter Book ID, Name and Price: ");
        bookId = sc.nextInt();
        bookName = sc.next();
        price = sc.nextDouble();
    }

    void display() {
        System.out.println(bookId + "\t" + bookName + "\t" + price);
    }
}

class Slip1Q2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Book b[] = new Book[5];

        for (int i = 0; i < 5; i++) {
            b[i] = new Book();
            b[i].accept(sc);
        }

        System.out.println("\nBook Details:");
        System.out.println("ID\tName\tPrice");

        for (int i = 0; i < 5; i++) {
            b[i].display();
        }

        sc.close();
    }
}