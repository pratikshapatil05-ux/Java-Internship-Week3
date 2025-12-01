
class Student{
    String name;
    int age;
    double marks;

    void displayInfo() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Marks: " + marks);
    }
}

public class StudentTest{
    public static void main(String[] args) {
        Student s1 = new Student();
        s1.name = "Riya";
        s1.age = 19;
        s1.marks = 85.5;

        s1.displayInfo();
    }
}
