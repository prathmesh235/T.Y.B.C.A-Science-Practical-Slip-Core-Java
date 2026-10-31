import java.util.*;

class Slip9Q2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        TreeSet<Integer> set = new TreeSet<Integer>();

        System.out.print("Enter number of integers: ");
        int n = sc.nextInt();

        for (int i = 0; i < n; i++) {
            System.out.print("Enter number: ");
            set.add(sc.nextInt());
        }

        System.out.println("Sorted Elements: " + set);

        System.out.print("Enter element to search: ");
        int key = sc.nextInt();

        if (set.contains(key))
            System.out.println("Element Found");
        else
            System.out.println("Element Not Found");
    }
}