public class PrimalityTest {
	// новый комментарий
	public static void main(String[] args) {
		for (int i = 0; i < 1001; i++)
			if (isPrime(i))
				System.out.printf("Число %d простое\n", i);
			else
				System.out.printf("Число %d составное или 0, 1\n", i);
	}
	
	private static boolean isPrime(int x) {
		if (x == 0 || x == 1)
			return false;
		for (int i = 2; i <= Math.sqrt(x); i++)
			if (x % i == 0)
				return false;
		return true;
	}

}