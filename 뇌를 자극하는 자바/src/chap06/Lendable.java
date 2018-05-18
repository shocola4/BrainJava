package chap06;

public interface Lendable {
	
	//상수필드
	final static byte STATE_BORROWED=1;//대출중(대출불가)
	             byte STATE_NOMAL=0;//대출가능

	//추상메소드
	abstract void checkOut(String borrower,String date)throws Exception;//대출하는 기능
	abstract void checkIn();//반납하는 기능
}
