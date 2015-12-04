package edo.project.euler.problem5;

import org.junit.Before;
import org.junit.Test;

import junit.framework.TestCase;

public class Problem5BruteForceTest extends TestCase {
	private Problem5BruteForce prob5;
	
	@Before
	public void setUp() {
		prob5 = new Problem5BruteForce();
	}
	
	@Test
	public void testWorksForSimplestCase() {
		int expected = 232792560;
		int actual = prob5.solve();
		assertEquals(expected, actual);
	}


}
