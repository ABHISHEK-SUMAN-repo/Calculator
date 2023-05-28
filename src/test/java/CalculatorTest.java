import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class CalculatorTest {
    @Test
    public void returnZeroIfEmptyString() throws Exception {
        int value=Calculator.add("");
        assertEquals(0,value);
    }
    @Test
    public void returnNumberOneIfOneNumber() throws Exception {
        int value=Calculator.add("1");
        assertEquals(1,value);
    }

    @Test
    public void returnSumOfTwoNumbers() throws Exception {
        int value = Calculator.add("1,2");
        assertEquals(3,value);
    }
    @Test
    public void returnSumOfMultipleNumbers() throws Exception {
        int value = Calculator.add("1,2,3");
        assertEquals(6,value);
    }
    @Test
    public void returnForNewLine() throws Exception {
        int value = Calculator.add("1,2\n3");
        assertEquals(6,value);
    }
    @Test()
    public void returnValueForCustomDelimeter() throws Exception {
        int value =Calculator.add("//;\n1;2");
        assertEquals(3,value);
    }

    @Test
    public void ignoreLargeNumbers() throws Exception {
        int value=Calculator.add("1001,2");
    }

    @Test
    public void returnRegex() throws Exception {
        int value=Calculator.add("//.\n1.2");
        assertEquals(3,value);
    }

    @Test(expected = Exception.class)
    public void returnExceptionOnNegetiveNumbers() throws Exception{
        Calculator.add("//;\n-1;2");
    }

}
