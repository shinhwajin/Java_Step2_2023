package chapter19.lambda;

public class TestAdd {

	public static void main(String[] args) {
		// Lambda : �޼ҵ��̸��� ����/ �Ű�����&�����θ� ����
		Add addF = (x, y) -> x + y;
//  �������̽��� �Լ���  ����

		System.out.println(addF.add(3, 5));

	}

}
