import java.util.*;

class Slip24Q3 {
    public static void main(String[] args) {

        ArrayList<String> students = new ArrayList<>();

        for (int i = 0; i < args.length; i++) {
            students.add(args[i]);
        }

        System.out.println("Student Names using Iterator:");

        Iterator<String> itr = students.iterator();

        while (itr.hasNext()) {
            System.out.println(itr.next());
        }

        System.out.println("\nStudent Names using ListIterator:");

        ListIterator<String> litr = students.listIterator(students.size());

        while (litr.hasPrevious()) {
            System.out.println(litr.previous());
        }
    }
}