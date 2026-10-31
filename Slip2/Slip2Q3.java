import java.util.*;

class Slip2Q3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Hashtable<String, Double> ht = new Hashtable<>();

        ht.put("Rahul", 25000.0);
        ht.put("Amit", 30000.0);
        ht.put("Prathmesh", 35000.0);
        ht.put("Rohit", 28000.0);

        System.out.println("Employee Details:");
        System.out.println(ht);

        System.out.print("Enter employee name to search: ");
        String name = sc.next();

        if (ht.containsKey(name)) {
            System.out.println("Salary = " + ht.get(name));
        } else {
            System.out.println("Employee Not Found");
        }

        sc.close();
    }
}