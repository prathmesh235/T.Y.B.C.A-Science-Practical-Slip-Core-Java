package game;

public class Indoor {
    String game;
    String players[];

    public Indoor() {
        game = "Chess";
        players = new String[]{"Rahul", "Amit"};
    }

    public Indoor(String g, String p[]) {
        game = g;
        players = p;
    }

    public void display() {
        System.out.println("Indoor Game: " + game);
        for (String p : players) {
            System.out.println(p);
        }
    }
}