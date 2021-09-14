package inflearn_java01.c01.ex1;

public class Code08 {

	public static void main(String[] args) {

		/*
		 * int n = 10111; // 2, 3, ..., n/2 or sqrt(n)(루트n)
		 */
		for (int n = 2; n <= 10000; n++) {
			boolean isPrime = true;
			for (int i = 2; i * i <= n / 2 && isPrime; i++) // i <= n / 2 && isPrime
				if (n % i == 0)
					isPrime = false;
			// break;
			if (isPrime)
				System.out.println(n);
		}
	}
}
