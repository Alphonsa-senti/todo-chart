package com.example;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Disabled;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class ExampleTest {

    @Test
    void testSuccess() {
        assertEquals(2, 1 + 1); // This will Pass
    }

    @Test
    void testFailure() {
        assertEquals(10, 1 + 1); // This will Fail (Assertion failure)
    }

    @Test
    @Disabled("Testing skip count")
    void testSkipped() {
        // This will be Skipped
    }

    @Test
    void testError() {
        throw new RuntimeException("Crashed!"); // This counts as an Error
    }
}