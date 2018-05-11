package chap08.quiz;

public class Exercise9_2 {

	public static void main(String[] args) {

		String str1="Java Programing";
		//int index= str1 .indexOf("a");//1번째인덱스
		//int index= str1 .indexOf("a",2);//2번째인덱스
		//int index= str1 .indexOf("a",3);//3번째인덱스

		int index=str1.lastIndexOf('a');
		
		System.out.println(index);
		
		if(index<0)
			System.out.println("검색결과가 없습니다.");

		else
		System.out.println(index+"인덱스에 위치하고있습니다.");

	}

}
