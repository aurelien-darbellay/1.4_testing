package org.library;


import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.library.CalculateLetterDni.calculateLetterDni;


class CalculateLetterDniTest {

    @ParameterizedTest
    @MethodSource("validDniProvider")
    void testCalculateLetterDni(long number, char letter) {
        assertEquals(letter, calculateLetterDni(number), "Wrong dni letter for number " + number);
    }

    static Stream<Arguments> validDniProvider() {
        return Stream.of(
                Arguments.of(7780720, 'G'),
                Arguments.of(7780746, 'F'),
                Arguments.of(77625474, 'Z'),
                Arguments.of(77985474, 'H'),
                Arguments.of(72285474, 'Q'),
                Arguments.of(12385474, 'C'),
                Arguments.of(12385574, 'M'),
                Arguments.of(16685574, 'V'),
                Arguments.of(16685534, 'T'),
                Arguments.of(56485534, 'H')
        );
    }
}