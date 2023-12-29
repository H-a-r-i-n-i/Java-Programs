
package javaapplication3;


interface Account {
    void deposit(double amount);
    void withdraw(double amount);
    double checkBalance();
}

class SavingsAccount implements Account {
    private double balance;
SavingsAccount(double bal)
    {
        this.balance=bal;
    }
    @Override
    public void deposit(double amount) {
        balance += amount;
    }

    @Override
    public void withdraw(double amount) {
        if (balance >= amount) {
            balance -= amount;
        } else {
            System.out.println("Insufficient funds");
        }
    }

    @Override
    public double checkBalance() {
        return balance;
    }
}

class CheckingAccount implements Account {
    private double balance;
    CheckingAccount(double bal)
    {
        this.balance=bal;
    }
    @Override
    public void deposit(double amount) {
        balance += amount;
    }

    @Override
    public void withdraw(double amount) {
        if (balance >= amount) {
            balance -= amount;
        } else {
            System.out.println("Insufficient funds");
        }
    }

    @Override
    public double checkBalance() {
        return balance;
    }
}

class LoanAccount implements Account {
    private double balance;
LoanAccount(double bal)
    {
        this.balance=bal;
    }
    @Override
    public void deposit(double amount) {
        balance += amount;
    }

    @Override
    public void withdraw(double amount) {
if (balance >= amount) {
            balance -= amount;
        } else {
            System.out.println("Insufficient funds");
        }    }

    @Override
    public double checkBalance() {
        return balance;
    }
}

