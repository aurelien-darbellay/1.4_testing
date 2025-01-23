package org.library;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertThrows;

class ThrowIndexOutOfBoundTest {
    @Test
    void testThrowIndexOutOfBound() {
        assertThrows(IndexOutOfBoundsException.class, ThrowIndexOutOfBound::throwIndexOutOfBound, "Wrong Exception thrown");
    }
}