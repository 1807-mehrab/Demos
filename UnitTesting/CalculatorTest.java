import static org.junit.Assert.assertEquals;
import org.junit.Test;

public class CalculatorTest {
    @Test
    public void sumExpressionMethodTest() {
        Calculator c = new Calculator();
        int expectedSum = 4;
        int actualSum = c.sum("2+2");
        assertEquals(expectedSum, actualSum);
    }
}