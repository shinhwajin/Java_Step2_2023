package chapter14.clone;

public class CirPoint {

	int x;
	int y;

	public CirPoint(int x, int y) {
		this.x = x;
		this.y = y;
	}

	@Override
	public String toString() { // point(객체)를 읽었을 때 주소가 아니라 내용을 읽게 만들어줌

		return "x = " + x + ", y = " + y;
	}

}