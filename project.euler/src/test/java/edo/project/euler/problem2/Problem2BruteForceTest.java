package edo.project.euler.problem2;

import org.junit.Before;
import org.junit.Test;

import junit.framework.TestCase;

public class Problem2BruteForceTest extends TestCase {
	private Problem2BruteForce prob2;
	
	@Before
	public void setUp() {
		prob2 = new Problem2BruteForce();
	}
	
	@Test
	public void testWorksForSimplestCase() {
		int maximum = 90;
		int expected = 44;
		int actual = prob2.solve(maximum);
		assertEquals(expected, actual);
	}
	@Test
	public void testWorksForHarderCase() {
		int maximum = 4000000;
		int expected = 4613732;
		int actual = prob2.solve(maximum);
		assertEquals(expected, actual);
	}

}
