package org.example;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.CsvSource;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;
import static org.assertj.core.api.AssertionsForClassTypes.assertThatExceptionOfType;

class CalculatorTest {

    @ParameterizedTest
    @MethodSource("testCaseProvider")
    void testSum(double num1, double num2) {
        assertThat(num1 + num2)
                .as("Sum of " + num1 + " and " + num2 + " wrong.")
                .isEqualTo(Calculator.sum(num1, num2));
    }

    @ParameterizedTest
    @MethodSource("testCaseProvider")
    void testSubstraction(double num1, double num2) {
        assertThat(num1 - num2)
                .as("Substraction of " + num1 + " and " + num2 + " wrong.")
                .isEqualTo(Calculator.substraction(num1, num2));
    }

    @ParameterizedTest
    @MethodSource("testCaseProvider")
    void testMultiplication(double num1, double num2) {
        assertThat(num1 * num2)
                .as("Multiplication of " + num1 + " and " + num2 + " wrong.")
                .isEqualTo(Calculator.multiplication(num1, num2));
    }

    @ParameterizedTest
    @MethodSource("testCaseProvider")
    void testDivision(double num1, double num2) {
        assertThat(num1 / num2)
                .as("Multiplication of " + num1 + " and " + num2 + " wrong.")
                .isEqualTo(Calculator.division(num1, num2));
    }

    @Test
    void testDivisionByZero() {
        double randomNumber = Math.random() * 1000;
        assertThatExceptionOfType(ArithmeticException.class)
                .isThrownBy(() -> Calculator.division(randomNumber, 0));
    }

    @ParameterizedTest
    @CsvSource({
            "0,1",
            "1,1",
            "2,2",
            "4,24",
            "6,720",
            "9,362880"
    })
    void testFactorial(long num1, long num2) {
        assertThat(num2)
                .as("Factorial of " + num1 + "failed.")
                .isEqualTo(Calculator.factorial(num1));
    }

    @Test
    void testExceptionNegativeFactorial() {
        assertThatExceptionOfType(IllegalArgumentException.class)
                .isThrownBy(() -> Calculator.factorial(-1));
    }

    @ParameterizedTest
    @MethodSource("testCaseProvider")
    void testNeperianLogarythm(double num1) {
        assertThat(Math.log(num1))
                .isEqualTo(Calculator.logNeper(num1));
    }

    private static Stream<Arguments> testCaseProvider() {
        List<Double[]> arguments = new ArrayList<Double[]>();
        for (int k = 0; k < 10; k++) {
            arguments.add(new Double[]{Math.random() * 1000 * (Math.random() < 0.5 ? -1 : 1), Math.random() * 1000 * (Math.random() < 0.5 ? -1 : 1)});
        }
        return arguments.stream().map(item -> Arguments.of(item[0], item[1]));
    }

}