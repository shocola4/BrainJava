package chap08.quiz;

public class MathExample3 {

	public static void main(String[] args) {
		
	for(int i=1; i<=7;i++)	{
		
		double randomValue =Math.random();
	int value= (int)(randomValue*45)+1;
	System.out.println(i+"번째 난수"+value);
	}//중복은 나중에
	/*	
		System.out.println(Math.random());
		System.out.println(Math.random());	
		System.out.println(Math.random());*/
	}

}
