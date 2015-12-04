package edo.project.euler.problem4;

import org.junit.Before;
import org.junit.Test;

import junit.framework.TestCase;

public class Problem4BruteForceTest extends TestCase {
	private Problem4BruteForce prob4;
	
	@Before
	public void setUp() {
		prob4 = new Problem4BruteForce();
	}
	
	@Test
	public void testWorksForSimplestCase() {
		int expected = 906609;
		int actual = prob4.solve();
		assertEquals(expected, actual);
	}


}
