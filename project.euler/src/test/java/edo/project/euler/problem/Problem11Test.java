package edo.project.euler.problem11;

import org.junit.Test;

import edo.project.euler.problem.Problem11BruteForce;
import junit.framework.TestCase;

public class Problem11Test extends TestCase {
	
	@Test
	public void testBruteForce() {
		int expected = 70600674;
		int actual = new Problem11BruteForce().solve();
		assertEquals(expected, actual);
	}
	

}
