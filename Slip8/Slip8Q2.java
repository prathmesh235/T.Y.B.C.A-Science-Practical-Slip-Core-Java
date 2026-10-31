import java.io.*;
import java.util.Scanner;

class Slip8Q2 {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);

        FileWriter f1 = new FileWriter("F1.txt");
        System.out.print("Enter content for F1: ");
        String data = sc.nextLine();
        f1.write(data);
        f1.close();

        FileReader r = new FileReader("F1.txt");
        FileWriter f2 = new FileWriter("F2.txt");

        int ch;
        while ((ch = r.read()) != -1) {
            char c = (char) ch;

            if (Character.isUpperCase(c))
                c = Character.toLowerCase(c);
            else
                c = Character.toUpperCase(c);

            f2.write(c);
        }
        r.close();
        f2.close();

        FileWriter f3 = new FileWriter("F3.txt");

        BufferedReader b1 = new BufferedReader(new FileReader("F1.txt"));
        BufferedReader b2 = new BufferedReader(new FileReader("F2.txt"));

        String line;
        while ((line = b1.readLine()) != null)
            f3.write(line + "\n");

        while ((line = b2.readLine()) != null)
            f3.write(line + "\n");

        b1.close();
        b2.close();
        f3.close();

        System.out.println("F1, F2 and F3 files created successfully.");
    }
}