package streamExample;

import java.util.Calendar;

import org.junit.Test;
import org.testng.Assert;

import com.streams.main.StreamExample2;

/*
 *first testcase
 */
public class StreamTest2 {

    @Test
    public void exampleInB() {
        Calendar cal = Calendar.getInstance();
        cal.set(Calendar.YEAR, 2011);
        cal.set(Calendar.MONTH, Calendar.MARCH);
        cal.set(Calendar.DAY_OF_MONTH, 21);
        String formatted = StreamExample2.FORMATTER.get().getFormat().format(cal.getTime());
        Assert.assertEquals("21-mar-2011", formatted);

    }
}
