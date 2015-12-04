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
 * and the square of the sum is 3025 - 385 = 2640. Find the difference between the sum 
 * of the squares of the first one hundred natural numbers and the square of the sum.
 *
 * @author Edd
 *
 */
public class Problem6BruteForce {
	
	public int solve(int numberOfNumbers) {
		
		int sumOfSquares = 0;
		
		for (int i = 1; i <= numberOfNumbers; i++) {
			sumOfSquares += (i*i);
		}
		
		int squareOfSum = (int) Math.pow((numberOfNumbers * (numberOfNumbers + 1))/2, 2);
		
		return squareOfSum - sumOfSquares;
	}
	
}
