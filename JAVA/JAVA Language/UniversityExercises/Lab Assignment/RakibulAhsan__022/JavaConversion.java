package RakibulAhsan__022;

import java.text.*;
import java.util.*;

class JavaConversion implements Runnable {
    public synchronized void run() {
		/*Convert String to Integer*/
		String string = "123";
		int integer = Integer.parseInt(string);
		System.out.println("Convert String to int(parseInt)"+integer);
		int j = Integer.valueOf(integer);
		System.out.println("Convert String to int(valueOf)"+j);
		
		/*Convert Integer to String*/
		int integerNum = 123;
		String string1 = String.valueOf(integerNum);
		String string2 = Integer.toString(integerNum);
		String string3 = String.format("%d", integerNum);
		System.out.println("Convert Int to String(valueOf)"+string1);
		System.out.println("Convert Int to String(toString)"+string2);
		System.out.println("Convert Int to String(format)"+string3);
		
		/*Convert String to Double*/
		String stringDouble  = "23.45";
		double numDouble = Double.parseDouble(stringDouble);
		System.out.println("Convert String to Double(parseDouble)"+numDouble);
		
		/*Convert Double to String*/
        double numStr = 12.34;
		String stringValue = String.valueOf(numStr);
		String str = Double.toString(numStr);
		System.out.println("Convert Double to String(valueOf)"+stringValue);
		System.out.println("Convert Double to String(toString)"+str);
		
		/*Convert String to Long*/
        String stringLong = "9990449935";
		Long long1 = Long.valueOf(stringLong);
		long long2 = Long.parseLong(stringLong);
		System.out.println("Convert String to Long(valueOf)"+long1);
		System.out.println("Convert String to Long(parseLong)"+long2);
		
		/*Convert Long to String*/
        long l=9993939399L; 
		String stringl1 = String.valueOf(l);
		String stringl2=Long.toString(l);
		System.out.println("Convert Long to String(valueOf)"+stringl1); 
		System.out.println("Convert Long to String(toString)"+stringl2);
		
		/*Convert String to Date*/
        String dateString = "01/10/2020 07:12:34";
		try {
			Date date = new SimpleDateFormat("dd/MM/yyyy hh:mm:ss").parse(dateString);
			System.out.println(date);
		} catch (ParseException e) {
			e.printStackTrace();
		}
		
		/*Convert Date to String*/
		Date date1 = Calendar.getInstance().getTime();
		DateFormat dateFormat = new SimpleDateFormat("dd/MM/YYYY hh:mm:ss");
		String stringDate = dateFormat.format(date1);
		System.out.println(stringDate);
	}
}
