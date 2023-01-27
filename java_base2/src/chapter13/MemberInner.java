package chapter13;

public class MemberInner {

	int a = 10;
	private int b = 100;
	static int c = 200; // Data영역 메모리

	// 생성자

	// 메소드

	// 내부 클래스
	class Inner {
		// 필드

		// 생성자

		// 메소드
		public void printData() {

			System.out.println("int a : " + a);
			System.out.println("private int b : " + b);
			System.out.println("static int c : " + c);

		}
	}

	public static void main(String[] args) {
		// 외부
		MemberInner outer = new MemberInner();
		// 내부
		// MemberInner.Inner inner= outer.new Inner();
		MemberInner.Inner inner = new MemberInner().new Inner();

		inner.printData();

	}

}