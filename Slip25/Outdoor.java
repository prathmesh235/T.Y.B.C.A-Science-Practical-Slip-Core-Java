package game;

public class Outdoor {
    String game;
    String players[];

    public Outdoor() {
        game = "Cricket";
        players = new String[]{"Rohit", "Virat", "Dhoni"};
    }

    public Outdoor(String g, String p[]) {
        game = g;
        players = p;
    }

    public void display() {
        System.out.println("Outdoor Game: " + game);
        for (String p : players) {
            System.out.println(p);
        }
    }
}