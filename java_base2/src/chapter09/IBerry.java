package chapter09;

public class IBerry extends IFruit {

	private String name;
	private String size;

	// ������

	public void Set2(String a, String b) {
		name = a;
		size = b;
	}

	// getter

	public void Disp2() {
		System.out.println("�̸� : " + name);
		System.out.println("ũ�� : " + size);
	}

}