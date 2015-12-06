package edo.project.euler.problem8;

import org.junit.Before;
import org.junit.Test;

import junit.framework.TestCase;

public class Problem8BruteForceTest extends TestCase {
	private Problem8BruteForce prob8;
	
	@Before
	public void setUp() {
		prob8 = new Problem8BruteForce();
	}
	
	@Test
	public void testWorksForSimplestCase() {
		long expected = 9205903071867879424l;
		long actual = prob8.solve();
		assertEquals(expected, actual);
	}

}
