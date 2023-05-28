import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class CalculatorTest {
    @Test
    public void shouldReturnZeroIfEmptyString() throws Exception{
        int value=Calculator.add("");
        assertEquals(0,value);
    }
    @Test
    public void shouldReturnNumberOneIfOneNumber() throws Exception{
        int value=Calculator.add("1");
        assertEquals(1,value);
    }

    @Test
    public void shouldReturnSumOfTwoNumbers() throws Exception{
        int value = Calculator.add("1,2");
        assertEquals(3,value);
    }
}
