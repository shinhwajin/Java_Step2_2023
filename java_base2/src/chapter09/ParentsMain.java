package chapter09;

public class ParentsMain {

	public static void main(String[] args) {

		PChildExam c1=new PChildExam();
		
		System.out.println(c1.getCar());
		System.out.println(c1.getMoney());  //상속받은 재산
		System.out.println("------------------");
		
		//------------------------------------------------
		if(c1 instanceof ParentExam) {
			System.out.println("c1은 ParentExam의 자식 클래스입니다.");
			System.out.println(c1.getMoney());
		}

		//==============================================
		//형변환
		PChildExam ch=new PChildExam();
		ParentExam p1=new ParentExam();
		System.out.println("------------------");
		//부모=자식
		p1=ch;  //자동형변환
		//System.out.println(p1.getCar()); p1은 car 없음
		System.out.println(p1.getMoney());
		System.out.println(p1.getStr());
		System.out.println("------------------");
		ch=(PChildExam)p1;  //명시적 형변환, ch=p1 안됨
		System.out.println(ch.getCar());
		System.out.println(ch.getMoney());
		System.out.println(ch.getStr());
		
	}

}