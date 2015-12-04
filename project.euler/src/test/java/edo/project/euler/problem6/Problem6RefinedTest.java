package edo.project.euler.problem6;

import org.junit.Before;
import org.junit.Test;

import junit.framework.TestCase;

public class Problem6RefinedTest extends TestCase {
	private Problem6Refined prob6;
	
	@Before
	public void setUp() {
		prob6 = new Problem6Refined();
	}
	
	@Test
	public void testWorksForSimplestCase() {
		int expected = 2640;
		int actual = prob6.solve(10);
		assertEquals(expected, actual);
	}
	@Test
	public void testWorksForHardCase() {
		int expected = 25164150;
		int actual = prob6.solve(100);
		assertEquals(expected, actual);
	}
}
