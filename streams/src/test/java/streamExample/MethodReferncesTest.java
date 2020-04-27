package streamExample;

import java.util.Arrays;
import java.util.List;

import org.testng.Assert;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.streams.main.MethodReferences;

public class MethodReferncesTest {

	MethodReferences methodrefernce = null;
	
	@BeforeTest
	public void setUp() {
		methodrefernce = new MethodReferences();
	}
	@Test
	public void test() {
			List<String> input = Arrays
			        .asList("how", "to", "do", "in", "java", "dot", "com");
			List<String> actual = methodrefernce.refernce(input);
			List<String> expected = Arrays.asList("com", "do", "dot", "how", "in", "java", "to");
			Assert.assertEquals(actual, expected);
			 
	}
}