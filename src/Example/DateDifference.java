package Example;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Collections;
import java.util.Date;
import java.util.GregorianCalendar;

public class DateDifference {

	public static void main(String[] args) {
		
		Calendar cal1 = new GregorianCalendar();
		Calendar cal2 = new GregorianCalendar();
		
		SimpleDateFormat sdf = new SimpleDateFormat("dd/mm/yyyy");

	     Date date1 = null;
	     Date date2 = null;
		try {
			date1 = sdf.parse("15/10/1985");
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	     cal1.setTime(date1);
	     try {
			date2 = sdf.parse("15/10/2016");
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	    int dif=  (int)( (date2.getTime() - date1.getTime()) / (1000 * 60 * 60 * 24));
	    int dif2=  (int)( (date2.getTime() - date1.getTime()));
	     cal2.setTime(date2);
	     System.out.println("Days= "+dif2);
	     
	     Collections.unmodifiableList(new ArrayList<String>());
	     
	     String initial = "ABCDEFG"; 
	     String after = initial.replace('A', 'Z'); 
	     System.out.println("initial = " + initial); 
	     System.out.println("after= " + after);
	     
	     String s = null;
	     
	     System.out.println(s);
	}
	

}
