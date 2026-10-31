import java.io.*;

class Slip5Q1 {
    public static void main(String[] args) throws Exception {
        FileReader fr = new FileReader("test.txt");
        String data = "";
        int ch;

        while ((ch = fr.read()) != -1) {
            data += (char) ch;
        }

        fr.close();

        for (int i = data.length() - 1; i >= 0; i--) {
            System.out.print(data.charAt(i));
        }
    }
}