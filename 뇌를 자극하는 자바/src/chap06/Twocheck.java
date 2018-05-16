package chap06;

public class Twocheck {

	public static void main(String[] args) {
		int[] exint= {2,4,2,47,6,4,7,2,3,4,5};
		
		int value=0;
		
		for(int i=0;i<exint.length;i++) {
			if(exint[i]==2) {
				value++;
			}
		}
		System.out.println(value);
	}

}
