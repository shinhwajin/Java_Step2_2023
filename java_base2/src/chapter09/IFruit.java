package chapter09;

public class IFruit {

	private String sort;
	private String season;

	// ������

	public void Set1(String a, String b) {
		sort = a;
		season = b;
	}

	// getter

	public void Disp() {
		System.out.println("�з� : " + sort);
		System.out.println("���� : " + season);
	}

}