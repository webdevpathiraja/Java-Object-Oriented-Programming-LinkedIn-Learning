// commented methods and instance variables (fields)
// are inherited from the Employee superclass.

public class Analyst extends Employee {
//    private String name;
//    private double salary;
//    private int age;
//
    public Analyst(String name, double salary, int age) {
        super(name, salary, age);
//        this.name = name;
//        this.salary = salary;
//        this.age = age;
    }
//
//    public String getName() {
//        return name;
//    }
//
//    public double getSalary() {
//        return salary;
//    }
//
//    public int getAge() {
//        return age;
//    }

    public double getAnnualBonus() {
        return super.salary * 0.05;
    }

//    public void raiseSalary() {
//        this.salary = this.salary * 1.2;
//    }
}
