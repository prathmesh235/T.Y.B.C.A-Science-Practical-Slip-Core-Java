// package game;

// public class Indoor {
//     Indoor() {
//         System.out.println("Indoor Games");
//     }

//     public void display() {
//         System.out.println("Chess");
//         System.out.println("Carrom");
//         System.out.println("Table Tennis");
//     }
// }


// package game;

// public class Outdoor {
//     Outdoor() {
//         System.out.println("Outdoor Games");
//     }

//     public void display() {
//         System.out.println("Cricket");
//         System.out.println("Football");
//         System.out.println("Kabaddi");
//     }
// }

import game.*;

class Slip7Q1 {
    public static void main(String[] args) {
        Indoor i = new Indoor();
        Outdoor o = new Outdoor();

        i.display();
        o.display();
    }
}