package edo.project.euler.utils;

public class Utility {

	public static boolean isPrime(long n) {
		
		if(n==1) {				// 1 is not prime
			return false;
		}
		else if(n < 4) {		// 2 & 3 are prime
			return true;
		}
		else if(n % 2 == 0) {	// even numbers except 2 are not prime
			return false;
		}
		else if(n < 9) {		// 5 & 7 are prime
			return true;
		}
		else if(n % 3 == 0) {	// numbers divisible by 3 except 3 are not prime
			return false;
		}
		
		long limit = Double.valueOf(Math.sqrt(n)).longValue();
		for (long f = 5; f <= limit; f+=6) {
			if(n % f == 0) {
				return false;
			}
			if((n % (f+2)) == 0) {
				return false;
			}
		}
		
		return true;
	}
	
}
