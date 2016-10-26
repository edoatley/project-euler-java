package edo.project.euler.problem5;

import org.junit.Before;
import org.junit.Test;

import junit.framework.TestCase;

public class Problem5RefinedTest extends TestCase {
	private Problem5Refined prob5;
	
	@Before
	public void setUp() {
		prob5 = new Problem5Refined();
	}
	
	@Test
	public void testWorksForSimplestCase() {
		int expected = 232792560;
		int actual = prob5.solve();
		assertEquals(expected, actual);
	}
}
