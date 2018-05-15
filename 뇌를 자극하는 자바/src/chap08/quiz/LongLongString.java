package chap08.quiz;

public class LongLongString {

	public static void main(String[] args) {
		
		StringBuilder stringbuilder=new StringBuilder();
		
		for(String str:args) {
		
			stringbuilder.append(str);
			stringbuilder.append("  ");

		}

		System.out.println(stringbuilder);
	}

}
