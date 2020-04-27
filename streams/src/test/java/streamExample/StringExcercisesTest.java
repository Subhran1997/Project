package streamExample;

import java.util.Arrays;
import java.util.Collections;

import org.junit.Assert;
import org.junit.Test;

import com.google.common.base.Optional;
import com.streams.main.StringExcercises;

public class StringExcercisesTest {
    /**
    *
    */
    @Test
    public void noLowercaseLettersInAnEmptyString() {
        Assert.assertEquals(0, StringExcercises.
                countLowercaseLetters(""));
    }

    /**
    *
     */
    @Test
    public void countsLowercaseLetterExample() {
        Assert.assertEquals(3, StringExcercises.
                countLowercaseLetters("aBcDeF"));
    }

    /**
    *
    */
    @Test
    public void suppoertsNoLowercaseLetters() {
        Assert.assertEquals(0, StringExcercises.
                countLowercaseLetters("ABCDEF"));
    }

    /**
    *
    **/
    @Test
    public void noStringReturnedForEmptyList() {
        Assert.assertFalse(StringExcercises.mostLowercaseString(
                Collections.<String>emptyList()).isPresent());
    }

    /**
    *
    */
    @Test
    public void findsMostLowercaseString() {
        java.util.Optional<String> result =StringExcercises.
                mostLowercaseString(Arrays.asList("a", "abc", "ABCde"));
        Assert.assertEquals(Optional.of("abc"), result);
    }
}
