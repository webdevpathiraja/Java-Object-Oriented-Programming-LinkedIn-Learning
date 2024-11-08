public class SalesPerson extends Employee{
//    private String name;
//    private double salary;
//    private int age;
    private double commissionPercentage;


    public SalesPerson(String name, double salary, int age, double commissionPercentage) {
        super(name, salary, age);
//        this.name = name;
//        this.salary = salary;
//        this.age = age;
        this.commissionPercentage = commissionPercentage;
    }

    public double getCommissionPercentage() {
        return this.commissionPercentage;
    }

//    public void raiseSalary() {
//        this.salary = this.salary * 1.2;
//    }

    public void raiseCommission() {
        if(this.commissionPercentage < 0.30) {
            this.commissionPercentage = this.commissionPercentage * 1.2;
        }
    }

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

}
