import org.junit.Assert;
import org.junit.Test;

public class StringCalculatorTest {
    Calculator calculator = new Calculator();
    @Test
    public void emptyString(){
        Assert.assertEquals(Calculator.add(""), 0);
    }
    @Test
    public void singleNumber(){
        Assert.assertEquals(Calculator.add("1"), 1);
    }
    @Test
    public void twoNumbers(){
        Assert.assertEquals(Calculator.add("1,1"), 2);
    }
    @Test
    public void twoNumsDelimeter(){
        Assert.assertEquals(Calculator.add("1\n2"), 3);
    }

    @Test
    public void threeNumsDelimeter(){
        Assert.assertEquals(Calculator.add("1,1,1"), 3);
    }

    @Test
    public void negativeNumber() throws Exception{
        Calculator.add("-1");
    }
}
