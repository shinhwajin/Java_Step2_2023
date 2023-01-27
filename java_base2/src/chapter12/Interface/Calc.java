package chapter12.Interface;

public interface Calc {
	
	double PI=3.14;
	int ERROR=-9999999;
	
	int add(int num1,int num2);
	int subtract(int num1,int num2);
	int times(int num1,int num2);
	int divide(int num1,int num2);
	
	default void description() {
		System.out.println("���� ���⸦ �����մϴ�.");
		myMethod();  // private method ȣ��
	}
	
	static int total(int[] arr) {
		int total=0;
		for(int i:arr) {
			total +=i;
		}
		myStaticMethod();
		return total;
	}
	
	private void myMethod() {
		System.out.println("private �޼ҵ��Դϴ�");
	}
	
	public static void myStaticMethod() {
		System.out.println("public static �޼ҵ��Դϴ�");
	}
	
	//�������̽� �������
	/*
	 - �߻�޼ҵ� : body�� ���� �޼ҵ�� ������ �������ؾ���
	 --�ڹ� 8���� ����--
	 - ����Ʈ�޼ҵ� : �⺻ ���๮�� ���� �� �ִ� �޼ҵ��̸� ������ ����
	 - ����(static) �żҵ� : ��ü ������ ������� ����Ÿ��(Ŭ������)���� ����� �� �ִ�
	 - private �޼ҵ� : �������̽��� ������ Ŭ�������� ��밡���ϰ� ������ X
	 				  ��, �������̽�(���� Ŭ����)������ ���� ����
	 */
	
	
	
}