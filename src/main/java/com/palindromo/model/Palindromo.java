package com.palindromo.model;

public class Palindromo {

    public String invPalindromo(String palindromo) {
        
        palindromo = new StringBuffer(palindromo).reverse().toString();
        return palindromo;
    }

    
}
