package chapter11;
//�� �ϳ��� �߻� �޼ҵ尡 �����ϸ� �ݵ�� abstract�� �߰��Ѵ�
//�߻�Ŭ����
public abstract class Computer {
	
	//�߻� �޼ҵ� : Body�� ����
	public abstract void display();  //���� Ŭ���� �����ؼ� ����϶�� �ǹ�
	public abstract void typing();
	
	//�Ϲ� �޼ҵ�
	public void turnOn() {
		System.out.println("������ �մϴ�");
	}
	public void turnOff() {
		System.out.println("������ ���ϴ�");
	}
	
}