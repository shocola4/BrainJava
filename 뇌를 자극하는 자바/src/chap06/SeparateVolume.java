package chap06;

public class SeparateVolume implements Lendable {
	String requestNo;//청구번호
	String bookTitle;//제목
	String writer;//저자
	String borrower;
	String checkOutDate;//대출일
	byte state;//대출상태
	

	public SeparateVolume(String requestNo, String bookTitle, String writer) {
		//super();//Object();
		System.out.println(" SeparateVolume(String requestNo, String bookTitle, String writer)");
		this.requestNo = requestNo;
		this.bookTitle=bookTitle;
		this.writer=writer;
	}

	

	@Override
	public void checkOut(String borrower, String date) {
		System.out.println("checkOut(String borrower, String date)");
		if(state==STATE_BORROWED)
			return;
		//if(state!=0)//state 0이 아닐 때
		//	return;// 종료
		this.borrower=borrower;
		this.checkOutDate=date;
		//this.state=1;//대출시 1로 생성
		this.state=STATE_BORROWED;
	
		System.out.println("*"+bookTitle+"CD가 대출되었습니다.");
		System.out.println("대출인:"+borrower);
		System.out.println("대출일:"+date+"\n");
		
	}

	@Override
	public void checkIn() {
		this.borrower=null;
		this.checkOutDate=null;
		this.state=0;//반납시 0으로 셋팅
		System.out.println("*"+bookTitle+"이(가) 반납되었습니다.\n");
		
	}
	
	

}
