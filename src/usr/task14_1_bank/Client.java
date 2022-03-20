package usr.task14_1_bank;

public class Client extends Thread {

    @Override
    public void run() {
        int MONEY_VOL = 1000;

        while (true) {
            Bank.setMoney(MONEY_VOL);
            Bank.setMoney(MONEY_VOL * (-1));
        }
    }
}
