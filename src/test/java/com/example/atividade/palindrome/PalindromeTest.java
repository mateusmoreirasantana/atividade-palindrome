package com.example.atividade.palindrome;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

import com.example.atividade.Palindrome;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class PalindromeTest { 

    @Test
    public void verifyRotatorIsPalindrome()
    {
        String palavra = "Rotator";

        Boolean result = Palindrome.isPalindrome(palavra);
       assertTrue(result);
    }
    @Test
    public void verifybobIsPalindrome()
    {
        String palavra = "bob";

        Boolean result = Palindrome.isPalindrome(palavra);

        assertTrue(result);
    }
    
    @Test
    public void verifymadamIsPalindrome()
    {
        String palavra = "madam";

        Boolean result = Palindrome.isPalindrome(palavra);

        assertTrue(result);
    }
    
    @Test
    public void verifymAlAyAlamIsPalindrome()
    {
        String palavra = "mAlAyAlam";

        Boolean result = Palindrome.isPalindrome(palavra);

        assertTrue(result);
    }
    @Test
    public void verify1IsPalindrome()
    {
        String palavra = "1";

        Boolean result = Palindrome.isPalindrome(palavra);

        assertTrue(result);
    }

    @Test
    public void verifyAblewasIereIsawElbaIsPalindrome()
    {
        String palavra = "Able was I, ere I saw Elba";

        Boolean result = Palindrome.isPalindrome(palavra);

        assertTrue(result);
    }
    
    @Test
    public void verifyMadamImAdamIsPalindrome()
    {
        String palavra = "Madam I’m Adam";

        Boolean result = Palindrome.isPalindrome(palavra);
        assertTrue(result);
    }
    @Test
    public void verifySteponnopetsIsPalindrome()
    {
        String palavra = "Step on no pets";

        Boolean result = Palindrome.isPalindrome(palavra);

        assertTrue(result);
    } 
    @Test
    public void verifyTopspotIsPalindrome()
    {
        String palavra = "Top spot!";

        Boolean result = Palindrome.isPalindrome(palavra);

        assertTrue(result);
    } 
    @Test
    public void verify02022020IsPalindrome()
    {
        String palavra = "02/02/2020";

        Boolean result = Palindrome.isPalindrome(palavra);

        assertTrue(result);
    } 

    @Test
    public void verifyxyzIsPalindrome()
    {
        String palavra = "xyz";

        Boolean result = Palindrome.isPalindrome(palavra);
       assertFalse(result);

    } 
    @Test
    public void verifyelephantIsPalindrome()
    {
        String palavra = "elephant";

        Boolean result = Palindrome.isPalindrome(palavra);

        assertFalse(result);
    } 

    @Test
    public void verifyCountryIsPalindrome()
    {
        String palavra = "Country";

        Boolean result = Palindrome.isPalindrome(palavra);

        assertFalse(result);
    } 
    
    @Test
    public void verifyTopPostIsPalindrome()
    {
        String palavra = "Top . post!";

        Boolean result = Palindrome.isPalindrome(palavra);

        assertFalse(result);
    } 
    
    @Test
    public void verifyWonderfulfoolIsPalindrome()
    {
        String palavra = "Wonderful-fool";

        Boolean result = Palindrome.isPalindrome(palavra);

        assertFalse(result);
    }  
    @Test
    public void verifyWildimaginationIsPalindrome()
    {
        String palavra = "Wild imagination!";

        Boolean result = Palindrome.isPalindrome(palavra);

        assertFalse(result);
    }  
    
}