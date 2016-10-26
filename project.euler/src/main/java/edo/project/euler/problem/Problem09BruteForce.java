package edo.project.euler.problem9;


/**
 * Problem 9 - Special Pythagorean triplet
 * =======================================
 * 
 * A Pythagorean triplet is a set of three natural numbers, a < b < c, for which,
 * 
 *  a^2 + b^2 = c^2
 * 
 * For example, 3^2 + 4^2 = 9 + 16 = 25 = 5^2.
 *
 * There exists exactly one Pythagorean triplet for which a + b + c = 1000.
 * 
 * Find the product abc.
 * 
 * @author Edd
 *
 */
public class Problem9BruteForce {
	
	public int solve() {
		
		for (int c = 1; c < 1000; c++) {			
			for (int b = 1; b < c; b++) {				
				for (int a = 1; a < b; a++) {
					if((a+b+c) == 1000) {
						int sum = Double.valueOf(Math.pow(a, 2) + Math.pow(b, 2)).intValue();
						sum -= Double.valueOf(Math.pow(c, 2)).intValue();
						if(sum == 0) {
							return a*b*c;
						}
					}
				}
			}
		}
		return -1;
	}
	
}
