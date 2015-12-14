package edo.project.euler.problem10;

import org.junit.Before;
import org.junit.Test;

import junit.framework.TestCase;

public class Problem10RefinedTest extends TestCase {
	private Problem10Refined prob10;
	
	@Before
	public void setUp() {
		prob10 = new Problem10Refined();
	}
	
	@Test
	public void testWorksForSimplestCase() {
		long expected = 1179908154;
		long actual = prob10.solve(2000000);
		assertEquals(expected, actual);
	}
	
	@Test
	public void testWorksForBigCase() {
		long expected = 1075207199997334l;
		long actual = prob10.solve(200000000);
		assertEquals(expected, actual);
	}
	
}
