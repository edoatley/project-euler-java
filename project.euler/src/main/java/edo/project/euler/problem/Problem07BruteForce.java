package edo.project.euler.problem;


/**
 * Problem 7 - 10001st prime
 * =========================
 * 
 * By listing the first six prime numbers: 2, 3, 5, 7, 11, and 13, we can see that the 6th prime is 13.
 * 
 * What is the 10,001st prime number?
 *
 * @author Edd
 *
 */
public class Problem07BruteForce {
	
	public long solve(int primeRequired) {
		long candidate = 1;
		long primesEncountered = 0;
		
		while(primesEncountered < primeRequired) {
			candidate++;
			if(isPrime(candidate)) {
				primesEncountered++;
			}
		}
		
		return candidate;
	}
	
	private boolean isPrime(long testee) {
		
		if(testee == 2) {
			return true;
		}
		if(testee % 2 == 0) {
			return false;
		}
		
		long limit = testee / 2;
		for (long i = 3; i < limit; i+=2) {
			if(testee % i == 0) {
				return false;
			}
		}
		
		return true;
	}
	
}
