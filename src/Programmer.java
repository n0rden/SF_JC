public class Programmer {

    private String name;
    private String company;
    private String position;

    public Programmer(String name, String company) {
        this.name = name;
        this.company = company;
        position = "intern";
    }

    public String getPosition() {
        return position;
    }

    public void work() {
        switch (position) {
            case "intern":
                position = "junior";
                break;
            case "junior":
                position = "middle";
                break;
            case "middle":
                position = "senior";
                break;
            case "senior":
                position = "lead";
                break;
            default:
                break;
        }
    }

    public static void main(String[] args) {
        Programmer programmer1 = new Programmer("Dan", "EPAM");
        System.out.println(programmer1.getPosition());
        programmer1.work();
        System.out.println(programmer1.getPosition());
        programmer1.work();
        System.out.println(programmer1.getPosition());
        programmer1.work();
        System.out.println(programmer1.getPosition());
        programmer1.work();
        System.out.println(programmer1.getPosition());
        programmer1.work();
        System.out.println(programmer1.getPosition());
    }
}
