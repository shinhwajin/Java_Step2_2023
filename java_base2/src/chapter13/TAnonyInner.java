package chapter13;

public class TAnonyInner {

	public void test() {

		new TestInter() { // TestInter ti = new TestInter(); => ti.printData();
			@Override
			public void printData() {
				System.out.println("화요팅!");
			}// 추상메소드 구현
		}.printData();
	}// 메소드 끝

	public static void main(String[] args) {

		TAnonyInner in = new TAnonyInner();
		in.test();

	}

}