package chapter14.clone;

public class CirPoint {

	int x;
	int y;

	public CirPoint(int x, int y) {
		this.x = x;
		this.y = y;
	}

	@Override
	public String toString() { // point(��ü)�� �о��� �� �ּҰ� �ƴ϶� ������ �а� �������

		return "x = " + x + ", y = " + y;
	}

}