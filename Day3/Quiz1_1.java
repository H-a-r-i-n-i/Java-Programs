/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Day3;
    import java.util.Scanner;


class BankAccount {
    private int accountId;
    private String name;
    private double balance;

    public BankAccount(int accountId, String name, double balance) {
        this.accountId = accountId;
        this.name = name;
        this.balance = balance;
    }

    public void transferTo(BankAccount anotherAccount, double amount) {
        if (this.balance >= amount) {
            this.balance -= amount;
            anotherAccount.balance += amount;
            printReceipt(anotherAccount);
        } else {
            System.out.println("Insufficient funds to make the transfer.");
        }
    }

    public void printReceipt(BankAccount account) {
        System.out.println("Account id: " + account.accountId);
        System.out.println("Name: " + account.name);
        System.out.println("Account Balance: Rs. " + account.balance);
        System.out.println("----------------------------------------");
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter details for Account A:");
        System.out.println("Account ID:");
        int accountIdA = scanner.nextInt();
        System.out.println("Account Name:");
        scanner.nextLine(); // Consume the newline character
        String accountNameA = scanner.nextLine();
        System.out.println("Initial Balance for Account A:");
        double initialBalanceA = scanner.nextDouble();

        System.out.println("Enter details for Account B:");
        System.out.println("Account ID:");
        int accountIdB = scanner.nextInt();
        System.out.println("Account Name:");
        scanner.nextLine(); 
        String accountNameB = scanner.nextLine();
        System.out.println("Initial Balance for Account B:");
        double initialBalanceB = scanner.nextDouble();

        BankAccount accountA = new BankAccount(accountIdA, accountNameA, initialBalanceA);
        BankAccount accountB = new BankAccount(accountIdB, accountNameB, initialBalanceB);

        System.out.println("Initial Balances:");
        accountA.printReceipt(accountA);
        accountB.printReceipt(accountB);

        System.out.println("Enter the amount to transfer from Account A to Account B:");
        double transferAB = scanner.nextDouble();
        accountA.transferTo(accountB, transferAB);

        System.out.println("Enter the amount to transfer from Account B to Account A:");
        double transferBA = scanner.nextDouble();
        accountB.transferTo(accountA, transferBA);

        System.out.println("Final Balances:");
        accountA.printReceipt(accountA);
        accountB.printReceipt(accountB);

        scanner.close();
    }
}


