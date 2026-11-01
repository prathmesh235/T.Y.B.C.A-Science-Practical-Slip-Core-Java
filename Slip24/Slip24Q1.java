import java.util.*;

class Slip24Q1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of cities: ");
        int n = sc.nextInt();

        String city[] = new String[n];

        for (int i = 0; i < n; i++) {
            System.out.print("Enter city name: ");
            city[i] = sc.next();
        }

        Arrays.sort(city, Collections.reverseOrder());

        System.out.println("\nCities in Descending Order:");

        for (int i = 0; i < n; i++) {
            System.out.println(city[i]);
        }

        sc.close();
    }
}