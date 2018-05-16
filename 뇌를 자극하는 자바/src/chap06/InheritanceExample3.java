package chap06;

class CreditLineAccount extends Account{
	int creditLine;
	//int balance;//0
	CreditLineAccount(String accountNo,String ownerName ,int balance,int creditLine){
		super(accountNo,ownerName,balance);
		this.creditLine=creditLine;
		System.out.println("CreditLineAccount(String accountNo,String ownerName ,int balance,int creditLine)");
	}
	
	public int displayCreditLine() {
		return creditLine;
	}
	
	int withdraw(int amount) throws Exception{
		if((balance+creditLine)<amount)
			throw new Exception("마이너스 한도액이 불가능합니다.");
		balance-=amount;
		return amount;
		}
}

public class InheritanceExample3 {

	public static void main(String[] args) {
		CreditLineAccount obj = new CreditLineAccount("000-11-111111","김선달",10000,20000000);		
	
	try {
		int balance= obj.displayBalance();
		System.out.println("잔액:"+balance);
		//System.out.println("잔액:"+obj.balance);
		int amount = obj.withdraw( 50000);
		System.out.println("인출액:"+amount);
		balance= obj.displayBalance();
		System.out.println("잔액:"+balance);
		int creditLine= obj.displayCreditLine();
		System.out.println("마이스너스 한도:"+obj.creditLine);

	}
	catch (Exception e) {
	
		System.out.println(e.getMessage());
	
	  }
   }

}
