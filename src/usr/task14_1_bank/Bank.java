package usr.task14_1_bank;

public class Bank {

    private static int money = 10000;

    public static synchronized void setMoney(int money) {
        Bank.money += money;
    }

    public static int getMoney() {
        return money;
    }

    public static void main(String[] args) throws InterruptedException {
        new Client().start();
        new Client().start();
        new Client().start();

        while (true) {
            System.out.println(Bank.getMoney());
            Thread.sleep(1000);
        }
    }
}
