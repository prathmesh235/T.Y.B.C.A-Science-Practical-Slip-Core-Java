import java.util.*;

class Slip14Q2 {
    public static void main(String[] args) {

        LinkedList<String> colors = new LinkedList<>();

        colors.add("Red");
        colors.add("Blue");
        colors.add("Yellow");
        colors.add("Orange");

        // i. Display using Iterator
        System.out.println("List using Iterator:");
        Iterator<String> i = colors.iterator();

        while (i.hasNext()) {
            System.out.println(i.next());
        }

        // ii. Display in reverse using ListIterator
        System.out.println("\nReverse List:");
        ListIterator<String> li = colors.listIterator(colors.size());

        while (li.hasPrevious()) {
            System.out.println(li.previous());
        }

        // iii. Insert Pink and Green between Blue and Yellow
        LinkedList<String> newColors = new LinkedList<>();
        newColors.add("Pink");
        newColors.add("Green");

        colors.addAll(2, newColors);

        System.out.println("\nFinal List: " + colors);
    }
}