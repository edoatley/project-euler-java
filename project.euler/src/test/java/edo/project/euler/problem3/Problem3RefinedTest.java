package edo.project.euler.problem3;

import org.junit.Before;
import org.junit.Test;

import junit.framework.TestCase;

public class Problem3RefinedTest extends TestCase {
	private Problem3Refined prob3;
	@Before
	public void setUp() {
		prob3 = new Problem3Refined();
	}
	
	@Test
	public void testWorksForSimplestCase() {
		long testee = 13195;
		long expected = 29;
		long actual = prob3.solve(testee);
		assertEquals(expected, actual);
	}
	@Test
	public void testWorksForHarderCase() {
		long expected = 6857;
		long testee = 600851475143l; 
		long actual = prob3.solve(testee);
		assertEquals(expected, actual);
	}

}
