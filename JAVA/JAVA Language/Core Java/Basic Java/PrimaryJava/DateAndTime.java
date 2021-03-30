package PrimaryJava;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.util.Date;

public class DateAndTime {
	public static void main(String[] args) {
		/*Date */
		
		Date date = new Date();
		//System.out.println(date);
		DateFormat dateFormat = new SimpleDateFormat("dd/MM/YYYY");
		
		String Cdate = dateFormat.format(date); 
		System.out.println(Cdate);
		
		/*Time */
		
		LocalTime time = LocalTime.now();
		//System.out.println(time);
		DateTimeFormatter formatter = DateTimeFormatter.ofPattern("hh.mm.ss");
		String fString = time.format(formatter);
		System.out.println(fString);
	}
}
