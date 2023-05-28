import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class CalculatorTest {
    @Test
    public void returnZeroIfEmptyString() throws Exception{
        int value=Calculator.add("");
        assertEquals(0,value);
    }
    @Test
    public void returnNumberOneIfOneNumber() throws Exception{
        int value=Calculator.add("1");
        assertEquals(1,value);
    }

    @Test
    public void returnSumOfTwoNumbers() throws Exception{
        int value = Calculator.add("1,2");
        assertEquals(3,value);
    }
    @Test
    public void returnSumOfMultipleNumbers() throws Exception{
        int value = Calculator.add("1,2,3");
        assertEquals(6,value);
    }
}
