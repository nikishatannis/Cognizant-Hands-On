package com.cognizant;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class ExceptionThrowerTest {

    private final ExceptionThrower exceptionThrower = new ExceptionThrower();

    @Test
    void testThrowException() {

        IllegalArgumentException exception =
                assertThrows(IllegalArgumentException.class, () -> {
                    exceptionThrower.throwException();
                });

        assertEquals("This is an exception", exception.getMessage());
    }
}