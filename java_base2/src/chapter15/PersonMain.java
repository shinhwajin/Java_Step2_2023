package chapter15;

public class PersonMain {

	public static void main(String[] args) throws ClassNotFoundException {

		// 规过1
		Person person = new Person();
		Class pClass1 = person.getClass(); // Class: 努贰胶狼 沥焊

		System.out.println(pClass1.getName());

		// 规过2
		Class pClass2 = Person.class;
		System.out.println(pClass2.getName());

		// 规过3
		Class pClass3 = Class.forName("chapter15.Person");
		System.out.println(pClass3.getName());

	}

}