package com.palindromo.model;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

public class PalindromoTest {

    @Test
    public void PalindromoTrue1 () {
    
        Palindromo palindromo = new Palindromo();
        String word = "Rotator";

        assertEquals(true, palindromo.invPalindromo(word));
    }

    @Test
    public void PalindromoTrue2 () {
    
        Palindromo palindromo = new Palindromo();
        String word = "bob";

        assertEquals(true, palindromo.invPalindromo(word));
    }

    @Test
    public void PalindromoTrue3 () {
    
        Palindromo palindromo = new Palindromo();
        String word = "madam";

        assertEquals(true, palindromo.invPalindromo(word));
    }

    @Test
    public void PalindromoTrue4 () {
    
        Palindromo palindromo = new Palindromo();
        String word = "mAlAyAlam";

        assertEquals(true, palindromo.invPalindromo(word));
    }

    @Test
    public void PalindromoTrue5 () {
    
        Palindromo palindromo = new Palindromo();
        String word = "1";

        assertEquals(true, palindromo.invPalindromo(word));
    }

    @Test
    public void PalindromoTrue6 () {
    
        Palindromo palindromo = new Palindromo();
        String sentence = "Able was I, ere I saw Elba";

        assertEquals(true, palindromo.invPalindromo(sentence));
    }

    @Test
    public void PalindromoTrue7 () {
    
        Palindromo palindromo = new Palindromo();
        String sentence = "Madam I'm Adam";

        assertEquals(true, palindromo.invPalindromo(sentence));
    }

    @Test
    public void PalindromoTrue8 () {
    
        Palindromo palindromo = new Palindromo();
        String sentence = "Step on no pets.";

        assertEquals(true, palindromo.invPalindromo(sentence));
    }

    @Test
    public void PalindromoTrue9 () {
    
        Palindromo palindromo = new Palindromo();
        String sentence = "Top spot!";

        assertEquals(true, palindromo.invPalindromo(sentence));
    }

    @Test
    public void PalindromoTrue10 () {
    
        Palindromo palindromo = new Palindromo();
        String date = "02/02/2020";

        assertEquals(true, palindromo.invPalindromo(date));
    }
}
