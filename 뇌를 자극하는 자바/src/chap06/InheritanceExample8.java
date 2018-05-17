package chap06;



public class InheritanceExample8 {

	public static void main(String[] args) {
		EMailSender obj1 =new EMailSender(	"생일을 축하합니다.", "고객센터 ", 	"admin@dukkeshop.co.kr"
				, "10% 할인쿠폰이 발행되었습니다.");
		SMSSender obj2=new SMSSender("생일을 축하합니다.", "고객센터 ","02-000-0000"
				, "10% 할인쿠폰이 발행되었습니다.");
		send(obj1,"hatman@yeye.com");
		send(obj1,"stickman@haha.com");
		send(obj2,"010-000-0000");

		

	}
	static void send(MessageSender obj,String recipient) {
		obj.sendMessage(recipient);
	}

}
