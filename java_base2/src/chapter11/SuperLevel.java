package chapter11;

public class SuperLevel extends PlayLevel{

	@Override
	public void run() {
		System.out.println("�ſ� ���� �޸��ϴ�");
	}

	@Override
	public void jump() {
		System.out.println("���� ���� jump�� �մϴ�");
	}

	@Override
	public void turn() {
		System.out.println("�� ���� ���ϴ�");
	}

	@Override
	public void showLevelMessage() {
		System.out.println("*****����� �Դϴ�*****");		
	}

}