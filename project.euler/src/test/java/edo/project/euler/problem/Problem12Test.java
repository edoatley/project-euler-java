package edo.project.euler.problem;

import org.junit.Test;

import edo.project.euler.problem.Problem12;
import junit.framework.TestCase;

public class Problem12Test extends TestCase {
	
	@Test
	public void testBruteForce() {
		int expected = -1;
		long actual = new Problem12().solve();
		assertEquals(expected, actual);
	}
	

}
