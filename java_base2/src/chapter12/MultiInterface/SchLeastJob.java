package chapter12.MultiInterface;

public class SchLeastJob implements Scheduler {

	@Override
	public void getNextCall() {
		System.out.println("��� ��ȭ�� ������� ��⿭���� �����ɴϴ�.");
	}

	@Override
	public void sendCallToAgent() {
		System.out.println("���� �������� ���ų� ����� �ð��� ���� ���� �������� ����մϴ�.");
	}

}