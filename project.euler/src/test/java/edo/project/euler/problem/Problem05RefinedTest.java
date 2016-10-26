package edo.project.euler.problem;

import org.junit.Before;
import org.junit.Test;

import junit.framework.TestCase;

public class Problem05RefinedTest extends TestCase {
	private Problem05Refined prob5;
	
	@Before
	public void setUp() {
		prob5 = new Problem05Refined();
	}
	
	@Test
	public void testWorksForSimplestCase() {
		int expected = 232792560;
		int actual = prob5.solve();
		assertEquals(expected, actual);
	}
}
