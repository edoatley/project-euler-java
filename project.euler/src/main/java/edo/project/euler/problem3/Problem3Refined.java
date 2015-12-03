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
	
	public long solve(long testee) {
		
		long testValue = testee;
		long limit = testee / 2;
		
		for (long i = 2; i < limit; i++) {
			if (testValue % i == 0) {
				if(isPrime(i)) {
					testValue /= i;
					if(testValue == 1) {
						return i;
					}
					limit = testee / 2;
					i = 1;

				}
			}
			// if divides exactly then update testee and call recursively unless the other number is prime in which case break
		}
		return -1l;
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
