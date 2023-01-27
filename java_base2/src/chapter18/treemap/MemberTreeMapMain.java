package chapter18.treemap;

import chapter17.treeset.Member3;

public class MemberTreeMapMain {

	public static void main(String[] args) {
		MemberTreeMap memTreeMap = new MemberTreeMap();

		// ���濡 ���� Member ������
		Member3 memberLee = new Member3(1003, "������");
		Member3 memberSon = new Member3(1005, "�չα�");
		Member3 memberPark = new Member3(1004, "�ڼ���");
		Member3 memberHong = new Member3(1002, "ȫ�浿");

		// ���濡 �ֱ�
		memTreeMap.addMember(memberLee);
		memTreeMap.addMember(memberSon);
		memTreeMap.addMember(memberPark);
		memTreeMap.addMember(memberHong);
		memTreeMap.addMember(new Member3(1001, "�̹���"));

		memTreeMap.showAllMember();

		memTreeMap.removeMember(1003);
		memTreeMap.showAllMember();

	}

}