import java.util.Scanner;

class CricketPlayer {
    String name;
    int no_of_innings, no_of_times_notout, total_runs;
    double bat_avg;

    CricketPlayer(String n, int i, int no, int r) {
        name = n;
        no_of_innings = i;
        no_of_times_notout = no;
        total_runs = r;
    }

    static void avg(CricketPlayer p) {
        try {
            p.bat_avg = (double) p.total_runs /
                    (p.no_of_innings - p.no_of_times_notout);
        } catch (ArithmeticException e) {
            p.bat_avg = 0;
        }
    }

    static void sortPlayer(CricketPlayer p[], int n) {
        for (int i = 0; i < n - 1; i++) {
            for (int j = i + 1; j < n; j++) {
                if (p[i].bat_avg < p[j].bat_avg) {
                    CricketPlayer temp = p[i];
                    p[i] = p[j];
                    p[j] = temp;
                }
            }
        }
    }

    void display() {
        System.out.println(name + "\t" + bat_avg);
    }
}

class Slip4Q2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of players: ");
        int n = sc.nextInt();

        CricketPlayer p[] = new CricketPlayer[n];

        for (int i = 0; i < n; i++) {
            System.out.print("Enter name, innings, notout, runs: ");
            String name = sc.next();
            int innings = sc.nextInt();
            int notout = sc.nextInt();
            int runs = sc.nextInt();

            p[i] = new CricketPlayer(name, innings, notout, runs);
            CricketPlayer.avg(p[i]);
        }

        CricketPlayer.sortPlayer(p, n);

        System.out.println("\nPlayer\tAverage");
        for (int i = 0; i < n; i++) {
            p[i].display();
        }

        sc.close();
    }
}