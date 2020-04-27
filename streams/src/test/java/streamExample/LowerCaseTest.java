package streamExample;

import java.util.Arrays;
import java.util.List;

import org.junit.Assert;
import org.junit.Test;
import org.testng.annotations.BeforeTest;

import com.streams.main.LowerCase;

public class LowerCaseTest {
        /**
        */
        LowerCase ab;
        /**
        */
        @BeforeTest
        public void setUp() {
        ab = new LowerCase();
        }
        /**
        */
        @Test
        public void testMultipleWords() {
        List<String> input = Arrays.asList("HELLO", "ABC", "XYZ");
        List<String> actual = ab.allToLowerCase(input);
        List<String> expected = Arrays.asList("hello", "abc", "xyz");
        Assert.assertEquals(expected, actual);
        }
        /**
        */
        @Test
        public void testLowerUpper() {
        List<String> input = Arrays.asList("Subhran", "subbu", "Sekhar");
        List<String> actual = ab.allToLowerCase(input);
        List<String> expected = Arrays.asList("subhran", "subbu", "sekhar");
        Assert.assertEquals(actual, expected);
        }
        /**
        */
        @Test
        public void testnumbersWords() {
        List<String> input = Arrays.asList("HELLO", "ABC", "89");
        List<String> actual = ab.allToLowerCase(input);
        List<String> expected = Arrays.asList("hello", "abc", "89");
        Assert.assertEquals(expected, actual);
        }
        /**
        */
        @Test
        public void testNumbers() {
        List<String> input = Arrays.asList("12334", "12", "567");
        List<String> actual = ab.allToLowerCase(input);
        List<String> expected = Arrays.asList("12334", "12", "567");
        Assert.assertEquals(expected, actual);
        }
        /**
        */
        @Test
        public void testLowerCase() {
        List<String> input = Arrays.asList("abc", "xyz", "def");
        List<String> actual = ab.allToLowerCase(input);
        List<String> expected = Arrays.asList("abc", "xyz", "def");
        Assert.assertEquals(expected, actual);
        }
        }

