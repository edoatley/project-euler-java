package edo.project.euler.problem1;

import org.junit.Before;
import org.junit.Test;

import junit.framework.TestCase;

public class Problem1BruteForceTest extends TestCase {
	private Problem1BruteForce prob1;
	
	@Before
	public void setUp() {
		prob1 = new Problem1BruteForce();
	}
	
	@Test
	public void testWorksForSimplestCase() {
		int max = 10;
		int expected = 23;
		int actual = prob1.solve(max);
		assertEquals(expected, actual);
	}
	@Test
	public void testWorksForHardCase() {
		int max = 1000;
		int expected = 233168;
		int actual = prob1.solve(max);
		assertEquals(expected, actual);
	}
}
