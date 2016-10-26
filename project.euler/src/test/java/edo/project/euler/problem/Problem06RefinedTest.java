package edo.project.euler.problem;

import org.junit.Before;
import org.junit.Test;

import junit.framework.TestCase;

public class Problem06RefinedTest extends TestCase {
	private Problem06Refined prob6;
	
	@Before
	public void setUp() {
		prob6 = new Problem06Refined();
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
