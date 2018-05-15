package chap08.quiz;

import java.util.Date;
import java.text.SimpleDateFormat;
import java.util.Calendar;


/*Calendar calendar=Calendar.getInstance() ;
cal.seTime(new Date());//현재시간 설정
cal.add(Calendar.Date,2);
cal.add(Calendar.Month,2);*/

public class After100Days {

	public static void main(String[] args) {
		/*		
		 * 오늘부터 100일후 날짜
		*/
		   Calendar calendar=Calendar.getInstance() ;
		   calendar.setTime(new Date()); //현재시간 설정
		   calendar.add(Calendar.DATE,100);	
		   
		   SimpleDateFormat dateFormat= new SimpleDateFormat("yyyy년 MM월 dd일");
			String date= dateFormat.format(calendar.getTime());


		   System.out.println(date);
	}

}
