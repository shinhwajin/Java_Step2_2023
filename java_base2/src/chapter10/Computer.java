package chapter10;

public class Computer extends Calculator {

	@Override
	double areaCircle(double r) {
		System.out.println("Computer �޼ҵ� areaCircle() ����");

		return Math.PI * r * r;
	}

}