import java.io.*;
import java.util.Scanner;

class Slip11Q2 {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter source file name: ");
        String f1 = sc.nextLine();

        System.out.print("Enter destination file name: ");
        String f2 = sc.nextLine();

        FileReader r = new FileReader(f1);
        FileWriter w = new FileWriter(f2);

        int ch;
        while ((ch = r.read()) != -1) {
            w.write(Character.toUpperCase((char) ch));
        }

        r.close();
        w.close();

        System.out.println("File copied in uppercase successfully.");
    }
}