package com.cognizant;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class CalculatorTest {

    @Test
    void testAddition() {
        assertEquals(10, 5 + 5);
    }

    @Test
    void testSubtraction() {
        assertEquals(2, 5 - 3);
    }
}