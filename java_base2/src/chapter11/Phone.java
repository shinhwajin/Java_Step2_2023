package chapter11;

public abstract class Phone {
	
	public String owner;
	
	//��� �� �θ��� �����ڸ� ����ؾ���
	public Phone(String owner) {
		this.owner=owner;
	}
	

	
	public void turnOn() {
		System.out.println("�� ������ �մϴ�");
	}
	public void turnOff() {
		System.out.println("�� ������ ���ϴ�");
	}
	
}