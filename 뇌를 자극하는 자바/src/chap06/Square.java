package chap06;

public class Square extends Rectangle1 {
	Square(int sideLength){
		super(sideLength, sideLength);
		
		
	}
	int getSideLength() {
		return (getWidth() + getHeight())*2; 
	}

}
