package brainacad.org;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter a string:");
        String input = scanner.nextLine();

        System.out.println("Is it a palindrome? " + StringUtils.isPalindrome(input));
        System.out.println("Number of vowels: " + StringUtils.countVowels(input));
        System.out.println("Number of consonants: " + StringUtils.countConsonants(input));

        System.out.println("Enter a word to search:");
        String word = scanner.nextLine();
        System.out.println("Occurrences of the word: " + StringUtils.countWordOccurrences(input, word));

        scanner.close();
    }
}