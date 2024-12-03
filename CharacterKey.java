/** Project:VoynichMS
 * Purpose Details:CharacterKey
 * Course:IST242
 * Author:Aidan Ramirez
 * Date Developed:12/1/24
 * Last Date Changed:
 * Rev:

 */

//Here is a character frequency key for the VoynichMS page "94v"
//This text was transcripted by "http://www.voynich.nu/data/voyn_101.txt"
//This text includes multiple different letters and symbols


import java.util.HashMap;
import java.util.Map;

public class CharacterKey {
    public static void main(String[] args) {
        // Provided text
        String text = "k2c79.1c7ay.1ay.4oh1c79.ohae.7ay.og1aä9.okC7aN-" +
                      "oe.kC89.okC9.4chC9.okC9.kcc7ae.9hcc89.4okay.an-" +
                      "92c79.17.am.okc79.s7ae,kap.79.189.4oh19.kap-" +
                      "8189.okay.ok19.hc89.4oh179.oe.oh19=" +
                      "kc7an.1c89.4oh28.oh189.4ohcae.1oy1oy.k1oy.ap-" +
                      "91cco.e,hcoe.okay.oj189.4okay.ayae.okoy.ok19.ka89.ok9-" +
                      "kAh9.2c9.4o,ham=" +
                      "g1c8am.2co,K9.8am.Jc89.u17.ok19.4ok19.gay.ay-" +
                      "9kay.ohc89.ohC89.4oh5c9.okam.9.9j17az.oe.s.am.oe9-" +
                      "oe.az.1C9.oh1am.2A.kay,ay,an.oko89.4o8ay.okC9.8ay-" +
                      "ko8am.2L9.4ohay.1ckam.179.9hoe.4oh9.ox.C79.oh9-" +
                      "8am.1K9.179.1H9.oham=";

        // Calling the method to generate the character key
        Map<Character, Integer> characterKey = generateCharacterKey(text);

        // Printing the character key (frequency of characters)
        for (Map.Entry<Character, Integer> entry : characterKey.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }
    }

    // Method to generate character key (frequency count)
    public static Map<Character, Integer> generateCharacterKey(String text) {
        // Creating a HashMap to store characters and their frequencies
        Map<Character, Integer> charCount = new HashMap<>();

        // Converting the text to a char array and counting occurrences
        for (char c : text.toCharArray()) {
            // Count all characters (including punctuation, digits, and letters)
            charCount.put(c, charCount.getOrDefault(c, 0) + 1);
        }

        return charCount;
    }
}

