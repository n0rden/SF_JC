package usr.task14_1_bank;

public class Bank {

    private static int money = 10000;

    public Bank() {
        new Client().start();
        new Client().start();
        new Client().start();
    }

    public static synchronized void setMoney(int money) {
        Bank.money += money;
    }

    public int getMoney() {
        return money;
    }

    public static void main(String[] args) throws InterruptedException {
        Bank bank = new Bank();
        while(true) {
            System.out.println(bank.getMoney());
            Thread.sleep(1000);
        }
    }
}
