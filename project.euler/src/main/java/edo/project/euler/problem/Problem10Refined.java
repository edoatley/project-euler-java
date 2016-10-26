package edo.project.euler.problem;

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
	
	
	/**
	 * Using The sieve of Eratosthenes
	 * 
	 * 1. Make a list of all numbers from 2 to N.
	 * 2. Find the next number p not yet crossed out. This is a prime.If it is greater than √N, go to 5.
	 * 3. Cross out all multiples of p which are not yet crossed out.
	 * 4. Go to 2.
	 * 5. The numbers not crossed out are the primes not exceeding N.
	 * 
	 * 
	 * @param limit
	 * @return
	 */
	public long solve(long limit) {
		
		boolean[] sieve = new boolean[(int)limit]; // initially all false
		
		long findPrimesLimit = Double.valueOf(Math.sqrt(limit)).longValue();
		
		// mark even numbers > 2
		for (int n = 4; n < limit; n+=2) {
			sieve[n] = true;
		}

		// mark the composites of all other numbers
		// only need check odd numbers as all evens marked
		
		//  1   2   3   4   5   6   7   8   9   10   11   12   13   14   15   16   17
		//  -   f   f   t   f   t       t        t         t         t         t 
		for (int n = 3; n < findPrimesLimit; n+=2) {
			if(!sieve[n]) {	// n not marked, hence prime
				// You only need to start crossing out multiples at n^2, 
				// because any smaller multiple of n has a prime divisor less than p 
				// and has already been crossed out as a multiple of that. This is also
				// the reason why we can stop after we’ve reached √limit a.k.a. findPrimesLimit .
				// e.g. for n= 
				for (int m = (n*n); m < limit; m+=2*n) {
					sieve[m] = true;
				}
			}
		}
	
		long sum = 0;
		
		// sum the unmarked numbers as they are prime
		for (int n = 2; n < limit; n++) {
			if(!sieve[n]) {
				sum += n;
			}
		}
		
		return sum;
	}
	
}
