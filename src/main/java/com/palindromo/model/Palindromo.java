package com.palindromo.model;

public class Palindromo {

    public Boolean invPalindromo(String palindromo) {
        palindromo = removeCharacters(palindromo);
        
        String inversePalindromo = new StringBuffer(palindromo).reverse().toString();

        if (palindromo.equals(inversePalindromo)) {
            return true;
        }
        else {
            return false;
        }
        
    }

    public String removeCharacters (String aux){
        aux = aux.replaceAll("[^\\w\\d]", "");
        aux = aux.replaceAll("[_]", "");
        aux = aux.trim().toLowerCase();

        return aux;
    }
}
