package Months_Between_Dates;
import java.time.LocalDate;
import java.time.temporal.ChronoUnit;
import java.util.Scanner;

public class UserMainCode {
	public static int getMonthDifference(String date1,String date2) {
		long daysBetween = ChronoUnit.MONTHS.between(LocalDate.parse(date1),
			    LocalDate.parse(date2));
		return (int) daysBetween;
}
}
