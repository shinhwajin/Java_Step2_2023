package chapter14.Wrapper;

//wrapper
public class IntegerTest {

	public static void main(String[] args) {

		// Integer i = new Integer(100); //int i=100

		Integer num = 100; // ����ڽ� : �Ϲ��ڷ� => Ŭ������ ����

		int iNum = num.intValue(); // ��ڽ� : Ŭ���� => �Ϲ��ڷ�

		int jNum = 200;

		int sum = iNum + jNum;
		System.out.println(sum);

		// ��ڽ� (Integer=>int �� �ڵ���ȯ)
		int total = num + jNum; // int total = num.intValue() + jNum; / num:Ŭ����, jNum:�Ϲ��ڷ�
		System.out.println(total);

		// ����ڽ� (int=>Integer �� �ڵ���ȯ)
		Integer i = jNum; // Integer i = Integer.valueOf(jNum);
		System.out.println(i);

	}

}