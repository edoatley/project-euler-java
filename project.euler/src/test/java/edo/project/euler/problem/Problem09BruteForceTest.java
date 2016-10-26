package edo.project.euler.problem;

import org.junit.Before;
import org.junit.Test;

import junit.framework.TestCase;

public class Problem09BruteForceTest extends TestCase {
	private Problem09BruteForce prob9;
	
	@Before
	public void setUp() {
		prob9 = new Problem09BruteForce();
	}
	
	@Test
	public void testWorksForSimplestCase() {
		int expected = 31875000;
		int actual = prob9.solve();
		assertEquals(expected, actual);
	}

}
