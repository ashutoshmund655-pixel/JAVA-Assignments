class BankAccount {
    double balance = 500;

    void deposit(double amount) {
        balance = balance + amount;  
        System.out.println("Deposit: " + amount);
    }

    void withdraw(double amount) {
        balance = balance - amount;
        System.out.println("Withdraw: " + amount);
    }
}

class SavingsAccount extends BankAccount {
    void withdraw(double amount) {
        if (balance - amount < 100) {
            System.out.println("Withdraw not possible");
        } else {
            balance = balance - amount;
            System.out.println("Withdraw: " + amount);
        }
    }
}

public class Main {
    public static void main(String args[]) {
        SavingsAccount s = new SavingsAccount();

        s.deposit(200);
        s.withdraw(400);

        System.out.println("Balance: " + s.balance);
    }
}