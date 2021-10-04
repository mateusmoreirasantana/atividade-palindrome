package com.example.atividade;

public class Palindrome {
    

    public static Boolean isPalindrome(String palavra)
    {
      
        palavra =  palavra.replaceAll("[^A-Za-z0-9]", "").toLowerCase();
      

        String reverse = new StringBuilder(palavra).reverse().toString();

        if (palavra.equals(reverse))
            return true;
        else
           return false;

    
    }
}
