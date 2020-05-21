public class LeapYear {
	// новый комментарий
	public static void main(String[] args) {
		int year = 2017;
		if (isLeapYear(year))
			System.out.println(year + " is a leap year.");
		else
			System.out.println(year + " is NOT a leap year.");
	}
	
	private static boolean isLeapYear(int year) {
		if (year % 400 == 0)
			return true;
		else if (year % 100 == 0)
			return false;
		else if (year % 4 == 0)
			return true;
		else
			return false;
	}

}