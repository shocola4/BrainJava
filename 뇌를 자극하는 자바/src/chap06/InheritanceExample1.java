package chap06;

class Account{
	String accountNo;
	String ownerName;
	int balance;
	
	public Account() {
		System.out.println("Account()기본생성자");
	}

	public Account(String accountNo,String ownerName ,int balance) {
		this.accountNo=accountNo;
		this.ownerName= ownerName;
		this.balance=balance;
		System.out.println("Account(String accountNo,String ownerName ,int balance)");
		
	}
	public int displayBalance() {
		return balance;
	}
	
    void deposit(int amount) {
	    balance+=amount;
}
	int withdraw(int amount) throws Exception{
		if(balance<amount)
			throw new Exception("잔액 부족합니다.");
		balance-=amount;
		return amount;
		}
}

class CheckingAccount extends Account{
	String cardNo;
	
/*	public CheckingAccount() {
		System.out.println("CheckingAccount()기본생성자");
	}*/
	
	public CheckingAccount(String accountNo,String ownerName ,int balance,String cardNo) {
		super(accountNo,ownerName,balance);//public Account(String accountNo,String ownerName ,int balance){}호출
		this.accountNo=accountNo;
		this.ownerName= ownerName;
		this.cardNo=cardNo;
		this.balance=balance;
		System.out.println("CheckingAccount(String accountNo,String ownerName ,int balance,String cardNo) 생성자");
	}
	
	int pay(String cardNo,int amount) throws Exception{
		if(!cardNo.equals(this.cardNo))
				throw new Exception("계좌가 틀립니다.");
		if(balance<amount)
			throw new Exception("pay(String cardNo,int amount)잔액이 부족합니다.");
        return withdraw(amount);      		
	
	}
}
public class InheritanceExample1 {

	public static void main(String[] args) {
		
		CheckingAccount obj = new CheckingAccount("111-22-33333333","홍길동",100000,"5555-6666-7777-8888");
		
/*		CheckingAccount obj=new CheckingAccount();//기본 생성자
*/	/*	obj.accountNo="111-22-33333333";
		obj.ownerName="홍길동";
		obj.cardNo="5555-6666-7777-8888";
		obj.deposit(100000);*/
		try {
			int paidAmount = obj.pay("5555-6666-7777-8888", 47000);
			System.out.println("지불액:"+paidAmount);
			System.out.println("잔액:"+obj.balance);
    	}
		catch (Exception e) {
			System.out.println(e.hashCode());
			System.out.println(e);
			String msg =e.getMessage();
			System.out.println("예외메세지"+msg);
		}

	}

}
