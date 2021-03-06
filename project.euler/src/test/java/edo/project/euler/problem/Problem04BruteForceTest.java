package edo.project.euler.problem;

import org.junit.Before;
import org.junit.Test;

import junit.framework.TestCase;

public class Problem04BruteForceTest extends TestCase {
	private Problem04BruteForce prob4;
	
	@Before
	public void setUp() {
		prob4 = new Problem04BruteForce();
	}
	
	@Test
	public void testWorksForSimplestCase() {
		int expected = 906609;
		int actual = prob4.solve();
		assertEquals(expected, actual);
	}


}
