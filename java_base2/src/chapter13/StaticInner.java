package chapter13;

public class StaticInner {

	int a = 10;
	private int b = 100;
	static int c = 200; // Data영역 메모리

	// 생성자

	// 메소드

	// 내부 클래스
	static class Inner {
		// 필드
		static int d = 1000;

		// 생성자

		// 메소드
		public void printData() {
			// a와 b는 static이 아니어서 데이터영역에 사용할 수 없음
			// System.out.println("int a : "+a);
			// System.out.println("private int b : "+b);
			System.out.println("static int c : " + c);
			System.out.println("static int d : " + d);
		}
	}

	public static void main(String[] args) {
		Inner inner = new Inner();
		inner.printData();

		StaticInner outer = new StaticInner();
	}

}