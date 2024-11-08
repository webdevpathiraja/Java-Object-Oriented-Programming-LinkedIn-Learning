public class Employee {
    // non-static => vary based on each employee's instance
    String name;
    int age;
    double salary;
    String location;

    public Employee(String name, int age, double salary, String location) {
        this.name = name;
        this.age = age;
        this.salary = salary;
        this.location = location;
    }

    void raiseSalary() {
        if(this.age > 60) {
            this.salary = this.salary + 25000;
        }
    }
}
