package streamExample;
import org.testng.Assert;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.streams.main.BinaryOperators;

/**
 * @author Subhranshu
 *
 */
public class BinaryOperatorTest {

     BinaryOperators binaryoperators;
     
     @BeforeTest
     public void setUp() {
         binaryoperators = new BinaryOperators();
     }
     @Test
     public void testTNum() {
        Integer actual = binaryoperators.additionTwoNum(2, 3);
        Integer expected = 5;
        Assert.assertEquals(actual, expected);
     }
     
     @Test
     public void testTwoNegNum() {
        Integer actual = binaryoperators.additionTwoNum(-2, -3);
        Integer expected = -5;
        Assert.assertEquals(actual, expected);
     }
     
     @Test
     public void testOneNegNum() {
        Integer actual = binaryoperators.additionTwoNum(-2, 3);
        Integer expected = 1;
        Assert.assertEquals(actual, expected);
     }
}