package edo.project.euler.problem3;


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
public class Problem3Refined {

	// try looping toward each other skipping even numbers and numbers divisible by 5	
	// if divides exactly then update testee and call recursively unless the other 
	// number is prime in which case break
	public long solve(long testee) {
		
		long testValue = testee;
		long limit = testee / 2;
		
		for (long i = 2; i < limit; i++) {
			if (testValue % i == 0) {
				if(isPrime(i)) {
					testValue /= i;
					// dividing by self therefore this is the largest prime
					if(testValue == 1) {	
						return i;
					}
					limit = testee / 2;
					i = 1;

				}
			}
		}
		return -1l;
	}
	
	// Checks if the number is even then checks
	// all potential factors between 3 and half
    // the number skipping the even numbers	
	public boolean isPrime(long testee) {
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
