import org.junit.Test;
import org.junit.Assert;

public class StringCalculatorTest {
    Calculator calculate = new Calculator();
    @Test
    public void addReturnsZero() throws Exception {
        Assert.assertEquals(calculate.add(""), 0);
    }
    @Test
    public void addReturnsOneValue() throws Exception{
        Assert.assertEquals(calculate.add("1"), 1);
    }
    @Test
    public void addReturnsMultipleValues() throws Exception{
        Assert.assertEquals(calculate.add("1,1"),2);
    }
    @Test
    public void addNewLine() throws Exception{
        Assert.assertEquals(calculate.add("1\n2,3"),  6);
    }
    @Test
    public void addDelimiter() throws Exception{
        Assert.assertEquals(calculate.add("//;\n1;2"), 3);
    }
    @Test
    public void addNegativeError() throws Exception {
        calculate.add("-1,-2,3,4"); //It has to fail and throw an exception for the negative numbers
    }
    @Test
    public void addIgnoresIntegersGreaterThan1000() throws Exception{
        Assert.assertEquals(calculate.add("//;\n1000,1;2"), 3);
    }
    @Test
    public void addDelimiterOfAnyLength() throws Exception{
        Assert.assertEquals(calculate.add("//***\n1***2***3"),6);
    }
    @Test
    public void addDifferentDelimitersOfAnyLength() throws Exception{
        Assert.assertEquals(calculate.add("//[***][%%%]\n1***2%%%3"), 6);
    }
}