package chapter13;

public class TAnonyInner {

	public void test() {

		new TestInter() { // TestInter ti = new TestInter(); => ti.printData();
			@Override
			public void printData() {
				System.out.println("ȭ����!");
			}// �߻�޼ҵ� ����
		}.printData();
	}// �޼ҵ� ��

	public static void main(String[] args) {

		TAnonyInner in = new TAnonyInner();
		in.test();

	}

}