package chapter08;

public class Student2Main {

	public static void main(String[] args) {

		Student2 studentLee=new Student2();
		studentLee.setStudentName("�����");
		System.out.println("�̸� : "+studentLee.StudentName +
							"  ���̵� : "+studentLee.studentID);
		
		Student2 studentKim=new Student2();
		studentKim.setStudentName("��â��");
		System.out.println("�̸� : "+studentKim.StudentName +
							"  ���̵� : "+studentKim.studentID);
		
		Student2 studentPark=new Student2();
		studentPark.setStudentName("��â��");
		System.out.println("�̸� : "+studentPark.StudentName +
							"  ���̵� : "+studentPark.studentID);
		
	}

}