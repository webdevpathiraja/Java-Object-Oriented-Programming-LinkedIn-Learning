public class BankAccount {
    private String owner;
    private double initialBalance;

    public BankAccount(String owner, double initialBalance) {
        this.owner = owner;
        this.initialBalance = initialBalance;
    }

    public String getOwner() {
        return owner;
    }

    public double getInitialBalance() {
        return initialBalance;
    }

    // if withdrawing amount is less than or equal to the balance
    // withdraw process can be done
    public double withdraw(double amount) {
        if (amount <= initialBalance) {
            this.initialBalance = initialBalance - amount;
        }
        return 0;
    }

    // if amount is not zero
    // te amount can be deposited to the bank account
    // adds up to the balance
    public double deposit(double amount) {
        if (amount > 0) {
            this.initialBalance = initialBalance + amount;
            return amount;
        }
        return 0;
    }
}
