class Person{
    String name;
    int age;

    void show() {
        System.out.println(name + " - " + age);
    }
}

public class MultipleObjects{
    public static void main(String[] args) {
        Person p1 = new Person();
        Person p2 = new Person();

        p1.name = "Anita";
        p1.age = 22;

        p2.name = "Rahul";
        p2.age = 25;

        p1.show();
        p2.show();
    }
}
