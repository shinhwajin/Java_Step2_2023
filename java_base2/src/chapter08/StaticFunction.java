package chapter08;

public class StaticFunction {

	String str1 = "일반 회원변수";
	static String str2 = "static 회원변수";

	public static String getStatic() { // method 는 보통 stack -> static 선언된 method는 data

		// static 메소드는 static 변수만 사용 가능
		// str1="VIP";
		str2 = "VIP";

		return str2;

	}
	
}