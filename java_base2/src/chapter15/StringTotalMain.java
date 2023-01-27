package chapter15;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.StringTokenizer;

public class StringTotalMain {

	public static void main(String[] args)
			throws ClassNotFoundException, InstantiationException, IllegalAccessException {

		Person person1 = new Person();
		System.out.println(person1);

		Class pClass = Class.forName("chapter15.Person");
		System.out.println(pClass);

		Person person2 = (Person) pClass.newInstance();
		System.out.println(person2);

		// =================================================
		System.out.println("=================================================");

		// String Ŭ������ ���� ��������
		Class strClass = Class.forName("java.lang.String");
		System.out.println(strClass);
		// String Ŭ������ �����ڵ� ����
		Constructor[] cons = strClass.getConstructors();
		for (Constructor c : cons) {
			System.out.println(c);
		}

		System.out.println("-------------------------------");
		Field[] field = strClass.getFields();
		for (Field f : field) {
			System.out.println(f);
		}

		System.out.println("-------------------------------");
		Method[] method = strClass.getMethods();
		for (Method m : method) {
			System.out.println(m);
		}

		// =================================================
		System.out.println("=================================================");
		String str = "Have,a,Nice,Day";

		// Tokenizer
		// StringTokenizer(1,2,3)
		// 1: ����� String ���ڿ�
		// 2: �и��ϴ� ����
		// 3: �ڸ��� ������ ǥ���Ұ��� ����
		StringTokenizer obj = new StringTokenizer(str, ",", false);

		while (obj.hasMoreTokens()) {
			String t = obj.nextToken();
			System.out.println(t);
		}

	}

}