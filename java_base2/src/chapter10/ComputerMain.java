package chapter10;

public class ComputerMain {

	public static void main(String[] args) {
		int r = 10;

		Calculator cal = new Calculator();
		System.out.println(cal.areaCircle(r));

		Computer com = new Computer();
		System.out.println(com.areaCircle(r));

	}

}
