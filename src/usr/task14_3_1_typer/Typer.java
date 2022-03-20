package usr.task14_3_1_typer;

public class Typer extends Thread{

    private static Object lock = new Object();
    private String message;

    public Typer(String message) {
        this.message = message;
    }

    public void run() {
        synchronized (lock) {
            for (int i = 0; i < message.length(); i++) {
                System.out.print(message.charAt(i));

                try {
                    Thread.sleep(500);
                } catch (InterruptedException e) {
                    break;
                }
            }
        }
    }
}
