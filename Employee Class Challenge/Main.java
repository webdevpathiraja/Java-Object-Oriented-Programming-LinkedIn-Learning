public class Main {
    public static void main(String[] args) {

        // 2 employee with different ages
        Employee employee1 = new Employee("John", 65, 300000, "london");
        Employee employee2 = new Employee("Kripa", 32, 100000, "Sri Lanka");

        // raiseSalary for both
        employee1.raiseSalary();
        employee2.raiseSalary();

        System.out.println(employee1.name + "'s salary: " + employee1.salary);
        System.out.println(employee2.name + "'s salary: " + employee2.salary);

    }
}
