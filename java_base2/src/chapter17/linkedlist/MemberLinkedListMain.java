package chapter17.linkedlist;

import chapter17.Member;

public class MemberLinkedListMain {

	public static void main(String[] args) {

		MemberLinkedList memberLinkedList = new MemberLinkedList();

		// �������� ����
		Member memberLee = new Member(1001, "������");
		Member memberSon = new Member(1002, "�չα�");
		Member memberPark = new Member(1003, "�ڽ���");
		Member memberHong = new Member(1004, "ȫ�浿");
		// ȸ������
		memberLinkedList.addMember(memberLee);
		memberLinkedList.addMember(memberSon);
		memberLinkedList.addMember(memberPark);
		memberLinkedList.addMember(memberHong);

		memberLinkedList.showAllMember();

		Member memberKim = new Member(1003, "�輭��");
		memberLinkedList.addMember(memberKim);

		memberLinkedList.showAllMember();

	}

}