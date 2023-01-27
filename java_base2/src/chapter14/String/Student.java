package chapter14.String;

public class Student {

	int studentID;
	String studentName;

	// 생성자
	public Student(int studentID, String studentName) {
		this.studentID = studentID;
		this.studentName = studentName;
	}

	@Override
	public String toString() {
		return studentID + ", " + studentName;
	}

	// 물리적 주소
	public int hashCode() {
		return studentID;
	}               //hashCode를 비교해볼 때 studentID값 비교해보게끔

	@Override
	public boolean equals(Object obj) {

		if (obj instanceof Student) {
			Student std = (Student) obj;
			if (studentID == std.studentID) // 비교판단
				return true;
			else
				return false;
		}

		return false;
	}

}