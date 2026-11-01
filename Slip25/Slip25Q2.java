import game.*;

class Slip25Q2 {
    public static void main(String[] args) {

        Indoor i = new Indoor();
        Outdoor o = new Outdoor();

        i.display();
        System.out.println();

        o.display();

        // Parameterized constructors
        Indoor i1 = new Indoor("Carrom",
                new String[]{"Raj", "Amit"});

        Outdoor o1 = new Outdoor("Football",
                new String[]{"Ram", "Sham"});

        System.out.println("\nParameterized Constructor:");
        i1.display();
        o1.display();
    }
}