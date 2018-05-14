package chap08.quiz;

import java.util.*;
import java.text.*;


public class CalenderExmaple3 {

	public static void main(String[] args) {
		GregorianCalendar calendar= new GregorianCalendar();
		//SimpleDateFormat dateFormat= new SimpleDateFormat("yyyy년 MM월 dd일 EEEE aa hh시 mm분 ss초");
		SimpleDateFormat dateFormat= new SimpleDateFormat("yyyy-MMM-dd a hh:mm:ss");

		String date= dateFormat.format(calendar.getTime());
		System.out.println(date);
				
	}

}
