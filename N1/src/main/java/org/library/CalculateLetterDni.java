package org.library;

public class CalculateLetterDni {
    static char calculateLetterDni(long number) {
        String letters = "TRWAGMYFPDXBNJZSQVHLCKE";
        int index = (int) number % 23;
        return letters.charAt(index);
    }
}
