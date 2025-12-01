class Employee{
    private String name;
    private double salary;

    public void setName(String n){
        name = n;
    }

    public String getName(){
        return name;
    }

    public void setSalary(double s){
        if (s >= 0){
            salary = s;
        }
    }

    public double getSalary(){
        return salary;
    }
}

public class EncapsulationDemo{
    public static void main(String[] args) {
        Employee e = new Employee();

        e.setName("Pooja");
        e.setSalary(45000);

        System.out.println("Name: " + e.getName());
        System.out.println("Salary: " + e.getSalary());
    }
}
