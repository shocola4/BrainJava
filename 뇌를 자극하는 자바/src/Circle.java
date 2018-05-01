/**
 *2018. 5. 2. Dev By Kim HYUNAH
  
  Circle.java
 */

/**
 * @author Administrator
 *
 */
public class Circle {
	int radius; 					// 원의 반지름 필드
	String name; 				// 원의 이름 필드
	// 매개변수를 가진 생성자
	public Circle(int r,String n) { 
		radius=r;
		name=n;
	}			
	//메소드
	public double getArea() { 
		return 3.14*radius*radius;
	}
   //메인 메소드
	public static void main(String[] args) {
			Circle pizza = new Circle(10,"자바피자"); 				
		double area = pizza.getArea(); 		// 피자의 면적 알아내기
		System.out.println(pizza.name + "의 면적은 " + area);
/*
		Circle donut = new Circle(); 	
		donut.radius = 2; 					
		donut.name = "자바도넛"; 		
			
		double donut. area = donut.getArea(); 				
		System.out.println(donut.name + "의 면적은 " +donut area);
		System.out.println(pizza.name + "의 면적은 " +pizza area);
		*/
	}
}
