package chapter09;

public class ParentsMain {

	public static void main(String[] args) {

		PChildExam c1=new PChildExam();
		
		System.out.println(c1.getCar());
		System.out.println(c1.getMoney());  //��ӹ��� ���
		System.out.println("------------------");
		
		//------------------------------------------------
		if(c1 instanceof ParentExam) {
			System.out.println("c1�� ParentExam�� �ڽ� Ŭ�����Դϴ�.");
			System.out.println(c1.getMoney());
		}

		//==============================================
		//����ȯ
		PChildExam ch=new PChildExam();
		ParentExam p1=new ParentExam();
		System.out.println("------------------");
		//�θ�=�ڽ�
		p1=ch;  //�ڵ�����ȯ
		//System.out.println(p1.getCar()); p1�� car ����
		System.out.println(p1.getMoney());
		System.out.println(p1.getStr());
		System.out.println("------------------");
		ch=(PChildExam)p1;  //����� ����ȯ, ch=p1 �ȵ�
		System.out.println(ch.getCar());
		System.out.println(ch.getMoney());
		System.out.println(ch.getStr());
		
	}

}