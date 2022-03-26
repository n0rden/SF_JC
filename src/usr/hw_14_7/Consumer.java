package usr.hw_14_7;

public class Consumer extends Thread {
    private final Warehouse warehouse;


    public Consumer(Warehouse warehouse) {
        this.warehouse = warehouse;
    }

    @Override
    public void run() {
        this.warehouse.remove();
    }
}
