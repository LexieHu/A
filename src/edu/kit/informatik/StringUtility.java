package edu.kit.informatik;

public class StringUtility {
    // Task 1
    public static String removeDuplicates(String word) {
        if (word == null || word.isEmpty()) {
            return word;
        }
        String result = "";
        for (int i = 0; i < word.length(); i++) {
            if (!result.contains(String.valueOf(word.charAt(i)))) {
                result += String.valueOf(word.charAt(i));
            }
        }
        return result;
    }

    // Task 2
    public static String capitalizeWords(String sentence) {
        if (sentence == null || sentence.length() == 0) {
            return sentence;
        }
        // @method .split() Spilt the sentence (strings) into individual words
        // (characters) at '(space)'
        String[] words = sentence.split(" ");
        // Create a empty result String
        String result = "";

        //
        for (int i = 0; i < words.length; i++) {
            String word = words[i];

            if (!word.isEmpty()) {
                char[] characters = word.toCharArray();
                // Convert the first character to uppercase if it's a letter
                if (Character.isLetter(characters[0])) {
                    characters[0] = Character.toUpperCase(characters[0]);
                }
                // Add a space if not the first word (index)
                if (i > 0) {
                    result += " ";
                }
                // Add the array of characters to the result string
                result += String.valueOf(characters);
            }
        }

        return result;
    }

    // Task 3
    public static String reverse(String word) {
        if (word == null || word.isEmpty()) {
            return word;
        }

        String reverse = "";

        for (int i = word.length() - 1; i >= 0; i--) {
            reverse += word.charAt(i);
        }

        return reverse;
    }

    // Task 4
    public static boolean startsWithIgnoreCase(String word, String prefix) {
        if (word == null || prefix == null) {
            return false; // return false, if word and prefix are empty
        }

        if (prefix.length() > word.length()) {
            return false; // return false, if prefix is longer than word
        }
        // Intercept the substring from word, that meets the prefix length
        String wordPrefix = word.substring(0, prefix.length());
        /*
         * @method .equlsIgnoreCase() Directly compare two extracted strings
         * case-insensitively
         */
        return wordPrefix.equalsIgnoreCase(prefix);
    }

    // Task 5
    public static String reverseSentence(String sentence) {
        if (sentence == null || sentence.isEmpty()) {
            return sentence;
        }

        String[] words = sentence.split(" ");
        StringBuilder reversedSentence = new StringBuilder();

        for (int i = words.length - 1; i >= 0; i--) {
            // @method .append() Add each word to the StringBuilder in reverse Order
            reversedSentence.append(words[i]);
            // Add '(space)' after each word
            if (i > 0) {
                reversedSentence.append(" ");
            }
        }
        // @return The StringBuilder into String
        return reversedSentence.toString();

    }
    
}
