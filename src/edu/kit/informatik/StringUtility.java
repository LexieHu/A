package edu.kit.informatik;

public class StringUtility {
    // Task 1
    public static String removeDuplicates(String word) {
        char[] chars = word.toCharArray();
        int index = 0;
        for (int i = 0; i < chars.length; i++) {
            boolean duplicate = false;
            for (int j = 0; j < index; j++) {
                if (chars[i] == chars[j]) {
                    duplicate = true;
                    break;
                }
            }
            if (!duplicate) {
                chars[index] = chars[i];
                index++;
            }
        }
        return new String(chars, 0, index);
    }

    // Task 2
    public static String capitalizeWords(String sentence) {
        char[] chars = sentence.toCharArray();

       
        boolean capitalizeNext = true;
        for (int i = 0; i < chars.length; i++) {
            if (chars[i] == ' ') {
                capitalizeNext = true;
            } else if (capitalizeNext && (chars[i] >= 'a' && chars[i] <= 'z')) {
                chars[i] = (char) (chars[i] - 32); 
                capitalizeNext = false;
            }
        }

        return new String(chars);
    }

    // Task 3
    public static boolean startsWithIgnoreCase(String word, String prefix) {
        if (word.length() < prefix.length()) {
            return false;
        }

        for (int i = 0; i < prefix.length(); i++) {
            char wordChar = word.charAt(i);
            char prefixChar = prefix.charAt(i);

            if (Character.toLowerCase(wordChar) != Character.toLowerCase(prefixChar)) {
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

        String reversedSentence = "";
        for (int i = words.length - 1; i >= 0; i--) {
            reversedSentence += words[i];
            if (i > 0) {
                reversedSentence += " ";
            }
        }

        return reversedSentence;
    }
}
