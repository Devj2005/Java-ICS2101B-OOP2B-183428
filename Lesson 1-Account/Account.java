public class Account {
    private double balance;

    public Account(double initialBalance) {
        balance = initialBalance;
    }

    public void deposit(double amount) {
        if (amount > 0) balance += amount;
    }

    public void withdraw(double amount) {
        if (amount > 0 && amount <= balance) balance -= amount;
    }

    public double getBalance() {
        return balance;
    }

    public static void main(String[] args) {
        Account acc = new Account(1000.0);
        acc.deposit(500.0);
        acc.withdraw(200.0);
        System.out.println("Final Balance: " + acc.getBalance());
    }
}
