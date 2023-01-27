package chapter12.Interface;

public class SmartTelevisionMain {

	public static void main(String[] args) {

		SmartTelevision tv = new SmartTelevision();

		tv.turnOn();
		tv.setVolume(10);
		tv.turnOff();
		tv.search("www.naver.com");
		System.out.println("-------------------------");

		//SRemote Ŭ������ ���ǵǾ��ִ� �޼ҵ常 �������̵��� �޼ҵ� Ÿ��
		SRemote rc = tv;
		rc.turnOn();
		rc.setVolume(-7);
		// rc.search("www.naver.com"); search�� SRemote �ƴϰ� Searchable�� �־ ���� x
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