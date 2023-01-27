package chapter19.lambda;

interface PrintString {
	void showString(String str);
}

public class TestLambda {

	public static void main(String[] args) {

		// ���ٽ�
		PrintString lambdaStr = s -> System.out.println(s); // �Լ����� ���������� ��ü
		showMyString(lambdaStr);

		PrintString reStr = returnString(); // returnString() �ȿ� �ִ� ���ٽ� ������ ȣ��
		reStr.showString("hello");

	}

	public static void showMyString(PrintString p) { // �Ű����� ���� => p�� body
		p.showString("hello lambda");
	}

	public static PrintString returnString() { // ��ȯ������ body
		return s -> System.out.println(s + "world");
	}

}
