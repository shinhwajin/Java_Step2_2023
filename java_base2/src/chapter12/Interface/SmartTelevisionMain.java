package chapter12.Interface;

public class SmartTelevisionMain {

	public static void main(String[] args) {

		SmartTelevision tv = new SmartTelevision();

		tv.turnOn();
		tv.setVolume(10);
		tv.turnOff();
		tv.search("www.naver.com");
		System.out.println("-------------------------");

		//SRemote 클래스에 정의되어있는 메소드만 오버라이딩된 메소드 타입
		SRemote rc = tv;
		rc.turnOn();
		rc.setVolume(-7);
		// rc.search("www.naver.com"); search는 SRemote 아니고 Searchable에 있어서 구현 x
		rc.turnOff();
		System.out.println("-------------------------");


		Searchable sc = tv;
		/*
		sc.turnOn();
		sc.setVolume(-7);
		sc.turnOff();
		*/
		sc.search("www.naver.com"); 
		
	}

}