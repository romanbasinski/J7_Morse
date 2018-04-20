package pl.sda;


import java.util.HashMap;
import java.util.Map;

public class MorseEncoder {
    public String encode(String textToEncode) {
        Map<String, String> dictionary = new HashMap<>();
        dictionary.put("A", ".-");
        dictionary.put("B", "-...");
        dictionary.put("C", "-.-.");
        dictionary.put("D", "-..");
        dictionary.put("E", ".");
        dictionary.put("F", "..-.");
        dictionary.put("G", "--.");
        dictionary.put("H", "....");
        dictionary.put("I", "..");
        dictionary.put("J", ".---");
        dictionary.put("K", "-.-");
        dictionary.put("L", ".-..");
        dictionary.put("M", "--");
        dictionary.put("N", "-.");
        dictionary.put("O", "---");
        dictionary.put("P", ".--.");
        dictionary.put("Q", "--.-");
        dictionary.put("R", ".-.");
        dictionary.put("S", "...");
        dictionary.put("T", "-");
        dictionary.put("U", "..-");
        dictionary.put("V", "...-");
        dictionary.put("W", ".--");
        dictionary.put("X", "-..-");
        dictionary.put("Y", "-.--");
        dictionary.put("Z", "--..");

        StringBuffer result = new StringBuffer();

        String[] wordsToEncode = textToEncode.toUpperCase().split(" ");

        for (int i = 0; i < wordsToEncode.length; i++) {
            StringBuffer encodedWord = new StringBuffer();
            String wordToEncode = wordsToEncode[i];
            for (int j = 0; j < wordToEncode.length(); j++) {
                Character character = wordToEncode.toCharArray()[j];
                encodedWord.append(dictionary.get(character.toString()));
                encodedWord.append(" ");
            }
            result.append(encodedWord.toString().trim());
            if (i < wordsToEncode.length - 1) {
                result.append(" / ");
            }
        }

        return result.toString();
    }
}
