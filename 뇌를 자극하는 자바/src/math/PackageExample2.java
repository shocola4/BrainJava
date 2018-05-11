/**
 *2018. 5. 11. Dev By Kim HYUNAH
  math
  PackageExample2.java
 */
package math;

import geometry.polygon.Rectangle;


public class PackageExample2 {

	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Rectangle rectangle =new Rectangle(2,3);
		System.out.println("넓이"+rectangle.width);
		System.out.println("높이"+rectangle.height);
		System.out.println("면적"+rectangle.getArea());

		

	}

}
