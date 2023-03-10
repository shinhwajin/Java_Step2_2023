package chapter08;

public class Company {
	
	// 객체를 단 하나만 생성하는 클래스
	private static Company instance = new Company();

	// 일반적인 객체 생성
	public Company() {
		// TODO Auto-generated constructor stub
	}

	// singleton 객체 생성 메소드(private 객체가 빠져나가는 메소드..?)
	public static Company getInstance() {
		
		// 예외처리(혹시 생성 안됐으면 생성하고 넘어가게끔)
		if (instance == null) {
			instance = new Company();
		}
		
		return instance;
	}
	
}