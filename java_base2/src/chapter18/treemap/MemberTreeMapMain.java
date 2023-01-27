package chapter18.treemap;

import chapter17.treeset.Member3;

public class MemberTreeMapMain {

	public static void main(String[] args) {
		MemberTreeMap memTreeMap = new MemberTreeMap();

		// 가방에 넣을 Member 데이터
		Member3 memberLee = new Member3(1003, "이지원");
		Member3 memberSon = new Member3(1005, "손민국");
		Member3 memberPark = new Member3(1004, "박서연");
		Member3 memberHong = new Member3(1002, "홍길동");

		// 가방에 넣기
		memTreeMap.addMember(memberLee);
		memTreeMap.addMember(memberSon);
		memTreeMap.addMember(memberPark);
		memTreeMap.addMember(memberHong);
		memTreeMap.addMember(new Member3(1001, "이민정"));

		memTreeMap.showAllMember();

		memTreeMap.removeMember(1003);
		memTreeMap.showAllMember();

	}

}