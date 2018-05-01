/**
 *2018. 5. 2. Dev By Kim HYUNAH
  
  ObjectExample1.java
 */

/**
 * @author Administrator
 *
 */
public class ObjectExample1 {

	public static void main(String[] args) {
		StringBuffer obj= new StringBuffer("Hey, Java");
		obj.deleteCharAt(1);
		obj.deleteCharAt(1);
		obj.insert(1,'i');
		System.out.println(obj);
		
		int length =obj.length();
		System.out.println("문자열"+obj+"의 길이는:"+length);
		//replace 메소드를 사용하여 Hi,java를 Hello,java로 치환해

		obj.replace(0,2 ,"Hello" );
		System.out.println(obj);
	
	
	}

}
