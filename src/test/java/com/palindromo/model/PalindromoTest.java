package com.palindromo.model;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

public class PalindromoTest {

    @Test
    public void PalindromoTrue1 () {
    
        Palindromo palindromo = new Palindromo();
        String word = "Rotator";
        String word = "madam";
        String word = "mAlAyAlam";
        String word = "1";
        String sentence = "Able was I, ere I saw Elba";
        String sentence = "Madam I'm Adam";
        String sentence = "Step on no pets.";
        String sentence = "Top spot!";
        String date = "02/02/2020";

        assertEquals(true, palindromo.invPalindromo(word));
        assertEquals(true, palindromo.invPalindromo(word));
        assertEquals(true, palindromo.invPalindromo(word));
        assertEquals(true, palindromo.invPalindromo(word));
        assertEquals(true, palindromo.invPalindromo(word));
        assertEquals(true, palindromo.invPalindromo(sentence));
        assertEquals(true, palindromo.invPalindromo(sentence));
        assertEquals(true, palindromo.invPalindromo(sentence));
        assertEquals(true, palindromo.invPalindromo(sentence));
        assertEquals(true, palindromo.invPalindromo(date));
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
    public void PalindromoFalse1 () {
        Palindromo palindromo = new Palindromo();
        String word = "xyz";
        String word1 = "elephant";
        String word2 = "Country";
        String sentence = "Top . post!";
        String sentence1 = "Wonderful-fool";
        String sentence2 = "Wild imagination!";

        assertEquals(false, palindromo.invPalindromo(word));
        assertEquals(false, palindromo.invPalindromo(word1));
        assertEquals(false, palindromo.invPalindromo(word2));
        assertEquals(false, palindromo.invPalindromo(sentence));
        assertEquals(false, palindromo.invPalindromo(sentence1));
        assertEquals(false, palindromo.invPalindromo(sentence2));
    }
}
