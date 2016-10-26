package edo.project.euler.problem6;


/**
 * Problem 6 - Sum square difference
 * =================================
 * 
 * The sum of the squares of the first ten natural numbers is,
 * 
 * 1^2 + 2^2 + ... + 10^2 = 385
 * 
 * The square of the sum of the first ten natural numbers is,
 * 
 * (1 + 2 + ... + 10)^2 = 55^2 = 3025
 * 
 * Hence the difference between the sum of the squares of the first ten natural numbers 
 * and the square of the sum is 3025 - 385 = 2640.
 * 
 * Find the difference between the sum of the squares of the first one hundred natural 
 * numbers and the square of the sum.
 *
 * @author Edd
 *
 */
public class Problem06Refined {
	
	
	/*
	 * Sum of first n numbers = n(n+1) / 2
	 * Sum of squares of first n numbers more difficult!
	 * 
	 * Taking n = 0 -> 4
	 * 
	 *   n      0       1       2       3       4
	 *  sos     0       1       5      14      30
	 *  diff        1       4       9       16      <-- not constant therefore not linear  
	 *  diff            3        5      7           <-- not constant therefore not quadratic
	 *  diff                 2       2              <-- constant therefore cubic!
	 *  
	 *  So we need a formula in this form:
	 *  
	 *  An^3 + Bn^2 + Cn + D
	 *  
	 *  Looking at the results above we can say that:
	 *  
	 *  D is 0 as A + B + C + D = 0
	 *  
	 *  n           
	 *  1    A +  B +  C = 1
	 *  2   8A + 4B + 2C = 5 
	 *  3  27A + 9B + 3C = 14
	 *  
	 *   From this we can solve for A B and C:
	 *   
	 *   Take 8A + 4B + 2C = 5 we want to only have two unknowns so lets add to -2 times A + B + C = 1:
	 *   
	 *   8A + 4B + 2C =  5
	 *  -2A - 2B - 2C = -2
	 *  -------------------
	 *   6A + 2B      =  3
	 *   
	 *   27A + 9B + 3C = 14
	 *   -3A - 3B - 3C = -3
	 *  -------------------
	 *   24A + 6B      = 11
	 *   
	 *   Multiply 6A + 2B =  3 by -3 giving -18A -6B = -9
	 *   
	 *   24A + 6B  = 11
	 *  -18A - 6B  = -9
	 *  -------------------
	 *    6A       =  2
	 *     A       = 1/3  
	 *     
	 *    6A + 2B =  3 and A = 1/3
	 *    therefore B = 1/2 
	 *
	 *   Testing this on 8A + 4B + 2C = 5 
	 *   
	 *   8/3 + 4/2 + 2C = 5
	 *   4 2/3 + 2C = 5
	 *   2C = 1/3
	 *    C = 1/6
	 *    
	 *  Confirm on other equations:
	 *  
	 *  27/3 + 9/2 + 3/6
	 *  9 + 4.5 + .5 = 14      
	 *   
	 *   sum of squares for numbers up to n = (n^3 / 3) + (n^2 / 2) + (n/6)
	 */
	public int solve(int numberOfNumbers) {
		
		int sumOfSquares = (int) (((Math.pow(numberOfNumbers,3) / 3) 
						 	   + (Math.pow(numberOfNumbers,2) / 2)
						       + ((double)numberOfNumbers / 6)));
		
		int squareOfSum = (int) Math.pow((numberOfNumbers * (numberOfNumbers + 1))/2, 2);
		
		return squareOfSum - sumOfSquares;
	}
	
}
