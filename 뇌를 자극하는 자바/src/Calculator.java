import java.util.Scanner;

public class Calculator {
	// �Ӽ��ʵ� (������)
	//int number1=0;
	//int number2=0;
	
	//�޼ҵ�(�Լ�����)
		public int plus (int x,int y,int z)
	{
		int total=x+y+z;//total=100+200;
		return total;
	}
	public static void main(String[] args) {
		
		int num1,num2,num3;
		System .out. println("���� ���� �Է�");
		Scanner scan =new Scanner(System.in);
		 num1= scan.nextInt();
		 num2= scan.nextInt();
		 num3= scan.nextInt();
		//scanf("%d",total)

    //��ü����
		Calculator cal=new Calculator();
		int result =cal.plus(num1, num2,num3);
		System .out. println("result:"+result);

	
	}

}
