package chapter14.String;

public class Example_objectMain {

	public static void main(String[] args) {
		
		Example_object v1=new Example_object();
		v1.setValue("Test");  //String������ �̹� Object�� ��ӵǾ� �����Ƿ� �ڵ� ����ȯ�� �̷����
		
		System.out.println(v1.getValue());
		
		//����(int)�� ���ڰ��� ����
		Example_object v2=new Example_object();
		v2.setValue(100);  // AutoBoxing �⺻�ڷ��� int => ��ü(Object)
		System.out.println(v2.getValue());

		int i=(int)v2.getValue(); //unBoxing
		System.out.println(i+2);
		
		
	}

}