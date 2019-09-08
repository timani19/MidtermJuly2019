package math.problems;

public class PrimeNumber {
	/*
	 * Find list of Prime numbers from number 2 to 1 million.
	 * Try the best solution as possible.Which will take less CPU life cycle.
	 * Out put number of Prime numbers on the given range.
	 *
	 *
	 * Use any databases[MongoDB, Oracle, MySql] to store data and retrieve data.
	 *
	 */

	public static boolean isAPrimeNumber(int n) {

		if (n % 2 == 0) {
			return false;
		}
		for (int i = 3; i * i <= n; i += 2) {

			if (n % i == 0) {
				return false;
			}
		}
		return true;
	}

	public static void main(String[] args) {
		System.out.println("\nThe list of prime numbers are:\n");
		int c = 0;
		for (int i = 2; i < 1000000; i++) {
			if (i == 2) {
				System.out.println(i);
				c++;

			} else {
				if (isAPrimeNumber(i)) {
					c++;

					System.out.println(i);
				}
			}
		}
	}
}




