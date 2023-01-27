package chapter19.lambda;

public class TestAdd {

	public static void main(String[] args) {
		// Lambda : 메소드이름이 없음/ 매개변수&구현부만 존재
		Add addF = (x, y) -> x + y;
//  인터페이스명 함수명  내용

		System.out.println(addF.add(3, 5));

	}

}
