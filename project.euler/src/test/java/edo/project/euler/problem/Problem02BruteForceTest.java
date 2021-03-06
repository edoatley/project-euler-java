package edo.project.euler.problem;

import org.junit.Before;
import org.junit.Test;

import edo.project.euler.problem.Problem02BruteForce;
import junit.framework.TestCase;

public class Problem02BruteForceTest extends TestCase {
	private Problem02BruteForce prob2;
	
	@Before
	public void setUp() {
		prob2 = new Problem02BruteForce();
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
