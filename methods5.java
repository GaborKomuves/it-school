package challenge_05;

import java.util.Scanner;
public class methods5 {
    public static void main(String[] args) {
//        printFibonacci();
//        guessNumber();
//        choseMenu();
        breakStatement();
    }




    public static void printFibonacci() {
        int n = 10;
        int firstNum = 0;
        int secondNum = 1;

        for (int i = 1; i <= n; i++) {
            System.out.print(firstNum + " ");
            int nextNum = firstNum + secondNum;
            firstNum = secondNum;
            secondNum = nextNum;
        }
    }

    public static void guessNumber(){
        Scanner scanner = new Scanner(System.in);
        int predefinedNumber = 42; // acest numar trebuie ghicit
        int userGuess;

        System.out.println("Welcome to the Number Guessing Game!");
        System.out.println("Try to guess the predefined number.");

        do {
            System.out.print("Enter your guess: ");
            userGuess = scanner.nextInt();

            if (userGuess < predefinedNumber) {
                System.out.println("Too low! Try again.");
            } else if (userGuess > predefinedNumber) {
                System.out.println("Too high! Try again.");
            } else {
                System.out.println("Congratulations! You guessed the correct number.");
            }
        } while (userGuess != predefinedNumber);

        scanner.close();
    }





    /*
    10. Jump Statements
    Create a menu-driven program where the user is presented with options:
    Print "Hello World"
    Print the user's name.
    Exit.
    Based on the user's input, perform the necessary action. Once an action is completed, show the menu again, unless the user chooses the Exit
    option. Use jump statements to control the flow of the program.
 `   */
    public static void choseMenu(){
        Scanner scanner = new Scanner(System.in);
        String name = "";

        while (true) {
            System.out.println("Menu:");
            System.out.println("1. Print 'Hello World'");
            System.out.println("2. Print your name");
            System.out.println("3. Exit");
            System.out.print("Enter your choice (1/2/3): ");
            int choice = scanner.nextInt();
            scanner.nextLine();

            switch (choice) {
                case 1:
                    System.out.println("Hello World");
                    break;
                case 2:
                    System.out.print("Enter your name: ");
                    name = scanner.nextLine();
                    System.out.println("Hello, " + name);
                    break;
                case 3:
                    System.out.println("Exiting the program.");
                    System.exit(0);
                default:
                    System.out.println("Invalid choice. Please try again.");
                    break;
            }
            System.out.println();
        }

    }

    /*
       11. Break Statement
       Write a program that prompts the user to enter numbers. Calculate the average of these numbers. If the user enters 0, break out of the input
       loop and then print the average of the numbers entered so far.
`````*/
    public static void breakStatement(){
        Scanner scanner = new Scanner(System.in);
        int count = 0;
        double sum = 0;

        while (true) {
            System.out.print("Enter a number (enter 0 to stop): ");
            double number = scanner.nextDouble();

            if (number == 0) {
                break;
            }

            sum += number;
            count++;
        }

        if (count > 0) {
            double average = sum / count;
            System.out.println("The average of the numbers entered is: " + average);
        } else {
            System.out.println("No numbers were entered.");
        }
    }


}
