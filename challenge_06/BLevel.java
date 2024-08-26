package challenge_06;
import java.util.Scanner;

public class BLevel {
    public static void main(String[] args) {
        /*
        1. Reverse a String
            o Description: Write a program to reverse an input string using StringBuilder
         */
//        ReversString();


         /*
            2. Palindrome Checker
            o Description: Check if a string is a palindrome using StringBuilder.
            */
//        PalindromeChecker();

        /*
            3. Concatenate Multiple Strings
            o Description: Efficiently concatenate multiple strings into one using StringBuilder.
          */
//        ConcatenateStrings();



        /*
            4. Removing Vowels
            o Description: Remove all vowels from a string using StringBuilder.
*/
//      RemoveVowels();


        /*
            5. Word Capitalizer
            o Description: Capitalize the first letter of every word in a sentence using StringBuilder.
         */
        WordCapitalizer();





    }

    public static void ReversString(){

        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a string to reverse: ");
        String input = scanner.nextLine();


        StringBuilder reversedString = new StringBuilder(input);
        reversedString.reverse();

        System.out.println("Reversed string: " + reversedString.toString());
        scanner.close();
    }


    public static void PalindromeChecker(){

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string to check if it's a palindrome: ");
        String input = sc.nextLine();


        String lowerCaseInput = input.toLowerCase();


        StringBuilder reversedString = new StringBuilder(lowerCaseInput);
        reversedString.reverse();


        if (lowerCaseInput.equals(reversedString.toString())) {
            System.out.println("The string is a palindrome.");
        } else {
            System.out.println("The string is not a palindrome.");
        }
        sc.close();
    }

    public static void ConcatenateStrings(){
        Scanner citeste = new Scanner(System.in);

        System.out.print("Enter the number of strings to concatenate: ");
        int numStrings = citeste.nextInt();
        citeste.nextLine();

        StringBuilder concatenatedString = new StringBuilder();


        for (int i = 1; i <= numStrings; i++) {
            System.out.print("Enter string " + i + ": ");
            String inputString = citeste.nextLine();
            concatenatedString.append(inputString);
        }
        System.out.println("Concatenated string: " + concatenatedString.toString());
        citeste.close();
    }

    public static void RemoveVowels(){
        // Create a Scanner object to read input from the user
        Scanner scanner = new Scanner(System.in);

        // Ask the user to enter a string
        System.out.print("Enter a string to remove vowels: ");
        String input = scanner.nextLine();

        // Create a StringBuilder object to build the new string without vowels
        StringBuilder result = new StringBuilder();

        // Loop through each character in the input string
        for (int i = 0; i < input.length(); i++) {
            char currentChar = input.charAt(i);

            // Check if the character is not a vowel
            if (!isVowel(currentChar)) {
                result.append(currentChar);
            }
        }

        // Print the string after removing vowels
        System.out.println("String after removing vowels: " + result.toString());

        // Close the scanner
        scanner.close();
    }
//    clasa boleana ajuta clasa RemoveVocals
    public static boolean isVowel(char c) {
        // Convert the character to lowercase for easy comparison
        c = Character.toLowerCase(c);
        return c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u';
    }


    public static void WordCapitalizer(){
        // Create a Scanner object to read input from the user
        Scanner scanner = new Scanner(System.in);

        // Ask the user to enter a sentence
        System.out.print("Enter a sentence: ");
        String input = scanner.nextLine();

        // Create a StringBuilder to build the capitalized sentence
        StringBuilder capitalizedSentence = new StringBuilder();

        // Split the sentence into words
        String[] words = input.split(" ");

        // Loop through each word
        for (String word : words) {
            if (word.length() > 0) {
                // Capitalize the first letter of each word and append it to the StringBuilder
                capitalizedSentence.append(Character.toUpperCase(word.charAt(0)))
                        .append(word.substring(1))
                        .append(" ");
            }
        }

        // Convert the StringBuilder to a String and trim any trailing spaces
        String result = capitalizedSentence.toString().trim();

        // Print the capitalized sentence
        System.out.println("Capitalized sentence: " + result);

        // Close the scanner
        scanner.close();
    }



}
