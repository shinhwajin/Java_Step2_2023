package chapter10;

import java.util.Scanner;

public class CalculatorExamMain {

	public static void main(String[] args) {

		// Main에서 실행하여 아래와 같은 결과가 나오면 성공
		// CalPlus : 30
		// CalMinus : 15

		CalPlus plus = new CalPlus();
		CalMinus minus = new CalMinus();

		System.out.println("CalPlus : " + plus.getResult(20, 10));
		System.out.println("CalMinus : " + minus.getResult(20, 5));

		
/*		Scanner s = new Scanner(System.in);
		CalculatorExam[] calculators = {new CalPlus(), new CalMinus()};
		
		System.out.print("정수 A를 입력하세요 : ");
		int a = s.nextInt();
		System.out.print("정수 B를 입력하세요 : ");
		int b = s.nextInt();
		
		//getClass().getSimpleName : 클래스명 가져오기
		for(CalculatorExam ce : calculators) {
			System.out.println(ce.getClass().getSimpleName() + " : " + ce.getResult(a, b));
		}	*/
	
		Scanner s = new Scanner(System.in);
		System.out.print("정수 A를 입력하세요 : ");
		int a = s.nextInt();
		System.out.print("정수 B를 입력하세요 : ");
		int b = s.nextInt();
		
		int p=calc(new CalPlus(),a,b); //CalculatorExam c1=new CalPlus()
		System.out.println("CalPlus : " + p);
		System.out.println("CalMinus : " + calc(new CalMinus(),a,b));

	}//main
	
	public static int calc(CalculatorExam c1, int a, int b) {
		return c1.getResult(a, b);
	}
	
}