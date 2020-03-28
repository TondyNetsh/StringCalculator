import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class StringCalculatorTest {
    Calculator calculator = new Calculator();
    @Test
    public void emptyString() throws Exception {
        assertEquals(Calculator.add(""), 0);
    }
    @Test
    public void singleNumber() throws Exception {
        assertEquals(Calculator.add("1"), 1);
    }
    @Test
    public void twoNumbers() throws Exception {
        assertEquals(Calculator.add("1,1"), 2);
    }
    @Test
    public void twoNumsDelimeter() throws Exception {
        assertEquals(Calculator.add("1\n2"), 3);
    }

    @Test
    public void threeNumsDelimeter() throws Exception {
        assertEquals(Calculator.add("1,1,1"), 3);
    }

    @Test(expected = Exception.class)
    public void negativeNumber() throws Exception{
        Calculator.add("-1");
    }
    @Test
    public void isNumGreaterThan1000()throws  Exception{
        assertEquals(Calculator.add("10,10,1000"),1020);
    }
}
