package chapter11;

public class PhoneMain {

	public static void main(String[] args) {
		//Phone phone=new Phone();//(X) 추상클래스이기 때문에 오버로딩 없이는 안됨
		
		SmartPhone smartPhone=new SmartPhone("김유신");
		
		System.out.println(smartPhone.owner+"님");
		smartPhone.turnOn();
		smartPhone.intersearch();
		smartPhone.turnOff();
		
	}

}