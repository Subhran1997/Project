package streamExample;

import static org.testng.Assert.assertEquals;

import java.util.List;

import org.junit.Test;

import com.streams.main.StreamExample1;

/*
 *first tescase
 */
public class StreamTest {
    @Test
    public void test() {
        StreamExample1 test = new StreamExample1();
        List<Integer> output = test.addTest(null);
        assertEquals(0, output);
    }
}
