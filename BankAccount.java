package challenge_09_bank;

import java.util.ArrayList;
import java.util.List;

public class BankAccount {
    private String accountHolderName;
    private String accountNumber;
    private double balance;
    private List<String> transactionHistory;


    //constructor
    public BankAccount(String accountHolderName, String accountNumber, double initialDeposit) {
        this.accountHolderName = accountHolderName;
        this.accountNumber = accountNumber;
        this.balance = initialDeposit;
        this.transactionHistory = new ArrayList<>();
        addTransaction("Account opened with initial deposit: £" + initialDeposit);
    }

    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            addTransaction("Deposited: £" + amount);
        } else {
            System.out.println("Deposit amount must be positive.");
        }
    }

    public void withdraw(double amount) {
        if (amount > 0 && amount <= balance) {
            balance -= amount;
            addTransaction("Withdrew: £" + amount);
        } else {
            System.out.println("Invalid withdrawal amount or insufficient balance.");
        }
    }

    public double getBalance() {
        return balance;
    }

    public void viewTransactionHistory() {
        System.out.println("Transaction History for Account " + accountNumber + ":");
        for (String transaction : transactionHistory) {
            System.out.println(transaction);
        }
    }

    private void addTransaction(String transactionDetail) {
        transactionHistory.add(transactionDetail + " | Balance: £" + balance);
    }
}

