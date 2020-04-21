package streamExample;

import static org.junit.Assert.assertEquals;

import org.junit.Assert;
import org.junit.Test;
import com.streams.main.StreamExample3;

/**
 * @author text
 *
 */
public class StreamTest3 {
    @Test
    public void test() {
        int a=0;
        StreamExample3 test = new StreamExample3();
        int output = test.addname1("B");
        Object names = "B";
        Assert.assertEquals(names, output);
    }
}
