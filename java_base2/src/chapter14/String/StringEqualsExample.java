package chapter14.String;

public class StringEqualsExample {

	public static void main(String[] args) {

		String strVal1 = new String("홍길동");
		String strVal2 = "홍길동";

		if (strVal1 == strVal2) { // 외부
			System.out.println("같은 String 객체를 참조");
		} else {
			System.out.println("다른 String 객체를 참조");
		}

		if (strVal1.equals(strVal2)) { // 내부
			System.out.println("같은 문자열을 가짐");
		} else {
			System.out.println("다른 문자열을 가짐");
		}

	}

}