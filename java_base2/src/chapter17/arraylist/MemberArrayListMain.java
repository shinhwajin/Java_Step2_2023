package chapter17.arraylist;

import chapter17.Member;

public class MemberArrayListMain {

	public static void main(String[] args) {

		MemberArrayList memberArrayList = new MemberArrayList();
		//�������� ����
		Member memberShin = new Member(1001, "��ȭ��");
		Member memberJeong = new Member(1002, "���Ͽ�");
		Member memberShin2 = new Member(1003, "������");
		Member memberCho = new Member(1004, "������");
		Member memberLee = new Member(1005, "������");
		Member memberYoon = new Member(1006, "������");
		//ȸ������          memberArrayList �� ������ ��̸���Ʈ X, Ŭ���� ��ü�� ��
		memberArrayList.addMember(memberShin);
		memberArrayList.addMember(memberJeong);
		memberArrayList.addMember(memberShin2);
		memberArrayList.addMember(memberCho);
		memberArrayList.addMember(memberLee);
		memberArrayList.addMember(memberYoon);
		
		memberArrayList.showAllMember();
		//����
		memberArrayList.removeMember(memberShin.getMemberId());
		
		memberArrayList.showAllMember();
		
	}

}
