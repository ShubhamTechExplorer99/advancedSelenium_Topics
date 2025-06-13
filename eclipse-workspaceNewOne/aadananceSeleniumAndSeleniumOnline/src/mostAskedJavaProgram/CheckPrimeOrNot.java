package mostAskedJavaProgram;

import java.util.ArrayList;
import java.util.List;

public class CheckPrimeOrNot {

	public static void main(String[] args) {

		int num = 13;
		boolean isPrime = true;

		for (int i = 2; i <= Math.sqrt(num); i++) {
			if (num % i == 0) {
				isPrime = false;
				break;
			}
		}

		System.out.println(isPrime);

	}

}
