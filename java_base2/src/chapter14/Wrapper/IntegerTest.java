package chapter14.Wrapper;

//wrapper
public class IntegerTest {

	public static void main(String[] args) {

		// Integer i = new Integer(100); //int i=100

		Integer num = 100; // 오토박싱 : 일반자료 => 클래스로 선언

		int iNum = num.intValue(); // 언박싱 : 클래스 => 일반자료

		int jNum = 200;

		int sum = iNum + jNum;
		System.out.println(sum);

		// 언박싱 (Integer=>int 로 자동변환)
		int total = num + jNum; // int total = num.intValue() + jNum; / num:클래스, jNum:일반자료
		System.out.println(total);

		// 오토박싱 (int=>Integer 로 자동변환)
		Integer i = jNum; // Integer i = Integer.valueOf(jNum);
		System.out.println(i);

	}

}