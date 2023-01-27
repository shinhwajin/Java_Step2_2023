package chapter09;

public class ChildMain {

	public static void main(String[] args) {
		
		Child child=new Child();
		
		child.method1();  //부모님꺼
		child.method2();  //내꺼
		child.method3();  //내꺼
		
		System.out.println();
		CParent parent1=new CParent();
		parent1.method1();
		parent1.method2();
		//-------------------------------------------오버라이딩 우선?
		
		//독립적으로 부모클래스만 사용
		System.out.println();
		CParent parent2=child;  //1은 부모꺼, 2는 본인꺼
		parent2.method1();
		parent2.method2();
		

	}

}