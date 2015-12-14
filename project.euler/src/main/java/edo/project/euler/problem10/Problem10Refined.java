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
public class Problem10Refined {
	
	public long solve(long limit) {

		long sum = 2 + 3; // init to all primes below 5
		
		for (long f = 5; f <= limit; f+=6) {
			if(Utility.isPrime(f)) {
				sum += f;
			}
			if(Utility.isPrime(f+2)) {
				sum += (f+2);
			}
		}
		
		return sum;
	}
	
}
