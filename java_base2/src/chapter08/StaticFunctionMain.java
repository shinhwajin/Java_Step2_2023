package chapter08;

public class StaticFunctionMain {

	public static void main(String[] args) {

		StaticFunction obj=new StaticFunction();
		System.out.println(obj.str2);
		System.out.println(obj.getStatic());
		
		String str;
		str=StaticFunction.getStatic();  //static�� ��ü ������ �ʾƵ� Ŭ���������� ��� ����
		System.out.println(str);
		
		//StaticFuntion.  Ŭ������.-> string������ �� (str2)
		//obj. ��ü��.-> ��ü������ Ŭ���� �� ������ ��� �� (str1,str2)
		
		
		
	}

}