package com.example;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class ExampleTest {

    @Test
    void testSuccess() {
        // Assertion is correct: 1 + 1 = 2
        assertEquals(2, 1 + 1); 
    }

    @Test
    void testFailure() {
        // FIXED: Changed expectation from 10 to 2
        assertEquals(2, 1 + 1); 
    }

    @Test
    // FIXED: Removed @Disabled so the test runs and passes
    void testSkipped() {
        assertEquals(4, 2 + 2);
    }

    @Test
    void testError() {
        // FIXED: Removed the 'throw new RuntimeException'
        int result = 5 + 5;
        assertEquals(10, result);
    }
}