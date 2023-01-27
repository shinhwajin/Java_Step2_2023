package chapter14.String;

public class EqualsTest {

	public static void main(String[] args) {
		// String 클래스는 이미 toString으로 재정의되어있음
		String str1 = new String("test");
		String str2 = new String("test");

		Student studentLee = new Student(100, "이상우");
		Student studentLee2 = studentLee; // 그대로 assign하는건 주소 자체를 넘김 -> 내용도 같음
		Student studentSang = new Student(100, "이상우");  // 논리적 값은 같은데, 서로 다른거

		// 동일한 주소의 두 인스턴스 비교 (물리적 주소는 다르지만 논리적 값이 동일)
		System.out.println("----동일한 주소의 두 인스턴스 비교----");
		if (studentLee == studentLee2)
			System.out.println("studentLee와 studentLee2의 물리적 주소는 같습니다.");
		else
			System.out.println("studentLee와 studentLee2의 물리적 주소는 다릅니다.");

		if (studentLee.equals(studentLee2))
			System.out.println("studentLee와 studentLee2의 논리적 값은 동일합니다.");
		else
			System.out.println("studentLee와 studentLee2의 논리적 값은 동일하지 않습니다.");
		System.out.println();
		
		
		// 물리적 주소는 다르지만 논리적 값이 동일
		System.out.println("----물리적 주소(==)는 다르지만 논리적 값(equals)이 동일----");
		if (studentLee == studentSang)
			System.out.println("studentLee와 studentSang의 물리적 주소는 같습니다.");
		else
			System.out.println("studentLee와 studentSang의 물리적 주소는 다릅니다.");
		if (studentLee.equals(studentSang))
			System.out.println("studentLee와 studentSang의 논리적 값은 동일합니다.");
		else
			System.out.println("studentLee와 studentSang의 논리적 값은 동일하지 않습니다.");
		System.out.println();	
		
		System.out.println("------------데이터 값 출력------------");
		System.out.println("studentLee의 hashCode : "+studentLee.hashCode());
		System.out.println("studentSang의 hashCode : "+studentSang.hashCode());  //Student class에서 hashCode() studentID 반환하게 해놓음
		System.out.println();
		
		System.out.println("------------데이터 값은 같으나 hash값이 다르므로 재정의가 필요------------");
		System.out.println("studentLee의 실제 주소값 : "+System.identityHashCode(studentLee));
		System.out.println("studentSang의 실제 주소값 : "+System.identityHashCode(studentSang));
		System.out.println();
		
		//HashCode가 재정의 되어있음
		System.out.println("---------String클래스의 실제값 출력---------");
		System.out.println("str1의 hashCode : "+str1.hashCode());
		System.out.println("str2의 hashCode : "+str2.hashCode());
		
	}

}