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
public class Problem04Refined {

	// 999 * 999 = 998001
	// 100 * 100 =  10000
	// Lets assume that there is a palindrome that is 6 digits long as we want the biggest one
	// 100000x + 10000y + 1000z + 100z + 10y + 1x = palindrome
	// 100001x + 10010y + 1100z = palindrome
	// 11(9091x + 910y + 100z) = palindrome
	
	// problem here is assuming that xyzzyx will be a product of a * b where a and b are 3 digit integers
	// need an additional check that the number is a valid product but that may result in it being less efficient!
	// may be better to just try a brute force with the new reverse but ensure a or b are divisible by 11 which is prime
	// one of a and b must divide by 11 as it is prime and 11(9091x + 910y + 100z) = palindrome therefore the palindrome is divisible by 11!
	// could try having a loop down from 990 and b loop down from 999
//	public int solve() {
//		
//		for (int source = 999; source > 99; source--) {
//			int x = source / 100;
//			int y = (source % 100) / 10;
//			int z = source % 10;
//			
//			int product = 11 * ((9091 * x) + (910 * y) + (100 * z));
//			int reversed = reverse(product);
//			if (reversed == product) { 
//				return product;
//			}
//		}
//		return -1;
//	}
	
	public int solve() {
		int max = 0;
		for (int a = 990; a > 99 ; a-=11) {
			for (int b = 999; b > 99 ; b--) {
				int product = a*b;
				if((max < product) 
				&& (reverse(product) == product)) {
					max = product; 
				}
			}
		}
		return max;
	}
	
	// reverse 123456 to 654321 
	public int reverse(int product) {
		
		int reversed = 0;
		
		while (product > 0) {
			reversed *= 10;
			reversed += product % 10;
			product /= 10;
		}
		return reversed;
	}
	
}
