package chapter14.String;

import java.util.Date;

class Book {

	String title;
	String author;

	public Book(String title, String author) {
		this.title = title;
		this.author = author;
	}

	// String의 문자열로 출력해주는 toString 재정의
	@Override
	public String toString() { // 객체값을 String으로 출력가능하게 해줌/
		return title + ", " + author;
	}

}

public class ToStringEx01 {

	public static void main(String[] args) {

		Book book = new Book("자바", "홍길동");
		// 객체는 heap 메모리를 사용 -> heap 메모리는 16진수 주소값을 가짐
		System.out.println(book); // toString 안해놨으면 주소 출력됨
		// System.out.println(book.toString()); //toString 메소드 구현 안하고 직접 호출

		String str = new String("test");
		System.out.println(str);

	}

}