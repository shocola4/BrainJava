package chap08.quiz;

import java.util.GregorianCalendar;
import java.util.Calendar;
public class CalenderExmaple1 {
	
	public static void main(String[] args) {
		
	GregorianCalendar calendar= new GregorianCalendar();
	int year= calendar.get(Calendar.YEAR);
	int month= calendar.get(Calendar.MONTH)+1;
	int date= calendar.get(Calendar.DATE);
	int amPm= calendar.get(Calendar.AM_PM);
	//int hour= calendar.get(Calendar.HOUR);
	int hour= calendar.get(Calendar.HOUR_OF_DAY);
	int min= calendar.get(Calendar.MINUTE);
	int sec= calendar.get(Calendar.SECOND);
	String sAmPm = (amPm == Calendar.AM )?"오전":"오후";
	System.out.printf("%d년 %d월 %d일 %s %d시 %d분 %d초",
			year,month,date, sAmPm ,hour,min,sec);
		
	
/*	System.out.println(cal);
	
	cal.get(Calendar.YEAR);*/
	
	
	}

}
