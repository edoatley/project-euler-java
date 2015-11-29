package edo.project.euler.problem1;

/**
 * Problem 1 - Multiples of 3 and 5
 * ================================
 * If we list all the natural numbers below 10 that are multiples of 3 or 5, we get 3, 5, 6 and 9. 
 * The sum of these multiples is 23.
 * 
 * Find the sum of all the multiples of 3 or 5 below 1000.
 * @author Edd
 *
 */
public class Problem1Refined {
	
	public int solve(int maximum) {
		// a) sum all 3n for n=1 --> maximum-1/3
		// b) sum all 5n for n=1 --> maximum-1/5
		// c) sum all 15n for n=1 --> maximum-1/15
		// answer = a + b - c
		return sumAllNumbersDivisbileBy(3, maximum) 
			 + sumAllNumbersDivisbileBy(5, maximum) 
			 - sumAllNumbersDivisbileBy(15, maximum); 
	}
	
	/**
	 * Sums all values that divide by the value passed in provided the value is below the limit
	 *  e.g. given 3 and a non-inclusive limit 1000 the sum is:
	 *  3, 6, 9, 12, 15 ... 999 
	 *  which is equivalent to 3 (1,2,3,4,5...333)
	 *  which is equivalent to 3 (333*334 / 2) 
	 *  so we can solve generically by doing 
	 *  divisibleBy * ((nonInclusiveLimit - 1) / divisibleBy) * (((nonInclusiveLimit - 1) / divisibleBy) + 1) / 2	
	 *  
	 * @param divisibleBy       the number the value must divide by to be included in the sum
	 * @param nonInclusiveLimit the number the value must be below to be included in the sum
	 * @return
	 */
	public int sumAllNumbersDivisbileBy(int divisibleBy, int nonInclusiveLimit){
		int maximumFactor = (nonInclusiveLimit - 1) / divisibleBy;
		return divisibleBy * ((maximumFactor * (maximumFactor + 1)) / 2);
	}
	
}
