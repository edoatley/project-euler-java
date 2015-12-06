package edo.project.euler.problem8;

import org.junit.Before;
import org.junit.Test;

import junit.framework.TestCase;

public class Problem8RefinedTest extends TestCase {
	private Problem8Refined prob8;
	
	@Before
	public void setUp() {
		prob8 = new Problem8Refined();
	}
	
	@Test
	public void testWorksForSimplestCase() {
		long expected = 1;
		long actual = prob8.solve();
		assertEquals(expected, actual);
	}
}
