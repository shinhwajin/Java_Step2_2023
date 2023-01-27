package chapter09;

public class IFruit {

	private String sort;
	private String season;

	// 생성자

	public void Set1(String a, String b) {
		sort = a;
		season = b;
	}

	// getter

	public void Disp() {
		System.out.println("분류 : " + sort);
		System.out.println("계잘 : " + season);
	}

}