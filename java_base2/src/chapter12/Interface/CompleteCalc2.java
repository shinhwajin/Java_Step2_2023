package chapter12.Interface;

//상속받아서 times/divide 구현
public class CompleteCalc2 extends CompleteCalc1{

	@Override
	public int times(int num1, int num2) {
		return num1*num2;
	}

	@Override
	public int divide(int num1, int num2) {
		
	/*	try {
			return num1/num2;
		} catch (Exception e) {
			return Calc.ERROR;
		}
	*/	
		
		if(num2!=0) {
			return num1/num2;
		} else {
			return Calc.ERROR;
		}
	}

	public void showInfo() {
		System.out.println("Calc 인터페이스를 구현하였습니다.");
	}

	@Override
	public void description() {
		System.out.println("완벽한 계산기입니다.");
	}
	
	
}