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
public class Problem05Refined {

	// x = 20a = 19b = 18c = 17d = 16e = 15f = 14g = 13h = 12i = 11j = 10k = 9l = 8m = 7n = 6o = 5p = 4q = 3r = 2s 
	// must be divisible by all the primes between 1 and 20 i.e. 17, 13, 11, 7, 5, 3, 2
	// must be multiple of 17 * 13 * 11 * 7 * 5 * 3 *2 
	
	public int solve() {
		
		int increment = 17 * 13 * 11 * 7 * 5 * 3 * 2;
		int testValue = increment;
		while(true) {			
			for (int divisor = 1; divisor <= 20; divisor++) {
				if(testValue % divisor != 0) {
					break;
				}
				else if (divisor == 20) {
					return testValue;
				}
			}
			
			testValue+=increment;
		}
	}
	
}
