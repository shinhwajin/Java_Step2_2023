package chapter14.String;

public class StringEqualsExample {

	public static void main(String[] args) {

		String strVal1 = new String("ȫ�浿");
		String strVal2 = "ȫ�浿";

		if (strVal1 == strVal2) { // �ܺ�
			System.out.println("���� String ��ü�� ����");
		} else {
			System.out.println("�ٸ� String ��ü�� ����");
		}

		if (strVal1.equals(strVal2)) { // ����
			System.out.println("���� ���ڿ��� ����");
		} else {
			System.out.println("�ٸ� ���ڿ��� ����");
		}

	}

}