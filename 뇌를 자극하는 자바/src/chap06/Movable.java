package chap06;

public interface Movable {
	void moveTo(int x,int y);//절대위치로 이동한다.
	void moveBy(int xOffset,int yOffset);//상태 위치만큼 이동한다.

}
