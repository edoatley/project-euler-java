package edo.project.euler.problem;

import org.junit.Before;
import org.junit.Test;

import junit.framework.TestCase;

public class Problem07BruteForceTest extends TestCase {
	private Problem07BruteForce prob7;
	
	@Before
	public void setUp() {
		prob7 = new Problem07BruteForce();
	}
	
	@Test
	public void testWorksForSimplestCase() {
		long expected = 13;
		long actual = prob7.solve(6);
		assertEquals(expected, actual);
	}
	@Test
	public void testWorksForHardCase() {
		long expected = 104743;
		long actual = prob7.solve(10001);
		assertEquals(expected, actual);
	}
}
