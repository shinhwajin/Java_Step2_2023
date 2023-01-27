package chapter08;

public class Company {
	
	// ��ü�� �� �ϳ��� �����ϴ� Ŭ����
	private static Company instance = new Company();

	// �Ϲ����� ��ü ����
	public Company() {
		// TODO Auto-generated constructor stub
	}

	// singleton ��ü ���� �޼ҵ�(private ��ü�� ���������� �޼ҵ�..?)
	public static Company getInstance() {
		
		// ����ó��(Ȥ�� ���� �ȵ����� �����ϰ� �Ѿ�Բ�)
		if (instance == null) {
			instance = new Company();
		}
		
		return instance;
	}
	
}