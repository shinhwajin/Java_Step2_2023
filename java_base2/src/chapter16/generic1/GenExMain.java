package chapter16.generic1;

public class GenExMain {

	public static void main(String[] args) {
		// ����ڰ� ���ϴ� ���·� ��ü ����
		GenEx<String> v1=new GenEx<String>();
		v1.setValue("100");
		System.out.println(v1.getValue());
		
		//����, �Ǽ�, ����
		//���׸� Ÿ���� ��ü�� �⺻�ڷ���(int,double, char)�� �ν��� �� ����
		//�׷��Ƿ� ����ڽ��Ͽ� ���
		GenEx<Integer> v2=new GenEx<Integer>();
		v2.setValue(12345);
		System.out.println(v2.getValue());
		
		GenEx<Double> v3=new GenEx<Double>();
		v3.setValue(6.789);
		System.out.println(v3.getValue());
		
		GenEx<Character> v4=new GenEx<Character>();
		v4.setValue('a');
		System.out.println(v4.getValue());

	}

}