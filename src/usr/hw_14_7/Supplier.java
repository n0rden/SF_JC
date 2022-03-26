package usr.hw_14_7;

public class Supplier extends Thread {
    private final Warehouse warehouse;

    public Supplier(Warehouse warehouse) {
        this.warehouse = warehouse;
    }

    @Override
    public void run() {
        this.warehouse.add();
    }
}
