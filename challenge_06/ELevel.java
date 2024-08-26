package challenge_06;

import static challenge_06.ELevel.AnagramChecker.areAnagrams;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Random;

public class ELevel {
    public static void main(String[] args) {



        /*
        Expert Level
        1. Encode and Decode using Caesar Cipher
        o Description: Implement a Caesar Cipher encoder and decoder using StringBuilder.
        */
//        String text = "Hello World!";
//        int shift = 3;
//
//        String encodedText = caesarCipher(text, shift, true);
//        System.out.println("Encoded: " + encodedText);
//
//        String decodedText = caesarCipher(encodedText, shift, false);
//        System.out.println("Decoded: " + decodedText);



        /*
        2. CamelCase to Snake_case Converter
        o Description: Convert a CamelCase string to snake_case using StringBuilder.
        */

//        String camelCaseString = "CamelCaseToSnakeCaseConverter";
//        System.out.println("Before conversion the String is: " + camelCaseString);
//        String snakeCaseString = camelToSnake(camelCaseString);
//        System.out.println("Snake Case: " + snakeCaseString);

         /*
        3. Expand Compressed Strings
        o Description: Expand a compressed string (e.g., "a3b2c4" -> "aaabbc") using StringBuilder.
        4. Remove Comments from Code
        o Description: Remove single line (//) and multi-line () comments from code using StringBuilder.
        5. Anagram Checker
        o Description: Check if two strings are anagrams using StringBuilder.
          */
        String string1 = "Listen";
        String string2 = "Silent";

        boolean result = areAnagrams(string1, string2);
        if (result) {
            System.out.println(string1 + " and " + string2 + " are anagrams.");
        } else {
            System.out.println(string1 + " and " + string2 + " are not anagrams.");
        }





        /*
        6. Toggling Case
        o Description: Toggle the case of every character in a string using StringBuilder.
         */
    }

    public static String caesarCipher(String text, int shift, boolean encode) {
        StringBuilder result = new StringBuilder();

        if (!encode) {
            shift = -shift;
        }

        for (int i = 0; i < text.length(); i++) {
            char currentChar = text.charAt(i);


            if (Character.isLetter(currentChar)) {
                char base = Character.isUpperCase(currentChar) ? 'A' : 'a';
                // Shift the character and wrap around the alphabet
                char newChar = (char) ((currentChar - base + shift + 26) % 26 + base);
                result.append(newChar);
            } else {

                result.append(currentChar);
            }
        }
        return result.toString();

    }

    public static String camelToSnake(String camelCase) {
        StringBuilder snakeCase = new StringBuilder();

        for (char character : camelCase.toCharArray()) {


            if (Character.isUpperCase(character)) {
                if (snakeCase.length() > 0) {
                    snakeCase.append('_');
                }
                snakeCase.append(Character.toLowerCase(character));
            } else {
                snakeCase.append(character);
            }
        }

        return snakeCase.toString();
    }

    public static class AnagramChecker {

        // Method to check if two strings are anagrams
        public static boolean areAnagrams(String str1, String str2) {
            // Remove any white spaces and convert strings to lowercase
            str1 = str1.replaceAll("\\s", "").toLowerCase();
            str2 = str2.replaceAll("\\s", "").toLowerCase();

            // If lengths differ, they can't be anagrams
            if (str1.length() != str2.length()) {
                return false;
            }

            // Convert strings to character arrays
            char[] charArray1 = str1.toCharArray();
            char[] charArray2 = str2.toCharArray();

            // Sort both character arrays
            Arrays.sort(charArray1);
            Arrays.sort(charArray2);

            // Use StringBuilder to create sorted strings
            StringBuilder sortedStr1 = new StringBuilder();
            StringBuilder sortedStr2 = new StringBuilder();

            for (char c : charArray1) {
                sortedStr1.append(c);
            }

            for (char c : charArray2) {
                sortedStr2.append(c);
            }

            // Compare the sorted strings
            return sortedStr1.toString().equals(sortedStr2.toString());
        }


    }
}
