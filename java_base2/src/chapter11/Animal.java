package chapter11;

public abstract class Animal {
	
	public String kind;
	
	public void breathe() {
		System.out.println("���� ���ϴ�");
	}
	//�߻� �޼ҵ�
	public abstract void sound();
}