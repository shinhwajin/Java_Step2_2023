package chapter08;

public class StaticFunctionMain {

	public static void main(String[] args) {

		StaticFunction obj=new StaticFunction();
		System.out.println(obj.str2);
		System.out.println(obj.getStatic());
		
		String str;
		str=StaticFunction.getStatic();  //static은 객체 만들지 않아도 클래스명으로 사용 가능
		System.out.println(str);
		
		//StaticFuntion.  클래스명.-> string변수만 뜸 (str2)
		//obj. 객체명.-> 객체생성된 클래스 안 변수가 모두 뜸 (str1,str2)
		
		
		
	}

}