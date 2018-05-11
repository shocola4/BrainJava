package chap08.quiz;

public class StringExample7 {

	public static void main(String[] args) {
		String str1="Let it be.";
		String str2=str1.trim();
		System.out.println(str2);
		System.out.println(str2.concat("Speaking words of wisdom."));//연결
		System.out.println(str2.toUpperCase());//대문자전환
		System.out.println(str2.toLowerCase());//소문자전환
		System.out.println(str2.replace('e', 'a'));// 문자 봐뀜 
		System.out.println(str1);
		System.out.println(str2);


	}

}
