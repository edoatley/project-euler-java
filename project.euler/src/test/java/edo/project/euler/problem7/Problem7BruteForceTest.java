package edo.project.euler.problem7;

import org.junit.Before;
import org.junit.Test;

import junit.framework.TestCase;

public class Problem7BruteForceTest extends TestCase {
	private Problem7BruteForce prob7;
	
	@Before
	public void setUp() {
		prob7 = new Problem7BruteForce();
	}
	
	@Test
	public void testWorksForSimplestCase() {
		int expected = 13;
		int actual = prob7.solve(6);
		assertEquals(expected, actual);
	}
	@Test
	public void testWorksForHardCase() {
		int expected = 25174150;
		int actual = prob7.solve(10001);
		assertEquals(expected, actual);
	}
}
