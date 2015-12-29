package edo.project.euler.problem11;

import org.junit.Test;

import junit.framework.TestCase;

public class Problem11Test extends TestCase {
	
	@Test
	public void testBruteForce() {
		int expected = 123;
		int actual = new Problem11BruteForce().solve();
		assertEquals(expected, actual);
	}
	

}
