package chapter17.hashset;

import java.util.HashSet;
import java.util.Set;

import chapter17.Member;

public class MemberHashSetMain {

	public static void main(String[] args) {

		Set<Member> set = new HashSet<Member>();

		set.add(new Member(30, "ȫ�浿"));
		set.add(new Member(30, "ȫ�浿"));

		System.out.println("�� ��ü�� : " + set.size());

	}

}