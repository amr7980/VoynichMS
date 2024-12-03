/** Project:VoynichMS
 * Purpose Details:ItalianAlphabetKey
 * Course:IST242
 * Author:Aidan Ramirez
 * Date Developed:12/1/24
 * Last Date Changed:
 * Rev:

 */

//Below is an Italian Alphabet Key
//Based on the Latin alphabet excluding "J, K, W, X, and Y"
//This will only recognize letters in the "String text"

//It is believed the VoynichMS may originate from Italy

import java.util.HashMap;
import java.util.Map;

public class ItalianAlphabetKey {
    public static void main(String[] args) {
        // Sample input string (could be any Italian text)
        String text = "";

        // Calling the method to generate the Italian alphabet key
        Map<Character, Integer> italianAlphabetKey = generateItalianAlphabetKey(text);

        // Printing the Italian alphabet key (frequency of letters A-Z)
        for (char letter = 'A'; letter <= 'Z'; letter++) {
            int count = italianAlphabetKey.getOrDefault(letter, 0); // Default to 0 if letter is not found
            System.out.println(letter + ": " + count);
        }
    }

    // Method to generate Italian alphabet key (frequency count for A-Z)
    public static Map<Character, Integer> generateItalianAlphabetKey(String text) {
        // Creating a HashMap to store letters and their frequencies
        Map<Character, Integer> letterCount = new HashMap<>();

        // Converting the text to uppercase and iterating through each character
        for (char c : text.toUpperCase().toCharArray()) {
            // Only count characters in the Italian alphabet (A-Z)
            if (c >= 'A' && c <= 'Z') {
                letterCount.put(c, letterCount.getOrDefault(c, 0) + 1);
            }
        }

        return letterCount;
    }
}

