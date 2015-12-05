package edo.project.euler.problem7;


/**
 * Problem 7 - 10001st prime
 * =========================
 * 
 * By listing the first six prime numbers: 2, 3, 5, 7, 11, and 13, we can see that the 6th prime is 13.
 * 
 * What is the 10 001st prime number?
 *
 * @author Edd
 *
 */
public class Problem7Refined {
	
	/*
	 * Numbers       2  3  4  5  6  7  8  9  10  11  12  13  14  15  16  17  18  19  20  21  22  23  24  25  26  27  28  29
	 * Prime         *  *     *     *             *       *               *       *               *
	 * Odd              *     *     *     *       *       *       *       *       *
	 * No 2,3,5                     *             *       *               *       *               *                       *
	 * Offset                       0             +4     +2              +4      +2              +4                      +6
	 * 7 + 6n                       *                     *                       *                       *
     * 
	 * Can we do a simple function that gives numbers only if not divisible by 2,3,5 
	 */
	public long solve(int primeRequired) {
		long candidate = 2;
		long primesEncountered = 1;
		
		while(primesEncountered < primeRequired) {
			candidate++;
			if((candidate % 2 == 1) && isPrime(candidate)) {
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
