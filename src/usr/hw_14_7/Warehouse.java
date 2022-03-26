package usr.hw_14_7;

import java.util.Queue;
import java.util.concurrent.ConcurrentLinkedQueue;

public class Warehouse {

    Queue<Integer> products = new ConcurrentLinkedQueue<>();

    public void add() {
        while (products.size() > 3) {
            System.out.printf("Склад полон, погрузчик %s ожидает когда произойдет отгрузка товара со склада\n",
                    Thread.currentThread().getName());
            try {
                wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        this.products.add(1);
        System.out.printf("Погрузчик %s доставил товар на склад. \nКоличество товара на складе - %d шт.\n",
                Thread.currentThread().getName(), products.size());
    }

    public void remove() {
        while (products.isEmpty()) {
            System.out.printf("Склад пуст, погрузчик %s ожидает когда произойдет погрузка товара на склад\n",
                    Thread.currentThread().getName());
            try {
                wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        this.products.poll();
        System.out.printf("Погрузчик %s забрал товар со склада. \nКоличество товара на складе - %d шт.\n",
                Thread.currentThread().getName(), products.size());
    }
}
