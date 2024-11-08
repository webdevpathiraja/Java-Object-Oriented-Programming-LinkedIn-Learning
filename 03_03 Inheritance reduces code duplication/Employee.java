public class Employee {
    private String name;
//    private double salary;
    protected double salary;
    private int age;

    public Employee(String name, double salary, int age) {
        this.name = name;
        this.salary = salary;
        this.age = age;
    }


    public String getName() {
        return name;
    }

    public double getSalary() {
        return salary;
    }

    public int getAge() {
        return age;
    }

    public void raiseSalary() {
        this.salary = this.salary * 1.2;
    }
}
