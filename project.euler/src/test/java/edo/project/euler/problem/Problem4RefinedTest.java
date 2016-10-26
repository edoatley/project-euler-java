package edo.project.euler.problem4;

import org.junit.Before;
import org.junit.Test;

import junit.framework.TestCase;

public class Problem4RefinedTest extends TestCase {
	private Problem4Refined prob4;
	
	@Before
	public void setUp() {
		prob4 = new Problem4Refined();
	}
	
	@Test
	public void testWorksForSimplestCase() {
		int expected = 906609;
		int actual = prob4.solve();
		assertEquals(expected, actual);
	}
	
	@Test 
	public void testReverseFor123456() {
		int input = 123456;
		int expected = 654321;
		int actual = prob4.reverse(input);
		assertEquals(expected, actual);
	}
}
