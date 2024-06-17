package org.example;

public class BankAccount {
    private double balance;

    public BankAccount(double intialBalance) {
        this.balance = intialBalance;
    }

    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
        }
    }

    public void withdraw(double amount) {
        if (amount <= balance) {
            balance -= amount;
        }
    }

    public double getBalance() {
        return balance;
    }


}
