package chapter15;

public class StBufferMain2 {

	public static void main(String[] args) {

		String javaStr = new String("Java");
		// ó�� ������ �޸��� �ּ�
		System.out.println("javaStr�� ó�� ������ �޸� �ּ� : " + System.identityHashCode(javaStr));

		StringBuffer buffer = new StringBuffer(javaStr);
		System.out.println("���� �� buffer �޸� �ּ� : " + System.identityHashCode(buffer));

		buffer.append(" and ");
		buffer.append("JSP  ");
		buffer.append("programming is fun!!");
		System.out.println("���� �� buffer �޸� �ּ� : " + System.identityHashCode(buffer));

		System.out.println(buffer);

		// Type Error => toString
		javaStr = buffer.toString();
		System.out.println("���� ������� javaStr �޸� �ּ� : "+System.identityHashCode(javaStr));

		//StringBuffer �� ���� �Ŀ��� �ּ� �ٲ��� �ʴµ�, String�� Buffer.toString �ؼ� �� �� ������ �ּ� �ٲ�
		
	}

}