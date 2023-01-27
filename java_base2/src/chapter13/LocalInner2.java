package chapter13;

class Outer {

	// �ܺ� Ŭ���� �������
	int outNum = 100;
	static int sNum = 200;

	// Runnable �Ű������� ��������� final�� ���ǵȴ�
	// Runnable Data������ ���� �͸��� Ŭ������� �Ѵ�
	Runnable getRunnable(int i) {
		int num = 100;

		class MyRunnable implements Runnable {
			int localNum = 10;  //���� Ŭ������ �������

			@Override
			public void run() {
				// num=200; //final
				// i=100; //final
				System.out.println("i=" + i);
				System.out.println("num=" + num);
				System.out.println("localNum=" + localNum);
				System.out.println("outNum=" + outNum + "(�ܺ�)");
				System.out.println("outer.sNum=" + Outer.sNum + "(�ܺ�Data����)");
			}// run
		}// Runnable

		return new MyRunnable();

	}// method
}// �ܺ� Ŭ����

public class LocalInner2 {

	public static void main(String[] args) {

		Outer out = new Outer();
		Runnable runner = out.getRunnable(10);
		runner.run();

	}

}