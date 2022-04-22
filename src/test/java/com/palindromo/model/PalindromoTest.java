package com.palindromo.model;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

public class PalindromoTest {

    @Test
    public void PalindromoTrue () {
    
        Palindromo palindromo = new Palindromo();
        String word = "rotator";
        String word1 = "madam";

        assertEquals(true, palindromo.invPalindromo(word));
        assertEquals(word1, palindromo.invPalindromo(word1));

    }
}
