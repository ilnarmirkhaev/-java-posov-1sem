public class Cats {
	
	public static void main(String[] args) {
		int num = 2001;
		System.out.println(catEnding(num));
	}
	
	public static String catEnding(int num) {
		String cat;
		
		if (num % 10 == 1 && num % 100 / 10 != 1)
			cat = "кот";
		else if (num % 10 >= 2 && num % 10 <= 4 && num % 100 / 10 != 1)
			cat = "кота";
		else
			cat = "котов";
		
		return num + " " + cat;
	}
}