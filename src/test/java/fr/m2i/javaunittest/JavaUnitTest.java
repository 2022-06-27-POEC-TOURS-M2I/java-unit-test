package fr.m2i.javaunittest;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.RepeatedTest;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;
import org.junit.jupiter.params.provider.ValueSource;

public class JavaUnitTest {

    @Test
    public void isPalindromeKayak() {
        boolean result = Palindrome.isPalindrome("kayak");
        
        assertTrue(result);
    }

    @Test
    public void isPalindromeBonjour() {
        boolean result = Palindrome.isPalindrome("bonjour");
        
        assertFalse(result);
    } 
        
    @Test
    public void isPalindromeChaineVide() {
        boolean result = Palindrome.isPalindrome("");
        
        assertTrue(result);
    }
    
        
    @Test
    public void isPalindromeKAYak() {
        boolean result = Palindrome.isPalindrome("KAYak");
        
        assertTrue(result);
    }
    
    @Test
    public void isPalindromeAvecEspaces() {
        boolean result = Palindrome.isPalindrome("Engage le jeu que je le gagne");
        
        assertTrue(result);
    }
        
    @Test
    public void isPalindromeAvecDesAccents() {
        boolean result = Palindrome.isPalindrome("La mariée ira mal");
        
        assertTrue(result);
    }
    
    
    @ParameterizedTest
    @ValueSource(strings = { "kayak", "xanax", "selles" })
    public void isAllPalindromes(String str) {
        boolean result = Palindrome.isPalindrome(str);
        
        assertTrue(result);
    }
    
    
    @ParameterizedTest
    @ValueSource(strings = { "ecole", "voiture", "arbre" })
    public void isAllNotPalindromes(String str) {
        boolean result = Palindrome.isPalindrome(str);
        
        assertFalse(result);
    }
    
    @ParameterizedTest
    @CsvSource({
        "kayak, true",
        "rever, true",
        "arbre, false"
    })
    public void checkCsvSourcePalindrome(String str, boolean expectedResult) {
        boolean result = Palindrome.isPalindrome(str);

        assertEquals(result, expectedResult);
    }
    
    @RepeatedTest(5)
    public void repeatThisTest() {
        boolean result = Palindrome.isPalindrome("xanax");
        
        assertTrue(result);
    }
}
