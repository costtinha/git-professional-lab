package com.bank;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class CalculatorTest {

    @Test
    void shouldSumNumbers() {
        Calculator calculator = new Calculator();

        assertEquals(4, calculator.sum(2, 2));
    }
}
