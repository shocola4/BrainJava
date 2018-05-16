package chap06;

//import java.util.Scanner;

//class IntClass {
//	int a,b,c;
//	}
//public static int a=1;
//static int i,j;
public class Problem {
	
	public static void main(String[] args)  {
		char c[] = { '+','-','/','*' };
		double p;
		switch (c[3])
		{
		case  '+':
			p = 0;
			for (int i = 0; i < 5; i++, p += i);
				break;
		case  '-':
			p = 0;
			for (int i = 0; i < 5; i++, p -= i);
			break;
		case  '/':
			p = 1;
			for (int i = 0; i < 5; i++, p /= i);
			break;
		default:
			p = 1;
			for (int i = 0; i < 5; i++, p *= i);
		
			break;
		}
		System.out.printf("%.3f", p);
	}

}

//
//{
//	int inNum;
//	Scanner scan01=new Scanner(System .in);
//	inNum=scan01.nextInt();
//	if(inNum%2==0) {
//		System.out.printf("%d=짝수입니다.",inNum);
//	}
//	else
//		System.out.printf("%d=홀수입니다.",inNum);
//		scan01.close();
//	
//}


//
//{
//	int a,b=10;
//	for(a=0; a<5;++a,b-=a);
//	System.out.printf("%d,%d\n", a,b);
//}

//{
//	i=10;
//	j=20;
//	change();
//	System.out.printf("%d,%d\n",i,j);
//}
//static void change()
//{
//	int temp;
//	temp=i;
//	i=j;
//	j=temp;
//}

////{
//int a=2,b=3,c=4,d,e;
//d=a&b&~b;
//e=a|b&c;
//System.out.printf("%d,%d\n",d,e);
//}


//
//	increase();
//	increase();
//
//}
//static void increase() {
//	int b=2;
//	System.out.printf("%d,%d\n", ++a,++b);
//}


////String str;
////str="Power overwhelming!";
////System.out.printf("%8.4s\n", str);
//
//}


//String str="Programming";
//int n=str.length();
//char[]st=new char[n];
//n--;
//for(int k=n; k>=0;k--) {
//	st[n-k]=str.charAt(k);
//}
//for(char k :st) {
//	System.out.printf("%c",k);
//}


//int[][]a= {{11,12,13,14},{21,22,23,24}};
//int hap=0;
//for(int i[]:a) 
//{
//	for(int j:i)
//		hap+=j;
//}
//System.out.printf("%d",hap);
	
//	IntClass myVar =new IntClass();
//	myVar.a=10;
//	myVar.b=10;
//	myVar.c=10;
//	prnt(myVar);
//	System.out.printf("a=%d,b=%d,c=%d",	myVar.a ,myVar.b ,myVar.c );
//}
//static void prnt(IntClass myVar) {
//	myVar.a+=myVar.b-=myVar.c*=10;
//}