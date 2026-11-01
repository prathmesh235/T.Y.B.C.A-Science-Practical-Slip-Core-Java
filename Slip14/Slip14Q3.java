import java.io.*;

class Slip14Q3 {
    public static void main(String[] args) throws Exception {
        FileReader fr = new FileReader("abc.txt");

        int ch;
        while ((ch = fr.read()) != -1) {
            System.out.print(Character.toUpperCase((char) ch));
        }

        fr.close();
    }
}