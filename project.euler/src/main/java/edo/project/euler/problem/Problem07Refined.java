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
public class Problem07Refined {
	
	/*
	 * Numbers       2  3  4  5  6  7  8  9  10  11  12  13  14  15  16  17  18  19  20  21  22  23  24  25  26  27  28  29
	 * Prime         *  *     *     *             *       *               *       *               *
	 * Odd              *     *     *     *       *       *       *       *       *
	 * No 2,3,5                     *             *       *               *       *               *                       *
	 * Offset                       0             +4     +2              +4      +2              +4                      +6
	 * 7 + 6n                       *                     *                       *                       *
     * 6n and 6n+2            *     *             *       *               *       *               *       *               *    
     * (starting 5)                   
     * From website some useful facts
     * 
     * * 1 is not a prime.
     * * All primes except 2 are odd.
     * * All primes greater than 3 can be written in the form  6k+/-1.
     * * Any number n can have only one primefactor greater than root n.
     * * The consequence for primality testing of a number n is: 
     *       if we cannot find a number f less than or equal root n 
     *       that divides n then n is prime: the only primefactor of n is n itself
     * 
	 * Can we do a simple function that gives numbers only if not divisible by 2,3,5 
	 */
	public long solve(int primeRequired) {
		long candidate = 1;
		long primesEncountered = 0;
		
		while(primesEncountered < primeRequired) {
			candidate += 2;
			if(isPrime(candidate)) {
				primesEncountered++;
			}
		}
		
		return candidate;
	}
	
	private boolean isPrime(long n) {
		
		if(n==1) {				// 1 is not prime
			return false;
		}
		else if(n < 4) {		// 2 & 3 are prime
			return true;
		}
		else if(n % 2 == 0) {	// even numbers except 2 are not prime
			return false;
		}
		else if(n < 9) {		// 5 & 7 are prime
			return true;
		}
		else if(n % 3 == 0) {	// numbers divisible by 3 except 3 are not prime
			return false;
		}
		
		long limit = Double.valueOf(Math.sqrt(n)).longValue();
		for (long f = 5; f <= limit; f+=6) {
			if(n % f == 0) {
				return false;
			}
			if((n % (f+2)) == 0) {
				return false;
			}
		}
		
		return true;
	}
	
	
}
