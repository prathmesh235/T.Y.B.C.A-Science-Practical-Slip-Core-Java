class Traffic implements Runnable {
    public void run() {
        try {
            System.out.println("RED - STOP");
            Thread.sleep(2000);

            System.out.println("YELLOW - WAIT");
            Thread.sleep(2000);

            System.out.println("GREEN - GO");
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}

class Slip15Q3 {
    public static void main(String[] args) {
        Traffic t = new Traffic();
        Thread th = new Thread(t);
        th.start();
    }
}