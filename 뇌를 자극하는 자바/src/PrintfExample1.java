/**
 *2018. 5. 10. Dev By Kim HYUNAH
  
  PrintfExample1.java
 */

import java.util.Locale;
import java.util.Calendar;
import java.util.GregorianCalendar;
public class PrintfExample1 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
	System.out.printf("%+d%n", 10);
	System.out.printf("%+d%n", -10);
	System.out.printf("가격:%,d원%n", 10000000);
	Calendar now =new GregorianCalendar();
	
	System.out.printf("%1$tY/%1$tm/%1$td %1$tH:%1$tM:%1$tS %n", now);
	System.out.printf("%1$tY년%1$tm월 %1$td일 %1$tp %1$tH시%1$tM분%1$tS초", now);
	System.out.printf(Locale.US, "%tc %n", now);
	


	}

}
