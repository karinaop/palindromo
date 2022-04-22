package com.palindromo.model;

public class Palindromo {
    private Palindromo palindromo;

    public Palindromo (String palindromo) {
        this.palindromo = new Palindromo(palindromo);
    }

    public void invPalindromo(String inv) {
        inv = new StringBuffer(inv).reverse().toString();
    }
    
}
