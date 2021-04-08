package Next_year_day;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Scanner;
public class UserMainCode {
		public static String nextYearDay(String d) throws Exception {
			Date date1=new SimpleDateFormat("dd/MM/yyyy").parse(d);
			Calendar c = Calendar.getInstance();
	        c.setTime(date1);
	        c.add(Calendar.YEAR, 1);
	        Date currentDatePlusOne = c.getTime();
	        String dayWeekText = new SimpleDateFormat("EEEE").format(currentDatePlusOne);
	        return dayWeekText;
		}
}

