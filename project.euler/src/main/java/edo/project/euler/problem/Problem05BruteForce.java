package edo.project.euler.problem;


/**
 * Problem 5 - Smallest multiple
 * =============================
 * 
 * 2520 is the smallest number that can be divided by each of the numbers from 1 to 10 without any remainder.
 * 
 * What is the smallest positive number that is evenly divisible by all of the numbers from 1 to 20?
 *
 * @author Edd
 *
 */
public class Problem05BruteForce {

	public int solve() {
		
		int testValue = 2520;
		while(true) {			
			for (int divisor = 1; divisor <= 20; divisor++) {
				if(testValue % divisor != 0) {
					break;
				}
				else if (divisor == 20) {
					return testValue;
				}
			}
			
			testValue++;
		}
	}
	
}
