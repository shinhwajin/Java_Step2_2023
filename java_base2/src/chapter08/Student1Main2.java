package chapter08;

public class Student1Main2 {

	public static void main(String[] args) {

		Student1 studentLee = new Student1();
		studentLee.setStudentName("이재민");
		studentLee.studentID = studentLee.serialNum;
		System.out.println("이름 : "+studentLee.StudentName+
							"  아이디 : "+studentLee.studentID);
		Student1.serialNum++;

		Student1 studentKim = new Student1();
		studentKim.setStudentName("김창우");
		studentKim.studentID = studentKim.serialNum;
		System.out.println("이름 : "+studentKim.StudentName+
							"  아이디 : "+studentKim.studentID);
		Student1.serialNum++;

		Student1 studentPark = new Student1();
		studentPark.setStudentName("박창훈");
		studentPark.studentID = studentKim.serialNum;
		System.out.println("이름 : "+studentPark.StudentName+
							"  아이디 : "+studentPark.studentID);
		Student1.serialNum++;

	}

}