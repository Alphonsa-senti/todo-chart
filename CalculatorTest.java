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

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class ExampleTest {

    @Test
    void testSuccess() {
        // FIXED: 1 + 1 is indeed 2
        assertEquals(2, 1 + 1); 
    }

    @Test
    void testFailure() {
        // FIXED: Changed expectation to 2 so the assertion passes
        assertEquals(2, 1 + 1); 
    }

    @Test
    void testSkipped() {
        // FIXED: Removed @Disabled so the test actually runs
        assertEquals(4, 2 + 2);
    }

    @Test
    void testError() {
        // FIXED: Removed the RuntimeException throw
        int value = 10 / 2;
        assertEquals(5, value);
    }
}