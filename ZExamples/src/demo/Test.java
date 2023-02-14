package demo;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Test {

	public static void main(String args[]) {

		Date date = new Date();
		String newstr = new SimpleDateFormat("dd").format(date);
		String monthS = new SimpleDateFormat("MM").format(date);
		String yearS = new SimpleDateFormat("yyyyy").format(date);

		System.out.println("\n" + "date--" + newstr + "\n");
		System.out.println("\n" + "month--" + monthS + "\n");
		System.out.println("\n" + "year--" + yearS + "\n");

//		int dateOnly = Integer.parseInt(newstr);
		int dateOnly = 7;
//		int month = Integer.parseInt(monthS);
		int month = 1;
//		int year = Integer.parseInt(yearS);
		int year = 1700;
		int lagDays = 0;

		if (dateOnly >= 1 && dateOnly < 7) {
			lagDays = dateOnly - 7;
		} else if (dateOnly >= 7 && dateOnly < 14) {
			lagDays = dateOnly - 14;
		} else if (dateOnly >= 14 && dateOnly < 21) {
			lagDays = dateOnly - 21;
		} else if (dateOnly >= 21 && dateOnly < 28) {
			lagDays = dateOnly - 28;
		}
		else if (dateOnly == 28) {
			// 31 days month
			if (month == 2) {
				// leap Year, means 29 day in 2nd month
				if (year % 400 == 0 || year % 4 == 0 || year % 100 != 0) {
					lagDays = dateOnly - 30;
				}
				// normal 28
				else {
					lagDays = dateOnly - 29;
				}
			}
			// 30 days month
			else if (month == 4 || month == 6 || month == 9 || month == 11) {
				lagDays = dateOnly - 31;
			} else {
				lagDays = dateOnly - 32;
			}
		}
		System.out.println(lagDays);

	}
}
