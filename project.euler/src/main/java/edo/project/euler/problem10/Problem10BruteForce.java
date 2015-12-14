package edo.project.euler.problem10;

import edo.project.euler.utils.Utility;

/**
 * Problem 10 - Summation of primes
 * ================================
 * 
 * The sum of the primes below 10 is 2 + 3 + 5 + 7 = 17.
 * 
 * Find the sum of all the primes below two million.
 * 
 * @author Edd
 *
 */
public class Problem10BruteForce {
	
	public long solve(long limit) {

		long sum = 0;
		for (long i = 0; i < limit; i++) {
			if(Utility.isPrime(i)) {
				sum += i;
			}
		}
		
		return sum;
	}
	
}
