class BankAccount {
    double balance = 500;

    void deposit(double amount) {
        balance = balance + amount;
        System.out.println("Deposited: " + amount);
        System.out.println("Balance: " + balance);
    }

    void withdraw(double amount) {
        if (amount <= balance) {
            balance = balance - amount;
            System.out.println("Withdrawn: " + amount);
            System.out.println("Balance: " + balance);
        } else {
            System.out.println("Insufficient balance");
        }
    }
}

class SavingsAccount extends BankAccount {
    @Override
    void withdraw(double amount) {
        if (balance - amount >= 100) {
            balance = balance - amount;
            System.out.println("Withdrawn: " + amount);
            System.out.println("Balance: " + balance);
        } else {
            System.out.println("Withdrawal not allowed");
            System.out.println("Balance cannot fall below 100");
        }
    }
}

public class Main {
    public static void main(String[] args) {
        SavingsAccount account = new SavingsAccount();

        account.deposit(200);
        account.withdraw(550);
        account.withdraw(400);
    }
}