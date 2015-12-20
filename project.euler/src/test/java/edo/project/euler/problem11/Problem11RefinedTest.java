package edo.project.euler.problem11;

import org.junit.Before;
import org.junit.Test;

import junit.framework.TestCase;

public class Problem11RefinedTest extends TestCase {
	private Problem11Refined prob11;
	
	@Before
	public void setUp() {
		prob11 = new Problem11Refined();
	}
	
	@Test
	public void testWorksForSimplestCase() {
		int expected = 123;
		int actual = prob11.solve();
		assertEquals(expected, actual);
	}
	
}
