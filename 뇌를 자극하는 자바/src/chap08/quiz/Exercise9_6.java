package chap08.quiz;

import java.util.GregorianCalendar;
import java.util.Random;

public class Exercise9_6 {

	public static void main(String[] args) {
		
		GregorianCalendar gcalendar=new GregorianCalendar();// 돌리때마다 바뀌는 것을 도와줌
		//System.out.println(gcalendar.getTimeInMillis());
		int frontCount=0 , backCount=0;
		Random random= new Random(gcalendar.getTimeInMillis());

		for(int i=1; i<=10; i++) {
			
			int randomValue = random.nextInt(2);
			
			if(randomValue==0) {
				frontCount++;
				System.out.print("앞면");
			}
			else {
				backCount++;				
				System.out.print("뒷면");
			}
			
			System.out.println(randomValue);
	  }
		//System.out.println("동전앞면"+frontCount+"     "+"동전뒷면"+backCount);
		System.out.println(random.nextBoolean());

	}

}
