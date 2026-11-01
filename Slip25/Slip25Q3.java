import java.io.*;
import java.util.Scanner;

class Slip25Q3 {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter content for F1: ");
        String data = sc.nextLine();

        FileWriter f1 = new FileWriter("F1.txt");
        f1.write(data);
        f1.close();

        FileReader fr = new FileReader("F1.txt");
        FileWriter f2 = new FileWriter("F2.txt");

        int ch;
        while ((ch = fr.read()) != -1) {
            char c = (char) ch;

            if (Character.isUpperCase(c))
                c = Character.toLowerCase(c);
            else if (Character.isLowerCase(c))
                c = Character.toUpperCase(c);

            f2.write(c);
        }
        fr.close();
        f2.close();

        FileWriter f3 = new FileWriter("F3.txt");

        fr = new FileReader("F1.txt");
        while ((ch = fr.read()) != -1)
            f3.write(ch);
        fr.close();

        fr = new FileReader("F2.txt");
        while ((ch = fr.read()) != -1)
            f3.write(ch);
        fr.close();

        f3.close();

        System.out.println("\nContents of F3:");
        fr = new FileReader("F3.txt");

        while ((ch = fr.read()) != -1)
            System.out.print((char) ch);

        fr.close();
        sc.close();
    }
}