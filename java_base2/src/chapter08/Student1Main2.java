package chapter08;

public class Student1Main2 {

	public static void main(String[] args) {

		Student1 studentLee = new Student1();
		studentLee.setStudentName("�����");
		studentLee.studentID = studentLee.serialNum;
		System.out.println("�̸� : "+studentLee.StudentName+
							"  ���̵� : "+studentLee.studentID);
		Student1.serialNum++;

		Student1 studentKim = new Student1();
		studentKim.setStudentName("��â��");
		studentKim.studentID = studentKim.serialNum;
		System.out.println("�̸� : "+studentKim.StudentName+
							"  ���̵� : "+studentKim.studentID);
		Student1.serialNum++;

		Student1 studentPark = new Student1();
		studentPark.setStudentName("��â��");
		studentPark.studentID = studentKim.serialNum;
		System.out.println("�̸� : "+studentPark.StudentName+
							"  ���̵� : "+studentPark.studentID);
		Student1.serialNum++;

	}

}