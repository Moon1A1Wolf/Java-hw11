package brainacad.org;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class StringUtilsTest {

    @Test
    public void testIsPalindrome() {
        assertTrue(StringUtils.isPalindrome("A man a plan a canal Panama"));
        assertTrue(StringUtils.isPalindrome("racecar"));
        assertFalse(StringUtils.isPalindrome("hello"));
    }

    @Test
    public void testCountVowels() {
        assertEquals(2, StringUtils.countVowels("hello"));
        assertEquals(10, StringUtils.countVowels("A man a plan a canal Panama"));
        assertEquals(0, StringUtils.countVowels("bcdfg"));
    }

    @Test
    public void testCountConsonants() {
        assertEquals(3, StringUtils.countConsonants("hello"));
        assertEquals(10, StringUtils.countConsonants("Java programming"));
        assertEquals(0, StringUtils.countConsonants("aeiou"));
    }

    @Test
    public void testCountWordOccurrences() {
        assertEquals(2, StringUtils.countWordOccurrences("Java is great. I love Java!", "java"));
        assertEquals(1, StringUtils.countWordOccurrences("JUnit testing is important.", "testing"));
        assertEquals(0, StringUtils.countWordOccurrences("No match here", "Python"));
    }
}
