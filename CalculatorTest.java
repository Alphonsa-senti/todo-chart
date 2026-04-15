import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Disabled;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class ExampleTest {

    @Test
    void testSuccess() {
        assertEquals(2, 1 + 1); // This will PASS
    }

    @Test
    void testFailure() {
        assertEquals(5, 1 + 1); // This will FAIL (AssertionError)
    }

    @Test
    @Disabled("Testing skip count")
    void testSkipped() {
        // This will be SKIPPED because of @Disabled
    }

    @Test
    void testError() {
        throw new RuntimeException("Crash!"); // This is an ERROR (Exception)
    }
}
