package chapter17.linkedlist;

import java.util.Iterator;
import java.util.LinkedList;

import chapter17.Member;

public class MemberLinkedList {

	private LinkedList<Member> linkedList;

	// �����ڸ� ���� LinkedList ��ü ����

	public MemberLinkedList() {
		linkedList = new LinkedList<Member>(); // Member ���� �� linkedlist �������?
	}

	// addMember
	public void addMember(Member member) {
		linkedList.add(member);
	}

	// removeMember
	public boolean removeMember(int memberId) {
		Iterator<Member> ir = linkedList.iterator();

		while (ir.hasNext()) {
			Member member = ir.next();
			int tempId = member.getMemberId();
			if (tempId == memberId) {
				linkedList.remove(member);
				return true;
			}
		}
		System.out.println(memberId + "�� �������� �ʽ��ϴ�.");
		return false;
	}

	// showAll
	public void showAllMember() {
		for (Member member : linkedList) {
			System.out.println(member);
		}
		System.out.println();
	}

}