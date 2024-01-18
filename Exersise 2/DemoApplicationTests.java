import org.junit.*;
import static org.junit.jupiter.api.Assertions.*;

public class DemoApplicationTests {

    @Test
    public void testFindMaximum() {
        int[] array1 = {1, 3, 5, 2, 4};
        assertEquals(5, MaximumNumberFinder.findMaximum(array1));

        int[] array2 = {-10, -5, -8, -3, -1};
        assertEquals(-1, MaximumNumberFinder.findMaximum(array2));

        int[] array3 = {0, 0, 0, 0, 0};
        assertEquals(0, MaximumNumberFinder.findMaximum(array3));
    }

    @Test
    public void testFindMaximumWithEmptyArray() {
        int[] emptyArray = {};
        assertThrows(IllegalArgumentException.class, () -> MaximumNumberFinder.findMaximum(emptyArray));
    }

    @Test
    public void testFindMaximumWithNullArray() {
        assertThrows(IllegalArgumentException.class, () -> MaximumNumberFinder.findMaximum(null));
    }
}
