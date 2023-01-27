package chapter09;

public class IBerry extends IFruit {

	private String name;
	private String size;

	// 생성자

	public void Set2(String a, String b) {
		name = a;
		size = b;
	}

	// getter

	public void Disp2() {
		System.out.println("이름 : " + name);
		System.out.println("크기 : " + size);
	}

}