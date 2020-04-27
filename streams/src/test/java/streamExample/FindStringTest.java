package streamExample;

import static org.testng.Assert.assertEquals;
import java.util.stream.Stream;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.streams.main.FindStringExample;

/**
 * @author Subhranshu.
 *
 */
public class FindStringTest {

    /**
     * Call to implement class of FindStirngWithFirstCharacter.
     */
    private FindStringExample findStirngWithFirstCharacter = null;

    /**
     * Create the object of implement class.
     **/
    @BeforeTest
    public final void setUp() {
        findStirngWithFirstCharacter = new FindStringExample();
    }

    /**
     * First test case of first String with first character.
     */
    @Test
    public void testFirstChar() {
        Stream<String> names = Stream.of("PI", "AB", "DC", "LL");
        String name = "D";
        assertEquals(findStirngWithFirstCharacter.
                findFirstStringStartsWithOneCharacter(names, name), "DC");
    }

    @Test
    public void testUpperCase() {
        Stream<String> names = Stream.of("PI", "AB", "DC", "LL");
        String name = "P";
        assertEquals(findStirngWithFirstCharacter.
                findFirstStringStartsWithOneCharacter(names, name), "PI");
    }

    @Test
    public void testLowerCase() {
        Stream<String> names = Stream.of("pi", "ab", "dc", "ll");
        String name = "a";
        assertEquals(findStirngWithFirstCharacter.
                findFirstStringStartsWithOneCharacter(names, name), "ab");
    }

    @Test
    public void testNum() {
        Stream<String> names = Stream.of("1789", "555", "2478", "399");
        String name = "1";
        assertEquals(findStirngWithFirstCharacter.
                findFirstStringStartsWithOneCharacter(names, name), "1789");
    }
}