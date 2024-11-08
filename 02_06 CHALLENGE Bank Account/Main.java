public class Main {
    public static void main(String[] args) {

        BankAccount bankAccount1 = new BankAccount("Maya", 1000);
        BankAccount bankAccount2 = new BankAccount("Angelo", 500);

        // initBalance - 500 + 5000 - 150
        bankAccount1.withdraw(500);
        bankAccount1.deposit(5000);
        bankAccount1.withdraw(150);

        System.out.println("BankAccount 01 details: " +
                "Name: " + bankAccount1.getOwner() +
                ", Balance: " + bankAccount1.getInitialBalance());


        // deposit 20K => 500 + 20000 => 20500 = intiBalance
        bankAccount2.deposit(20000);

        // retrieve bankAccount2
        System.out.println("BankAccount 02 details: " +
                "Name: " + bankAccount2.getOwner() +
                ", Balance: " + bankAccount2.getInitialBalance());


    }
}
