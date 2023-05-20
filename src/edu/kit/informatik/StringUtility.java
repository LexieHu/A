package edu.kit.informatik;

public class StringUtility {
    // Task 1
    public static String removeDuplicates(String word) {
        String result = "";

        for (int i = 0; i < word.length(); i++) {
            char c = word.charAt(i);

            if (!contains(c, result)) {
                result += c;
            }
        }

        return result;
    }

    public static boolean contains(char c, String str) {
        for (int i = 0; i < str.length(); i++) {
            if (c == str.charAt(i)) {
                return true;
            }
        }
        return false;
    }

    // Task 2
    public static String capitalizeWords(String sentence) {
        String[] words = sentence.split(" ");
        String result = "";

        for (String word : words) {
            if (word.length() > 0) {
                char firstChar = word.charAt(0);
                if (isLetter(firstChar)) {
                    char capitalizedChar = toUpperCase(firstChar);
                    result += capitalizedChar + word.substring(1);
                } else {
                    result += word;
                }
            }
            result += " ";
        }

        return result.trim();
    }

    private static boolean isLetter(char c) {
        return (c >= 'a' && c <= 'z') || (c >= 'A' && c <= 'Z');
    }

    private static char toUpperCase(char c) {
        if (c >= 'a' && c <= 'z') {
            return (char) (c - 'a' + 'A');
        }
        return c;
    }

    // Task 3
    public static boolean startsWithIgnoreCase(String word, String prefix) {
        int wordLength = word.length();
        int prefixLength = prefix.length();

        if (prefixLength > wordLength) {
            return false;
        }

        for (int i = 0; i < prefixLength; i++) {
            char prefixChar = Character.toLowerCase(prefix.charAt(i));
            char wordChar = Character.toLowerCase(word.charAt(i));

            if (prefixChar != wordChar) {
                return false;
            }
        }

        return true;
    }

    // Task 4
    public static String reverse(String word) {
        if (word == null || word.isEmpty()) {
            return word;
        }

        String result = "";

        for (int i = word.length() - 1; i >= 0; i--) {
            result += word.charAt(i);
        }

        return result;
    }

    // Task 5
    public static String reverseSentence(String sentence) {
        String[] words = sentence.split(" ");
        String reversed = "";

        for (int i = words.length - 1; i >= 0; i--) {
            reversed += words[i] + " ";
        }

        return reversed.trim();
    }
}
