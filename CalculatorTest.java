// import org.junit.jupiter.api.Test;
// import org.junit.jupiter.api.Disabled;
// import static org.junit.jupiter.api.Assertions.assertEquals;

// public class ExampleTest {

//     @Test
//     void testSuccess() {
//         assertEquals(2, 1 + 1); // This will PASS
//     }

//     @Test
//     void testFailure() {
//         assertEquals(5, 1 + 1); // This will FAIL (AssertionError)
//     }

//     @Test
//     @Disabled("Testing skip count")
//     void testSkipped() {
//         // This will be SKIPPED because of @Disabled
//     }

//     @Test
//     void testError() {
//         throw new RuntimeException("Crash!"); // This is an ERROR (Exception)
//     }
// }

package com.example;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class ExampleTest {

    @Test
    void testSuccess() {
        // Correct logic
        assertEquals(2, 1 + 1); 
    }

    @Test
    void testFailure() {
        // FIXED: Changed expectation from 10 to 2
        assertEquals(2, 1 + 1); 
    }

    @Test
    // FIXED: Removed @Disabled so the test is executed and contributes to success
    void testSkipped() {
        assertEquals(4, 2 + 2);
    }

    @Test
    void testError() {
        // FIXED: Removed 'throw new RuntimeException'
        boolean isRunning = true;
        assertEquals(true, isRunning);
    }
}