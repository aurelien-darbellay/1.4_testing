package org.example;

public class OutOfBoundGenerator {
    static public int[] numbers = {10, 20};

    static int getNumAtIndex(int index) {
        return numbers[index];
    }
}
