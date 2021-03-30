package JavaConversion;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class DateToString {
	public static void main(String[] args) {
		Date date = Calendar.getInstance().getTime();
		DateFormat dateFormat = new SimpleDateFormat("dd/MM/YYYY hh:mm:ss");
		String string = dateFormat.format(date);
		System.out.println(string);
	}
}
