package chapter09;

public class Student extends SPeople{
	
	public int studentNo;
	
	public Student(String name, String ssn, int studentNo) {
		super(name,ssn); // �����ε��� �θ�Ŭ������ �����ڸ� ȣ���Ͽ� �ʱ�ȭ��
		this.studentNo=studentNo;
		
		
	}

}