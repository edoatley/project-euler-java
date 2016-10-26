package edo.project.euler.problem;


/**
 * Problem 3 - Largest prime factor
 * ================================
 * 
 * The prime factors of 13195 are 5, 7, 13 and 29.
 *
 * What is the largest prime factor of the number 600851475143 ?
 * 
 * @author Edd
 *
 */
public class Problem3BruteForce {

	public long solve(long testee) {
		
		for (long i = (testee / 2); i > 2 / 2; i--) {
			if(testee % i == 0 && isPrime(i)) {
				return i;
			}
		}
		return -1;
	}
	
	public boolean isPrime(long testee) {
		
		for (long i = 2; i < testee / 2; i++) {
			if(testee % i == 0) {
				return false;
			}
		}
		
		return true;
	}
	
}
