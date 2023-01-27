package chapter17.linkedlist;

import java.util.LinkedList;

public class LinkedListTest {

	public static void main(String[] args) {
		// Ư�� �ε������� ��ü�� �����ϰų� �߰��ϰ� �Ǹ� �ٷ� �յ� ��ũ�� ����
		// ����� ��ü ���� ������ �Ͼ�� �������� ArrayList���� ������ ����

		LinkedList<String> mylist = new LinkedList<String>();

		mylist.add("A");
		mylist.add("B");
		mylist.add("C");

		System.out.println(mylist);
		mylist.add(1, "D");

		System.out.println(mylist);

		mylist.addFirst("O");
		System.out.println(mylist);
		System.out.println(mylist.removeLast());

		mylist.addLast("G");
		System.out.println(mylist);

	}

}