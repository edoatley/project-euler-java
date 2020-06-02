package edo.project.euler.problem;

import java.util.List;

/**
 * Problem 14 - Longest Collatz sequence 
 * ======================================
 * 
 * The following iterative sequence is defined for the set of positive integers:
 * 
 * n → n/2 (n is even)     e.g. 20 becomes 10
 * n → 3n + 1 (n is odd)   e.g. 13 becomes 40
 * 
 * Using the rule above and starting with 13, we generate the following
 * sequence:
 * 
 * 13 → 40 → 20 → 10 → 5 → 16 → 8 → 4 → 2 → 1 It can be seen that this sequence
 * (starting at 13 and finishing at 1) contains 10 terms. Although it has not
 * been proved yet (Collatz Problem), it is thought that all starting numbers
 * finish at 1.
 * 
 * Which starting number, under one million, produces the longest chain?
 * 
 * NOTE: Once the chain starts the terms are allowed to go above one million.
 * 
 * @author Edd
 *
 */
public class Problem14 {
	
	public int solveIterativelyClever(int solveUpTo) {
		
		int max = 0;
		int maxTerms = 0;
		int[] solutions = new int[solveUpTo];
		for (int i = 0; i < solveUpTo; i++) {
			
			long test = i+1;
			int count = 0;
			
			
			for (count = 1; test > 1; count++) {
				if(test <= i){
					count += solutions[(int)test-1] - 1;
					break;
				}
				else {					
					test = (test % 2 ==0) ? test/2 : test*3+1;
				}
			}
			solutions[i] = count;
			
			if(count > maxTerms) {
				maxTerms = count;
				max = i+1;
			}
		}
		
		return max;
	}
	
	public int solveIteratively(int solveUpTo) {
		
		int max = 0;
		int maxTerms = 0;
		
		for (int i = 0; i < solveUpTo; i++) {

			int count = collatzIter(i+1);
			
			if(count > maxTerms) {
				maxTerms = count;
				max = (i+1);
			}
		}
		
		return max;
	}
	

	public int collatzIter(int num) {
		int count = 0;
		long test = num;
		for (count = 1; test > 1; count++) {
			test = (test % 2 ==0) ? test/2 : test*3+1;
		}
		return count; 
	}

	private void printTerms(List<Integer> terms) {
		StringBuffer buff = new StringBuffer();
		
		for (Integer term : terms) {
			buff.append(term + " --> ");
		}
		buff.delete(buff.length() - 5, buff.length());
		System.err.println(buff.toString());
	}

}
