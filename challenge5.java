package challenge_05;

import java.util.Scanner;

public class challenge5 {
    public static void main(String[] args) {
        /*
        1. Even or Odd Checker
        Write a Java program that takes an integer as input. If the number is even, print "Even". If it's odd, print "Odd".
        */

//        Scanner scanner = new Scanner(System.in);
//        System.out.print("Enter an integer number: ");
//        int number = scanner.nextInt();
//        scanner.close();
//
//        if (number % 2 == 0) {
//            System.out.println("The number is 'Even'!");
//        } else {
//            System.out.println("The number is 'Odd'!");
//        }

        
       /*
        2. Month Name Finder
        Write a program that asks the user to enter a number between 1 and 12. Print the name of the
        corresponding month or "Invalid Month" if out of range.
//        */
//        Scanner sc = new Scanner(System.in);
//        System.out.print("Enter an integer number for the month of a year: ");
//        int month = sc.nextInt();
//        sc.close();

//        switch (month){
//            default -> System.out.println("You did not enter any numbers");
//            case 1 -> System.out.println("January");
//            case 2 -> System.out.println("February");
//            case 3 -> System.out.println("March");
//            case 4 -> System.out.println("April");
//            case 5 -> System.out.println("May");
//            case 6 -> System.out.println("June");
//            case 7 -> System.out.println("July");
//            case 8 -> System.out.println("August");
//            case 9 -> System.out.println("September");
//            case 10 -> System.out.println("October");
//            case 11 -> System.out.println("November");
//            case 12 -> System.out.println("December");
//        }




        /*
        3. Counting Negative Numbers
        Given an array of integers, write a program to count and print the number of
        negative integers in the array.
        */

//        int[] arr = {-1, -10, 1, -7, -9, -4, -6};
//
//        int counter = 0;
//        for (int i = 0; i < arr.length; i++) {
//            if (arr[i] < 0) {
//                counter++;
//            }
//        }
//        System.out.println("Number of negative integers in the array: " + counter);


        /*
        4. String Reverser
        Ask the user to enter a string. Print the reversed version of this string.
        */

//        Scanner scanner = new Scanner(System.in);
//        System.out.print("Enter the string: ");
//        String string = scanner.nextLine();
//
//
//        String reversed = "";
//        for (int i = string.length() - 1; i >= 0; i--) {
//            reversed += string.charAt(i);
//        }
//        System.out.println("Reversed String is: " + reversed);
//        scanner.close();



        /*

        5. Fibonacci Series Generator
        Write a program that generates and prints the first n numbers of the Fibonacci series,
        where n is provided by the user
         */

//        Scanner scanner = new Scanner(System.in);
//        System.out.print("Enter the number or Fibonacci terms to generate: ");
//        int n = scanner.nextInt();
//
//        int firstTerm = 0;
//        int secondTerm = 1;
//        System.out.println("The first " + n + " terms of Fibonacci series are: ");
//        for (int i = 0; i < n; i++) {
//            System.out.println(firstTerm + " ");
//            int nextTerm = firstTerm + secondTerm;
//            firstTerm = secondTerm;
//            secondTerm = nextTerm;
//        }
//
//        scanner.close();

        /*
        6. While Loop
        Write a program that asks the user to enter numbers. The program should continue prompting the user until they enter -1. After they enter -1,
        print the sum of all numbers entered (excluding -1).
        */

//        Scanner scanner = new Scanner(System.in);
//        int sum = 0;
//        int number;
//
//        while (true) {
//            System.out.print("Enter a number (-1 to stop): ");
//            number = scanner.nextInt();
//
//            if (number == -1) {
//                break;
//            }
//            sum += number;
//        }
//        System.out.println("The sum of all entered numbers is: " + sum);
//        scanner.close();


        /*
        7. Do-While Loop
        Create a program where the user is prompted to guess a predefined number. After each guess, the program should inform the user if the guess
        is too high or too low. The program should keep prompting the user until they guess correctly. Using a do-while loop, ensure the user is always
        asked at least once.
        */
//
//        Scanner scanner = new Scanner(System.in);
//        int predefinedNumber = 42; // acest numar trebuie ghicit
//        int userGuess;
//
//        System.out.println("Welcome to the Number Guessing Game!");
//        System.out.println("Try to guess the predefined number.");
//
//        do {
//            System.out.print("Enter your guess: ");
//            userGuess = scanner.nextInt();
//
//            if (userGuess < predefinedNumber) {
//                System.out.println("Too low! Try again.");
//            } else if (userGuess > predefinedNumber) {
//                System.out.println("Too high! Try again.");
//            } else {
//                System.out.println("Congratulations! You guessed the correct number.");
//            }
//        } while (userGuess != predefinedNumber);
//
//        scanner.close();
//

        /*
        8. For Loop
        Write a program that prints the first 10 numbers in the Fibonacci series. Use a for loop to accomplish this.
         */

//        int n = 10;
//        int firstNum = 0;
//        int secondNum = 1;
//
//        for (int i = 1; i <= n; i++) {
//            System.out.println(firstNum + " ");
//            int nextNum = firstNum + secondNum;
//            firstNum = secondNum;
//            secondNum = nextNum;
//
//        }


        /*
        9. For-Each Loop
        Given an array of integers, write a program that prints each number in the array followed by "Even" if the number is even, or "Odd" if the
        number is odd. Utilize a for-each loop for this task
         */

//        int[] myArr = {1,2,3,7,8,4,10};
//
//        for (int num : myArr) {
//            if (num % 2 == 0) {
//                System.out.println(num + " Even");
//            }else {
//                System.out.println(num + " Odd");
//            }
//        }

        /*
        10. Jump Statements
        Create a menu-driven program where the user is presented with options:
        Print "Hello World"
        Print the user's name.
        Exit.
        Based on the user's input, perform the necessary action. Once an action is completed, show the menu again, unless the user chooses the Exit
        option. Use jump statements to control the flow of the program.
        */

//        Scanner scanner = new Scanner(System.in);
//        String name = "";
//
//        while (true) {
//            System.out.println("Menu:");
//            System.out.println("1. Print 'Hello World'");
//            System.out.println("2. Print your name");
//            System.out.println("3. Exit");
//            System.out.print("Enter your choice (1/2/3): ");
//            int choice = scanner.nextInt();
//            scanner.nextLine(); // Consume the newline character
//
//            switch (choice) {
//                case 1:
//                    System.out.println("Hello World");
//                    break;
//                case 2:
//                    System.out.print("Enter your name: ");
//                    name = scanner.nextLine();
//                    System.out.println("Hello, " + name);
//                    break;
//                case 3:
//                    System.out.println("Exiting the program.");
//                    System.exit(0); // Exit the program
//                default:
//                    System.out.println("Invalid choice. Please try again.");
//                    break;
//            }
//            System.out.println(); // Print a blank line for better readability
//        }
        /*
        11. Break Statement
        Write a program that prompts the user to enter numbers. Calculate the average of these numbers. If the user enters 0, break out of the input
        loop and then print the average of the numbers entered so far.
         */
//        Scanner sc = new Scanner(System.in);
//        int sum = 0;
//
//        System.out.println("Please enter 10 numbers:");
//
//        for (int i = 0; i < 10; i++) {
//            System.out.print("Enter number " + (i + 1) + ": ");
//            int number = sc.nextInt();
//
//            if (number <= 5) {
//                continue;
//            }
//
//            sum += number;
//        }

//        System.out.println("The sum of all numbers greater than 5 is: " + sum);




        /*
        12. Continue Statement
        Create a program that asks the user for 10 numbers. Print the sum of all numbers that are greater than 5.
        If the user enters a number less than or equal to 5, use the continue statement to skip the addition for that number.
         */

        Scanner reader = new Scanner(System.in);
        int sum = 0;

        System.out.println("Please enter 10 numbers:");

        for (int i = 0; i < 10; i++) {
            System.out.print("Enter number " + (i + 1) + ": ");
            int number = reader.nextInt();

            if (number <= 5) {
                continue;
            }

            sum += number;
        }

        System.out.println("The sum of all numbers greater than 5 is: " + sum);

        /*
        13. Pathfinding in a Maze
        Consider a simple maze represented by a 2D grid. The maze consists of open cells, walls, a start, and an end. You have to find a path from the
        start to the end, moving only up, down, left, or right. You can't move diagonally. If a path exists, print it; otherwise, inform the user that there's
        no solution.
        The maze will be represented by a 2D array where:
        0 represents an open cell.
        1 represents a wall.
        S represents the start.
        E represents the end.
        Example:
        S 1 0 1
        0 1 0 1
        0 1 0 1
        1 0 0 E
        Problem Tasks:
        Read the maze layout from a file or hard-code it into your program.
        Implement a pathfinding algorithm to navigate from the start to the end.
        If a path is found, print the maze with the path. You can represent the path with a *.
        If no path exists, print "No solution found."

        Hints:
        Consider using a Depth-First Search (DFS) or Breadth-First Search (BFS) algorithm for pathfinding.
        You might want to represent the maze using a class with methods to detect neighbors, check for walls, et
         */


        /*
        Questions to look answers for:
        - How do I calculate space and time complexity?

        - How do I know when my code is hard to understand by others?
        When in our code:
        Comments are missing
        Pour name convention.
        Lack of formating, or indentation of code.
         */
    }


}

