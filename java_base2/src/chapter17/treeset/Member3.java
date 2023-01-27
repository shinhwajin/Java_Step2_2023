package chapter17.treeset;

import java.util.Comparator;

public class Member3 implements Comparator<Member3> {
	
	private int memberId;
	private String memberName;
	
	public Member3() {
		// TODO Auto-generated constructor stub
	}
	
	public Member3(int memberId, String memberName) {
		this.memberId = memberId;
		this.memberName = memberName;
	}

	public int getMemberId() {
		return memberId;
	}

	public void setMemberId(int memberId) {
		this.memberId = memberId;
	}

	public String getMemberName() {
		return memberName;
	}

	public void setMemberName(String memberName) {
		this.memberName = memberName;
	}

	//������ ��
	@Override
	public int hashCode() {
		//memberName.hashCode() : String���� 10����
		//return super.hashCode();  //10���� �޸� �ּ�
		return memberName.hashCode()+memberId;
	}

	@Override
	public String toString() {
		
		return memberName +"ȸ������ ���̵�� "+memberId+"�Դϴ�.";
	}

	@Override
	public boolean equals(Object obj) {
		if(obj instanceof Member3) {
			Member3 member=(Member3) obj;
			if(this.memberId == member.memberId)
				return true;
		}
		return false;
	}

	@Override
	public int compare(Member3 member1, Member3 member2) {
		return (member1.memberId-member2.memberId);
	}

	
}