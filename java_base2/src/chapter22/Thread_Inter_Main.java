package chapter22;

public class Thread_Inter_Main implements Runnable {

	public static void main(String[] args) {
		System.out.println("���� Ŭ���� ����!");
		Thread_Inter_Main t1 = new Thread_Inter_Main();
		// t1.run();
		Thread mThread = new Thread(t1); // �Ϲ� Ŭ������ ��ü�� ������� ��ȯ
		mThread.start();
		System.out.println("���� Ŭ���� ����!");
	}

	@Override
	public void run() {
		System.out.println("run() �޼��� ����!");
		first();
	}

	public void first() {
		System.out.println("first() �޼��� ����!");
		second();
	}

	public void second() {
		System.out.println("second() �޼��� ����!");
	}

}
/*  //�Ϲ� �޼���(run()) ȣ��

	���� Ŭ���� ����!
	run() �޼��� ����!
	first() �޼��� ����!
	second() �޼��� ����!
	���� Ŭ���� ����!

	//������ȭ �� Ŭ����(start())�� ����
	
	���� Ŭ���� ����!
	���� Ŭ���� ����!
	run() �޼��� ����!
	first() �޼��� ����!
	second() �޼��� ����!
*/

