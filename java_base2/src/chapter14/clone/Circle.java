package chapter14.clone;

public class Circle implements Cloneable { // 객체 복사할 때

	CirPoint point;
	int radius;

	public Circle(int x, int y, int radius) {
		// 생성자를 통해서 다른 클래스의 객체 생성
		point = new CirPoint(x, y);
		this.radius = radius;
	}
	//클래스의 객체 복사
	@Override
	protected Object clone() throws CloneNotSupportedException {
		// TODO Auto-generated method stub
		return super.clone();
	}

	@Override
	public String toString() { // Circle(객체)를 읽었을 때 주소가 아니라 내용을 읽게 만들어줌

		return "원점은 " + point + "이고, 반지름은 " + radius + "입니다.";
	}

}