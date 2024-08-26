package challenge_06;

import java.util.HashSet;
import java.util.Set;
import java.util.Map;
import java.util.HashMap;

public class MLevel {
    public void main(String[] args) {


        /*
        Medium Level
    1. String Replacement
    o Description: Replace all occurrences of a substring in a string using StringBuilder.
    */
//        StringReplacementExample example = new StringReplacementExample();
//
//        String originalString = "The cat sat on the cat's mat.";
//        String targetSubstring = "cat";
//        String replacementSubstring = "dog";
//
//        String replacedString = example.replaceSubstring(originalString, targetSubstring, replacementSubstring);
//
//        System.out.println("Original: " + originalString);
//        System.out.println("Replaced: " + replacedString);

    /*
    2. Duplicate Character Remover
    o Description: Remove duplicate characters from a string using StringBuilder.
    */

//        DuplicateCharacterRemover remover = new DuplicateCharacterRemover();
//
//        String originalText = "programming";
//        String textWithoutDuplicates = remover.removeDuplicates(originalText);
//
//        System.out.println("Text original: " + originalText);
//        System.out.println("Text fără duplicate: " + textWithoutDuplicates);




        /*
    3. Inserting at Index
    o Description: Insert a string at a specified index in another string using StringBuilder.
    */

        InsertAtIndexExample example = new InsertAtIndexExample();

        String originalText = "Hello World!";
        String textToInsert = "Beautiful ";
        int index = 6;

        String resultText = example.insertStringAtIndex(originalText, textToInsert, index);

        System.out.println("Text original: " + originalText);
        System.out.println("Text rezultat: " + resultText);
        /*
    4. Frequency Counter
    o Description: Count the frequency of each character in a string using StringBuilder.
    */
        FrequencyCounter counter = new FrequencyCounter();

        String text = "hello world";
        String frequencyResult = counter.countCharacterFrequency(text);

        System.out.println("Frecvența caracterelor în text:");
        System.out.println(frequencyResult);



        /*
    5. Morse Code Converter
    o Description: Convert a string to Morse code using StringBuilder.
         */
    }

    public class StringReplacementExample {

        public String replaceSubstring(String original, String target, String replacement) {

            if (target.isEmpty()) {
                return original; // Dacă target este gol, nu are sens să continuăm
            }

            StringBuilder result = new StringBuilder();
            int startIndex = 0;
            int index;

            while ((index = original.indexOf(target, startIndex)) != -1) {

                result.append(original, startIndex, index);
                result.append(replacement);
                startIndex = index + target.length();
            }
            result.append(original.substring(startIndex));
            return result.toString();
        }


    }

    public class DuplicateCharacterRemover {

        public String removeDuplicates(String input) {
            StringBuilder result = new StringBuilder();
            Set<Character> seenCharacters = new HashSet<>();

            for (int i = 0; i < input.length(); i++) {
                char currentChar = input.charAt(i);
                if (!seenCharacters.contains(currentChar)) {
                    seenCharacters.add(currentChar); // Adăugăm caracterul la setul de caractere văzute
                    result.append(currentChar); // Adăugăm caracterul la rezultatul final
                }
            }

            return result.toString();
        }


    }

    public class InsertAtIndexExample {

        public String insertStringAtIndex(String original, String toInsert, int index) {

            if (index < 0 || index > original.length()) { // Verificăm dacă indexul este valid
                throw new IndexOutOfBoundsException("Indexul este în afara limitelor șirului original.");
            }

            StringBuilder result = new StringBuilder(original);
            result.insert(index, toInsert); // Inserăm șirul 'toInsert' la indexul specificat

            return result.toString();
        }
    }

    public class FrequencyCounter {

        public String countCharacterFrequency(String input) {
            // HashMap pentru a stoca frecvența fiecărui caracter
            Map<Character, Integer> frequencyMap = new HashMap<>();

            for (int i = 0; i < input.length(); i++) { // Parcurgem fiecare caracter din șir
                char currentChar = input.charAt(i);
                // Incrementăm contorul ....
                frequencyMap.put(currentChar, frequencyMap.getOrDefault(currentChar, 0) + 1);
            }

            // Folosim StringBuilder
            StringBuilder result = new StringBuilder();
            for (Map.Entry<Character, Integer> entry : frequencyMap.entrySet()) {
                result.append(entry.getKey())
                        .append(": ")
                        .append(entry.getValue())
                        .append("\n");
            }

            return result.toString();
        }


    }

}


