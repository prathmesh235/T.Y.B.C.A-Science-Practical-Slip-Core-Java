import java.util.*;

class Slip8Q1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<String> cities = new ArrayList<String>();

        System.out.print("Enter number of cities: ");
        int n = sc.nextInt();

        for (int i = 0; i < n; i++) {
            System.out.print("Enter city name: ");
            cities.add(sc.next());
        }

        System.out.println("City List: " + cities);

        cities.clear();

        System.out.println("After removing all elements: " + cities);
    }
}