package chapter09;

//���
public class IStrawberry extends IBerry {

	private String color;
	private int price;

	public void Set3(String a, int b) {
		color = a;
		price = b;
	}

	// getter

	public void Disp3() {
		System.out.println("���� : " + color);
		System.out.println("���� : " + price);
	}

}