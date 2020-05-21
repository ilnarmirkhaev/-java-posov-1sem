import java.util.Arrays; 
// изменение из дома
public class SieveOfEratosthenes {
	
	public static void main(String[] args) {
		// создадим boolean-массив с помощью функции
		int n = 100, count = 0;
		boolean[] isPrimeList = Eratosthenes(n);
		// пройдем по boolean-массиву и запишем сколько простых чисел до n
		for (int i = 0; i < isPrimeList.length; i++)
			if (isPrimeList[i])
				count++;
		// создадим и заполним массив длины count
		int[] primeList = new int[count];
		int j = 0;
		for (int i = 0; i < isPrimeList.length; i++)
			if (isPrimeList[i])
				primeList[j++] = i;
		System.out.printf("Список простых чисел до %d:\n", n);
		for (int x : primeList)
			System.out.println(x);
	}
	
	public static boolean[] Eratosthenes(int n) {
		// создадим массив и присвоим ячейкам от 2 до n значение true
		boolean[] answer = new boolean[n + 1];
		Arrays.fill(answer, 2, n, true);
		// начнем "вычеркивать" числа, делящиеся на i
		for (int i = 2; i <= Math.sqrt(n); i++)
			if (answer[i])
				for (int j = 2 * i; j <= n; j += i)
					answer[j] = false;
			else
				continue;
		return answer;
	}
	
}