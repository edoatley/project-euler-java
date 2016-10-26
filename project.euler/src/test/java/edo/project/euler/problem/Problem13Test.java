package edo.project.euler.problem13;

import org.junit.Test;

import edo.project.euler.problem.Problem13;
import junit.framework.TestCase;

public class Problem13Test extends TestCase {
	
	@Test
	public void testBruteForce() {
		String expected = "5537376230";
		String actual = new Problem13().solve();
		assertEquals(expected, actual);
	}

}
