package chapter12.Interface;

//상속받아서 add/subtract 구현
public abstract class CompleteCalc1 implements Calc{

	@Override
	public int add(int num1, int num2) {
		return num1+num2;
	}

	@Override
	public int subtract(int num1, int num2) {
		return num1-num2;
	}

}