package challenge_09_bank;

import java.util.Scanner;

public class BankingApplication {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // creare cont
        System.out.println("Welcome to the Simple Banking System.");
        System.out.print("Enter your name: ");
        String name = sc.nextLine();
        System.out.print("Enter your account number: ");
        String accountNumber = sc.nextLine();
        System.out.print("Enter initial deposit: ");
        double initialDeposit = sc.nextDouble();

        BankAccount account = new BankAccount(name, accountNumber, initialDeposit);

        // meniu
        int choice;
        do {
            System.out.println("\nBanking Menu:");
            System.out.println("1. Deposit");
            System.out.println("2. Withdraw");
            System.out.println("3. Check Balance");
            System.out.println("4. View Transaction History");
            System.out.println("5. Exit");
            System.out.print("Enter your choice: ");
            choice = sc.nextInt();

            switch (choice) {
                case 1:
                    System.out.print("Enter deposit amount: ");
                    double depositAmount = sc.nextDouble();
                    account.deposit(depositAmount);
                    break;

                case 2:
                    System.out.print("Enter withdrawal amount: ");
                    double withdrawalAmount = sc.nextDouble();
                    account.withdraw(withdrawalAmount);
                    break;

                case 3:
                    System.out.println("Current Balance: £" + account.getBalance());
                    break;

                case 4:
                    account.viewTransactionHistory();
                    break;

                case 5:
                    System.out.println("Thank you for using the Simple Banking System. Goodbye!");
                    break;

                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        } while (choice != 5);

        sc.close();
    }
}

