package chap06;

public class Example {

	public static void main(String[] args) {
		String str="Information!";
		int n=str.length();
		char[]st=new char[n];
		n--;
		for(int k =n; k>=0; k--) {
			st[n-k]=str.charAt(k);
		}
		for(char k :st) {
			System.out.printf("%c",k);
		}
  /*  int[]a= {90,100,80,70,60,50,30};
    int hap=0;
    float avg;
    for(int i:a)
    	hap=hap+i;
    avg=(float)hap/a.length;
    System.out.printf("%4d %4.2f",hap,avg);*/
	}

}
