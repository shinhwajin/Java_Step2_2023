package chapter08;

public class StaticFunction {

	String str1 = "�Ϲ� ȸ������";
	static String str2 = "static ȸ������";

	public static String getStatic() { // method �� ���� stack -> static ����� method�� data

		// static �޼ҵ�� static ������ ��� ����
		// str1="VIP";
		str2 = "VIP";

		return str2;

	}
	
}