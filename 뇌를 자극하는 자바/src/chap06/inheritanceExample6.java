package chap06;

//import java.lang.*;
 abstract class MessageSender{
 String title;
 String senderName;
	
	
	public MessageSender(String title, String senderName) {
		//super();
		this.title = title;
		this.senderName = senderName;
	}

	abstract void sendMessage(String recipient);
	
}
class EMailSender extends MessageSender{
	 String senderAddr;
	 String emailBody;
	 
	 EMailSender(String title, String senderName, String senderAddr, String emailBody) {
		super(title, senderName);
		this.senderAddr = senderAddr;
		this.emailBody = emailBody;
	}
	@Override
	void sendMessage(String recipient) {
		System.out.println("------------------------------");
		System.out.println("제목:"+title);
		System.out.println("보내는 사람:"+senderName+""+senderAddr);
		System.out.println("받는 사람:"+recipient);
		System.out.println("내용:"+emailBody);
	
	}
}	
class SMSSender extends MessageSender{
	 String returnPhoneNO;
	 String message;
	 
	 SMSSender(String title, String senderName,  String returnPhoneNO, String message) {
		super(title, senderName);
		this.returnPhoneNO = returnPhoneNO;
		this.message = message;
	}
	@Override
	void sendMessage(String recipient) {
		System.out.println("------------------------------");
		System.out.println("제목:"+title);
		System.out.println("보내는 사람:"+senderName);
		System.out.println("전화번호:"+recipient);
		System.out.println("회신 전화번호:"+returnPhoneNO);
		System.out.println("메세지 내용:"+message);
	
	}
}	
public class inheritanceExample6 {

	public static void main(String[] args) {

//		EMailSender emailSender =new EMailSender(	"생일을 축하합니다.", "고객센터 ", 	"admin@dukkeshop.co.kr"
//, 	"10% 할인쿠폰이 발행되었습니다.");
//		emailSender.sendMessage("hatman@yeye.com");
//		emailSender.sendMessage("stickman@haha.com");

		MessageSender messageSender =new EMailSender(	"생일을 축하합니다.", "고객센터 ", 	"admin@dukkeshop.co.kr"
		, "10% 할인쿠폰이 발행되었습니다.");
		messageSender.sendMessage("masiro7@naver.com");
		
	}

}
