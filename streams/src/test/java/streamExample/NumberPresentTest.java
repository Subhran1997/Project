package streamExample;

import static org.testng.Assert.assertEquals;
import java.util.stream.Stream;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class NumberPresentTest {
    /**
     * Call to implement class of IsNumberPresentStream.
     */

    private NumberPresentTest isNumberPresentStream = null;

    /**
     * Create the object of implement class.
     */
    @BeforeTest
    public void setUp() {
        isNumberPresentStream = new NumberPresentTest();
    }

    /**
     * First test case with is number present or not.
     */
    @Test
    public void testWithNum() {
        Stream<Integer> stream = Stream.of(7, 8, 9, 1);
        int num = 4;
        assertEquals(isNumberPresentStream.
                isANumberPresentInStream(stream, num), true);
    }

    @Test
    public void testWithMinusNum() {
        Stream<Integer> stream = Stream.of(-7, -8, -9, -1);
        int num = 4;
        assertEquals(isNumberPresentStream.
                isANumberPresentInStream(stream, num), false);
    }

    private Object isANumberPresentInStream(
            Stream<Integer> stream, int num) {
        return null;
    }

    @Test
    public void testHalfMinusNum() {
        Stream<Integer> stream = Stream.of(7, -8, -9, -1);
        int num = 4;
        assertEquals(isNumberPresentStream.
                isANumberPresentInStream(stream, num), true);
    }

    @Test
    public void testZeroNum() {
        Stream<Integer> stream = Stream.of(0, 0, 0, 0);
        int num = 4;
        assertEquals(isNumberPresentStream.
                isANumberPresentInStream(stream, num), false);
    }

    @Test
    public void testDuplicateNum() {
        Stream<Integer> stream = Stream.of(9, 9, 1, 1);
        int num = 4;
        assertEquals(isNumberPresentStream.
                isANumberPresentInStream(stream, num), false);
    }
}