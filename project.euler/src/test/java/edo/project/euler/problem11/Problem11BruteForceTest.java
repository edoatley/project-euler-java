package edo.project.euler.problem11;

import org.junit.Before;
import org.junit.Test;

import edo.project.euler.problem10.Problem10BruteForce;
import junit.framework.TestCase;

public class Problem11BruteForceTest extends TestCase {
	private Problem11BruteForce prob11;
	
	@Before
	public void setUp() {
		prob11 = new Problem11BruteForce();
	}
	
	@Test
	public void testWorksForSimplestCase() {
		int expected = 123;
		int actual = prob11.solve();
		assertEquals(expected, actual);
	}
	

}
