import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class Main {

	public static void main(String[] args) {

		// define limit
		int limit = 3000000;
		int count = 0;

		System.out.println("Prime numbers between 1 and " + limit);

		// loop through the numbers one by one
		for (int i = 1; i < limit; i++) {

			boolean isPrime = true;
			count++;
			// check to see if the number is prime
			for (int j = 2; j < i; j++) {

				if (i % j == 0) {
					isPrime = false;
					break;
				}
			}
			// print the number
			if (isPrime) 
			{
				System.out.println(i + " ");
			}
		}

	}
}