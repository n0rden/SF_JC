public class Cat extends Animal {

    public Cat(){
        super(false, "milk & meat");
    }

    @Override
    public void sound() {
        System.out.println("meow!");
    }

    public static void main(String[] args) {
        Cat cat = new Cat();
        cat.sound();
        System.out.println(cat.getEats());
    }
}
