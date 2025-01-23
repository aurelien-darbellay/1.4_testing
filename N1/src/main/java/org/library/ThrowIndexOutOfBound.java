package org.library;

public class ThrowIndexOutOfBound {
    static void throwIndexOutOfBound() {
        int[] emptyArray = new int[0];
        int inexistingNumber = emptyArray[0];
    }
}
