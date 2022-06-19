package lesson2;
import static org.junit.Assert.assertEquals;
import org.junit.Test;

public class Prog8Test {
    @Test
    public void testCalculateSum() {
        int[] testArray = {2, -21, 3, 45, 0, 12, 18, 6, 3, 1, 0, -22};
        int result = Prog8.min(testArray);
        int expected = -22;
        assertEquals(expected, result);
    }
}


