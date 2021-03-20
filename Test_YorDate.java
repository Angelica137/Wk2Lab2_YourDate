// File: Test_YorDate.java
/**
 * Test harness for YorDate class
 *
 * @author Tommy Yuan
 * @version 24 January 2019
 */

public class Test_YorDate {
	public static void main(String args[]) {
		// Create a reference to a YorDate object
		YorDate date1;

		// This creates an object which sets the date to the current date
		date1 = new YorDate();

		// create second date object using 2nd constructor
		YorDate date2 = new YorDate(date1);

		// Using the appropriate methods set, set date1 to your birthdate
		date1.setDay(10);
		date1.setMonth(10);
		date1.setYear(1999);

		// Using appropriate date1 method(s) display your birthday
		System.out.print(date1.getDay() + " ");
		System.out.print(date1.getMonth() + " ");
		System.out.println(date1.getYear() + ".");

		System.out.println("You were bonr on a " + date1.getDayOfWeek());

	}
}