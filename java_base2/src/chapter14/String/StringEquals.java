package chapter14.String;

public class StringEquals {

	public static void main(String[] args) {
		
		String str1=new String("test");
		String str2=new String("test");
		
		System.out.println(str1==str2); //heap �޸𸮰� ������ ��ȯ
		System.out.println(str1.equals(str2)); //heap �޸𸮰� ������ ��ȯ
		System.out.println();
		//���Ǯ
		String str3="abc";
		String str4="abc";
		System.out.println(str3==str4);
		System.out.println(str3.equals(str4));
		System.out.println();
		//Boxing : �⺻ Ÿ�԰��� �����ؼ� ��ü�� ������
		Integer i1=new Integer(100);
		Integer i2=new Integer(100);
		
		System.out.println(i1==i2);//heap �޸�
		System.out.println(i1.equals(i2));
		
	}

}