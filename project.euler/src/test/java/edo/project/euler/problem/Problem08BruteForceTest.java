package edo.project.euler.problem;

import org.junit.Before;
import org.junit.Test;

import junit.framework.TestCase;

public class Problem08BruteForceTest extends TestCase {
	private Problem08BruteForce prob8;
	
	@Before
	public void setUp() {
		prob8 = new Problem08BruteForce();
	}
	
	@Test
	public void testProduct1() {
		String input = "222";
		long expected = 8;
		long actual = prob8.product(input);
		assertEquals(expected, actual);
	}
	@Test
	public void testProduct2() {
		String input = "222333444";
		long expected = 13824;
		long actual = prob8.product(input);
		assertEquals(expected, actual);
	}
	@Test
	public void testProduct3() {
		String input = "22201";
		long expected = 0;
		long actual = prob8.product(input);
		assertEquals(expected, actual);
	}
	
	@Test
	public void testWorksForSimplestCase() {
		long expected = 23514624000l;
		long actual = prob8.solve();
		assertEquals(expected, actual);
	}

}
