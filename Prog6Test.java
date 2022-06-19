package lesson2;
import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertEquals;
import org.junit.Test;

public class Prog6Test {
    @Test
    public void testCalculateSum() {
        String [] words = {"horse","house","horse"};
        String [] result = Prog6.removeDups(words);
        String [] expected = {"horse","house"};
        assertArrayEquals(expected, result);
    }
}


