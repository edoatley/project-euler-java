package edo.project.euler.problem14;

import org.junit.Test;

import edo.project.euler.problem.Problem14;
import junit.framework.TestCase;

public class Problem14Test extends TestCase {

	@Test
	public void testIterativelyForce() {
		int expected = 837799;
		int actual = new Problem14().solveIteratively(1000000);
		assertEquals(expected, actual);
	}
	
	@Test
	public void testIterativelyClever() {
		int expected = 837799;
		int actual = new Problem14().solveIterativelyClever(1000000);
		assertEquals(expected, actual);
	}
	@Test
	public void testIterativelyClever2() {
		int expected = 25;
		int actual = new Problem14().solveIterativelyClever(26);
		assertEquals(expected, actual);
	}
	
	@Test
	public void testCollatzIter() {
		int expected = 10;
		int actual = new Problem14().collatzIter(13);
		assertEquals(expected, actual);
	}	
	
	@Test
	public void testCollatzIter2() {
		int expected = 11;
		int actual = new Problem14().collatzIter(26);
		assertEquals(expected, actual);
	}	
	
	@Test
	public void testCollatzIter3() {
		int expected = 476;
		int actual = new Problem14().collatzIter(910107);
		assertEquals(expected, actual);
	}	
	
	@Test
	public void testCollatzIter4() {
		int expected = 525;
		int actual = new Problem14().collatzIter(837799);
		assertEquals(expected, actual);
	}	

}
