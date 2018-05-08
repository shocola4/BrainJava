/**
 * 
 */

/**
 * @author Administrator
 *
 */
public class Personinfo {


	public static void main(String[] args) {
		
		//매개뱐수 없는 디폴트  생성자 호출하여 객체생성
		Person obj;
//		new Person();
//		 person=new Person();
		//String매개변수 1개있는 생성자 호출하여 객체생성
		
		//person =new Person("홍길동");
		
		//String매개변수 int 매개변수있는 생성자 호출하여 객체생성
		//person =new Person("홍길동",20);
		obj =new Person(20," 홍길동");
		
			
		

		//메소드 호출
		obj.showPerson();
		obj.showPerson(obj);
		
		//System.out.println(obj);

		
    }

}
