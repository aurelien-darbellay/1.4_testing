package org.example;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.AssertionsForClassTypes.assertThatExceptionOfType;
import static org.example.Ex6OutOfBoundGenerator.getNumAtIndex;


class Ex6OutOfBoundGeneratorTest {
    @Test
    void testOutOfBoundGenerator() {
        int limit = Ex6OutOfBoundGenerator.numbers.length;
        assertThatExceptionOfType(IndexOutOfBoundsException.class)
                .as("That was a tricky one")
                .isThrownBy(() -> {
                    getNumAtIndex(limit);
                });
    }

}