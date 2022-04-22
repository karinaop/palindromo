package com.palindromo.model;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

public class PalindromoTest {

    @Test
    public void PalindromoTrue () {
    
        Palindromo palindromo = new Palindromo("Rotator");

        palindromo.invPalindromo("Rotator");

        assertEquals("Rotator", palindromo);

    }    
}
