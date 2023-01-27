package chapter22;

public class ThreadEx02_Main {
	
	public static void main(String[] args) {
		
		ThreadEx02 t1 = new ThreadEx02(); // 1~10까지의 요소가 temp 변수방에 초기화됨
		
		t1.start();//start()메소드를 수행하면 내부에 run 메소드가 수행된다
		//temp는 temp대로 1초에 하나씩 출력, main 프로그램 종료는 2초 뒤 출력 (개별적으로)
		
		try {
			Thread.sleep(2000); //2초 대기
			System.out.println("프로그램 종료");
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		
		
	}

}
