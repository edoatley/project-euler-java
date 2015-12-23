package edo.project.euler.problem10;

import org.junit.Before;
import org.junit.Test;

import junit.framework.TestCase;

public class Problem10BruteForceTest extends TestCase {
	private Problem10BruteForce prob10;
	
	@Before
	public void setUp() {
		prob10 = new Problem10BruteForce();
	}
	
	@Test
	public void testWorksForVerySimpleCase() {
		long expected = 17;
		long actual = prob10.solve(10);
		assertEquals(expected, actual);
	}
	
	@Test
	public void testWorksForSimplestCase() {
		long expected = 142913828922L;
		long actual = prob10.solve(2000000);
		assertEquals(expected, actual);
	}
	@Test
	public void testWorksForBigCase() {
		long expected = 1075207199997334L;
		long actual = prob10.solve(200000000l);
		assertEquals(expected, actual);
	}
}