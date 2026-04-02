package ru.gb.hometask.task3;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class StringServiceTest {
    private final StringService service = new StringService();

    @Test
    void testIsPalindrome() {
        assertTrue(service.isPalindrome("а роза упала на лапу азора"));
        assertTrue(service.isPalindrome("Казак"));
        assertFalse(service.isPalindrome("hello"));
        assertFalse(service.isPalindrome(null));
    }

    @Test
    void testCountVowels() {
        assertEquals(3, service.countVowels("hello world"));
        assertEquals(2, service.countVowels("привет"));
        assertEquals(0, service.countVowels(null));
    }

    @Test
    void testCountConsonants() {
        assertEquals(7, service.countConsonants("hello world"));
        assertEquals(4, service.countConsonants("привет"));
        assertEquals(0, service.countConsonants(null));
    }

    @Test
    void testCountWordOccurrences() {
        assertEquals(2, service.countWordOccurrences("hello world hello", "hello"));
        assertEquals(0, service.countWordOccurrences("hello", ""));
        assertEquals(0, service.countWordOccurrences(null, "test"));
    }
}

