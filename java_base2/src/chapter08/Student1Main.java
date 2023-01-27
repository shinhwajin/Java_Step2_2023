package chapter08;

public class Student1Main {

	public static void main(String[] args) {

		Student1 studentLee = new Student1();
		studentLee.setStudentName("ÀÌÀç¹Î");
		System.out.println(studentLee.StudentName);
		System.out.println(Student1.getSerialNum());
		Student1.serialNum++;

		Student1 studentKim = new Student1();
		studentKim.setStudentName("±èÃ¢¿ì");
		System.out.println(studentKim.StudentName);
		System.out.println(studentKim.getSerialNum());
		Student1.serialNum++;

		Student1 studentPark = new Student1();
		studentPark.setStudentName("¹ÚÃ¢ÈÆ");
		System.out.println(studentPark.StudentName);
		System.out.println(Student1.getSerialNum());
		Student1.serialNum++;

		
	}

}