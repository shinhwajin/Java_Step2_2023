package chapter17.hashset;

import chapter17.Member2;

public class MemberHashSetTest {

	public static void main(String[] args) {

		MemberHashSet memberHashSet = new MemberHashSet();

		// �������� ����
		Member2 memberLee = new Member2(1001, "������");
		Member2 memberSon = new Member2(1002, "�չα�");
		Member2 memberPark = new Member2(1003, "�ڽ���");
		Member2 memberHong = new Member2(1004, "ȫ�浿");
		// ȸ������
		memberHashSet.addMember(memberLee);
		memberHashSet.addMember(memberSon);
		memberHashSet.addMember(memberPark);
		memberHashSet.addMember(memberHong);

		memberHashSet.showAllMember();
		// ���1
		// Member2 memberKim=new Member2(1003, "�ڽ���");
		// ���2

		Member2 memberKim = new Member2(1003, "������");
		memberHashSet.addMember(memberKim);
		memberHashSet.showAllMember();

	}

}