package session_5;

import java.util.Scanner;

public class session5 {

    public static void main(String[] args) {
//       whileExampleWithContinue();

//        nestedForExampleWithoutLabel();

//        boolean bol = nestedForExampleWithReturn();
//        if (bol){
//            System.out.println("Found it!");
//        }else System.out.println("Value not found!");
//
//        System.out.println("DONE!");

        doWhileExample();
        System.out.println("DONE!");
    }

    private static void whileExampleWithContinue() {
        int i = 0;
        int sum = 0;
        while (i <= 4) {
            if (i == 2) {
                i++;
                continue;
            }
            sum += 1;
            i++;
        }

        System.out.println("Sum is " + sum);

    }

    private static void doWhileExample(){
        Scanner scanner = new Scanner(System.in);
        int number;

        do {
            System.out.println("Enter a positive number");
            number = scanner.nextInt();
        }while (number <= 0);
    }

    private static void nestedForExampleWithoutLabel() {
        int[][] matrix = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
        int searchVal = 5;

        boolean found = false;
        for (int i = 0; i < matrix.length && !found; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                if (matrix[i][j] == searchVal) {
                    System.out.println("Fount it!");
                    found = true;
                    break;
                }
                System.out.println(matrix[i][j] + " ");
            }
        }
        System.out.println("DONE");
    }

    private static boolean nestedForExampleWithReturn(){
        int[][] matrix = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
        int searchVal = 5;

        boolean found = false;
        for (int i = 0; i < matrix.length && !found; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                if (matrix[i][j] == searchVal) {
                    System.out.println("Fount it!");
                   return true;
                }
                System.out.println(matrix[i][j] + " ");
            }
        }
        return false;
    }
}


