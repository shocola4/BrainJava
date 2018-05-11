package chap08.quiz;

/*import java.util.GregorianCalendar;
import java.util.Calendar;*/
import java.util.*;


public class DateTime {

	public static void main(String[] args) {
	   Calendar now= new GregorianCalendar();
	  // System.out.printf("%1$tY/%1$tm/%1$td %1$tH:%1$tM:%1$tS %n", now);
	  // System.out.printf("%1$tY년%1$tm월%1$td일 %1$tp %1$tH시%1$tM분%1$tS초 %n", now);
		System.out.printf("오늘은 %1$tY년 %1$tm월 %1$td일입니다. %n", now);

	}

}

/*//문제
java.util.GregorianCalendar obj= new java.util.GregorianCalendar();
int year =obj.get(java.util.Calendar.YEAR);
int month =obj.get(java.util.Calendar.MONTH)+1;
int day=obj.get(java.util.Calendar.DAY_OF_MONTH);
		System.out.printf("오늘은 %1$tY년 %1$tm월 %1$td일입니다. %n", now);

*/
/*//문제 import java.util 불려왔을때
GregorianCalendar obj= new GregorianCalendar();
int year =obj.get(java.util.Calendar.YEAR);
int month =obj.get(java.util.Calendar.MONTH)+1;
int day=obj.get(java.util.Calendar.DAY_OF_MONTH);
		System.out.printf("오늘은"+YEAR+"년"+ MONTH+"월"+DAY+"일"일입니다. %n", now);

*/