package usr.homework.m7_5;

abstract public class Person {
    private String fullName;
    private String sex;
    private int age;

    public Person(String fullName, String sex, int age) {
        this.fullName = fullName;
        this.sex = sex;
        this.age = age;
    }

    public String getFullName() {
        return fullName;
    }

    public String getSex() {
        return sex;
    }

    public int getAge() {
        return age;
    }

    abstract public String toString();
}
