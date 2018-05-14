package chap08.quiz;

import java.util.StringTokenizer;

public class StringTokenizerExample3 {

	public static void main(String[] args) {

		StringTokenizer stok =new StringTokenizer("사과=10|초콜렛=3|샴페인=1","=|",true );
		
		while(stok.hasMoreTokens()){
			String token =stok.nextToken();
			
			//System.out println(token);
			if(token.equals("="))
				System.out.println("\t");
			else if(token.equals("|"))
			System.out.println("\n");
			else
			System.out.println(token);
		}
	
	}

}
