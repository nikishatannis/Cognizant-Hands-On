package com.cognizant;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class CalculatorTest {

    @Test
    void testAddition() {
        int result = 5 + 5;
        assertEquals(10, result);
    }

    @Test
    void testSubtraction() {
        int result = 5 - 3;
        assertEquals(2, result);
    }
}