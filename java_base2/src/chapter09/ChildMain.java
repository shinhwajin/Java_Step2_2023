package chapter09;

public class ChildMain {

	public static void main(String[] args) {
		
		Child child=new Child();
		
		child.method1();  //�θ�Բ�
		child.method2();  //����
		child.method3();  //����
		
		System.out.println();
		CParent parent1=new CParent();
		parent1.method1();
		parent1.method2();
		//-------------------------------------------�������̵� �켱?
		
		//���������� �θ�Ŭ������ ���
		System.out.println();
		CParent parent2=child;  //1�� �θ�, 2�� ���β�
		parent2.method1();
		parent2.method2();
		

	}

}