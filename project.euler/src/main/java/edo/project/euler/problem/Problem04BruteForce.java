package edo.project.euler.problem4;


/**
 * Problem 4 - Largest palindrome product
 * ======================================
 * 
 * A palindromic number reads the same both ways. 
 * The largest palindrome made from the product of two 2-digit numbers is 9009 = 91 × 99.
 *
 * Find the largest palindrome made from the product of two 3-digit numbers.
 *
 * @author Edd
 *
 */
public class Problem04BruteForce {

	public int solve() {
		int max = 0;
		for (int i = 999; i > 99 ; i--) {
			for (int j = 999; j > 99 ; j--) {
				int product = i*j;
				if((max < product) && isPalindrome(product)) {
					max = product; 
				}
			}
		}
		return max;
	}

	private boolean isPalindrome(int product) {
		String oneway = String.valueOf(product);
		StringBuffer s = new StringBuffer(oneway);
		s.reverse();
		return s.toString().equals(oneway);
	}

	
}
