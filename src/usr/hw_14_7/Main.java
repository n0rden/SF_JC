package usr.hw_14_7;

public class Main {
    public static void main(String[] args) {
        Warehouse warehouse = new Warehouse();

        new Thread(new Supplier(warehouse)).start();
        new Thread(new Supplier(warehouse)).start();
        new Thread(new Supplier(warehouse)).start();
        new Thread(new Supplier(warehouse)).start();
        new Thread(new Supplier(warehouse)).start();


    }
}
