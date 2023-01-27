package chapter14.String;

import java.util.Date;

class Book {

	String title;
	String author;

	public Book(String title, String author) {
		this.title = title;
		this.author = author;
	}

	// String�� ���ڿ��� ������ִ� toString ������
	@Override
	public String toString() { // ��ü���� String���� ��°����ϰ� ����/
		return title + ", " + author;
	}

}

public class ToStringEx01 {

	public static void main(String[] args) {

		Book book = new Book("�ڹ�", "ȫ�浿");
		// ��ü�� heap �޸𸮸� ��� -> heap �޸𸮴� 16���� �ּҰ��� ����
		System.out.println(book); // toString ���س����� �ּ� ��µ�
		// System.out.println(book.toString()); //toString �޼ҵ� ���� ���ϰ� ���� ȣ��

		String str = new String("test");
		System.out.println(str);

	}

}