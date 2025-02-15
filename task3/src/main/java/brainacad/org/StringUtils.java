package brainacad.org;

public class StringUtils {
    
    public static boolean isPalindrome(String str) {
        if (str == null) return false;
        str = str.replaceAll("[^a-zA-Z0-9]", "").toLowerCase();
        return str.equals(new StringBuilder(str).reverse().toString());
    }

    public static int countVowels(String str) {
        if (str == null) return 0;
        return (int) str.toLowerCase().chars()
                .filter(c -> "aeiou".indexOf(c) != -1)
                .count();
    }

    public static int countConsonants(String str) {
        if (str == null) return 0;
        return (int) str.toLowerCase().chars()
                .filter(c -> "bcdfghjklmnpqrstvwxyz".indexOf(c) != -1)
                .count();
    }

    public static int countWordOccurrences(String text, String word) {
        if (text == null || word == null || word.isEmpty()) return 0;
        String[] words = text.toLowerCase().split("\\W+");
        return (int) java.util.Arrays.stream(words).filter(w -> w.equals(word.toLowerCase())).count();
    }
}