package chapter13;

class Outter2 {
	
	//���1
	//�͸��� Ŭ������ �ν��Ͻ� �̸��� ����
	Runnable getRunnable(int i) {
		
		int num=100;
		//new �� ���ÿ� �θ� Ŭ������ run�޼ҵ带 ��ӹ����Ƿ� �߻� �޼ҵ��� run�� �ݵ�� �������̵��ؼ� ����Ѵ�
		return new Runnable() {
			
			@Override
			public void run() {
				//num=200; runnable�� �������
				//i=10; final�̶� ������ x
				System.out.println(i);
				System.out.println(num);
				
			}
		}; //return
	}//Runnable
	
	//���2
	Runnable runner=new Runnable() {
		
		@Override
		public void run() {
			System.out.println("Runnable �� ������ �͸��� Ŭ���� ����");
		}
	};
	
	
}

public class AnonyMousInnerMain {

	public static void main(String[] args) {
		Outter2 out=new Outter2();
		Runnable runnable=out.getRunnable(10);
		runnable.run();  //���1
		out.runner.run();  //���2

	}

}