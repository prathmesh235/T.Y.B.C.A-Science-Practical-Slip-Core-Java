import java.util.Arrays;
import java.util.Scanner;

class Slip2Q1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of cities: ");
        int n = sc.nextInt();

        String city[] = new String[n];

        System.out.println("Enter city names:");
        for (int i = 0; i < n; i++) {
            city[i] = sc.next();
        }

        Arrays.sort(city, java.util.Collections.reverseOrder());

        System.out.println("Cities in Descending Order:");
        for (int i = 0; i < n; i++) {
            System.out.println(city[i]);
        }

        sc.close();
    }
}