package JavaConversion;

import java.util.Date;
import java.text.ParseException;
import java.text.SimpleDateFormat;

public class StringToDate {
	public static void main(String[] args) throws ParseException {
		String dateString = "01/10/2020 07:12:34";
		
		Date date =  new SimpleDateFormat("dd/MM/yyyy hh:mm:ss").parse(dateString);
		 
		System.out.println(date);
	}
}
