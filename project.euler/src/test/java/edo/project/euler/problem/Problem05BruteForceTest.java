package edo.project.euler.problem;

import org.junit.Before;
import org.junit.Test;

import junit.framework.TestCase;

public class Problem05BruteForceTest extends TestCase {
	private Problem05BruteForce prob5;
	
	@Before
	public void setUp() {
		prob5 = new Problem05BruteForce();
	}
	
	@Test
	public void testWorksForSimplestCase() {
		int expected = 232792560;
		int actual = prob5.solve();
		assertEquals(expected, actual);
	}


}
