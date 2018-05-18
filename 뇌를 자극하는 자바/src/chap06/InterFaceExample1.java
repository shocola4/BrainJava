package chap06;



public class InterFaceExample1 {

	public static void main(String[] args) {
		//SeparateVolume obj1=new SeparateVolume("863?774개", "개미", "베르베르"); 
		Lendable obj = new SeparateVolume("863?774개", "개미", "베르베르"); 
	   //AppCDInfo obj2 = new AppCDInfo("2005-7001", "Redhat Fedira");
//		Lendable obj2 = new AppCDInfo("2005-7001", "Redhat Fedira");

	   //obj2.checkOut("박희경","20060317");
	   try {  obj.checkOut("김영숙","20060315");
		
	} catch (Exception e) {
		System.out.println(e.getMessage());
	}
	   
	  // obj.checkIn();
	   // obj1.checkIn();
	   obj.checkIn();
       //obj2.checkIn();

	}

}
