package chapter14.clone;

public class Circle implements Cloneable { // ��ü ������ ��

	CirPoint point;
	int radius;

	public Circle(int x, int y, int radius) {
		// �����ڸ� ���ؼ� �ٸ� Ŭ������ ��ü ����
		point = new CirPoint(x, y);
		this.radius = radius;
	}
	//Ŭ������ ��ü ����
	@Override
	protected Object clone() throws CloneNotSupportedException {
		// TODO Auto-generated method stub
		return super.clone();
	}

	@Override
	public String toString() { // Circle(��ü)�� �о��� �� �ּҰ� �ƴ϶� ������ �а� �������

		return "������ " + point + "�̰�, �������� " + radius + "�Դϴ�.";
	}

}