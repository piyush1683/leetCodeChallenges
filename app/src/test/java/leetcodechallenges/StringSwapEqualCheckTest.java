package leetcodechallenges;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;
import leetcodechallenges.StringSwapEqualCheck;

public class StringSwapEqualCheckTest {
    @Test
    public void testIsSwapEqual() {
        StringSwapEqualCheck swapCheck = new StringSwapEqualCheck();

        // Test cases where strings can be made equal by swapping
        assertTrue(swapCheck.checkEqualString("ab", "ba"));
        assertTrue(swapCheck.checkEqualString("aa", "aa"));
        assertTrue(swapCheck.checkEqualString("ab", "ab"));

        // Test cases where strings cannot be made equal by swapping
        assertFalse(swapCheck.checkEqualString("ab", "cd"));
        assertFalse(swapCheck.checkEqualString("abc", "cda"));
        assertFalse(swapCheck.checkEqualString("a", "b"));
    }

}
