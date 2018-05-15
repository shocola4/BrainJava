package chap08.quiz;

public class Employee {
	String name;
	int idNum;
	int Salary;
	boolean sex;

	public static void main(String[] args) {
		Employee myjik=new Employee();
		myjik.name="홍길동";
		myjik.idNum=17001;
		myjik.Salary=45000;
		myjik.sex=true;
		System.out.printf("%s\n",myjik.name);
		System.out.printf("%d\n",myjik.idNum);
		System.out.printf("%d\n",myjik.Salary);
		System.out.printf("%b\n",myjik.sex);


	}

}
