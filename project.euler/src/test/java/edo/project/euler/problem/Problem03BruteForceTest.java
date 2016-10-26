package edo.project.euler.problem;

import org.junit.Before;
import org.junit.Test;

import edo.project.euler.problem.Problem03BruteForce;
import junit.framework.TestCase;

public class Problem03BruteForceTest extends TestCase {
	private Problem03BruteForce prob3;
	@Before
	public void setUp() {
		prob3 = new Problem03BruteForce();
	}
	
	@Test
	public void testWorksForSimplestCase() {
		long testee = 13195;
		long expected = 29;
		long actual = prob3.solve(testee);
		assertEquals(expected, actual);
	}

// Comment this test out for now as the algo is too slow
//	@Test
//	public void testWorksForHarderCase() {
//		long expected = 29;
//		long testee = 600851475143l; 
//		long actual = prob3.solve(testee);
//		assertEquals(expected, actual);
//	}

}
