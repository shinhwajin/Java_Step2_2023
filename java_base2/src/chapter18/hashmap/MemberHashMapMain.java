package chapter18.hashmap;

import chapter17.Member2;

public class MemberHashMapMain {
	
	public static void main(String[] args) {
		MemberHashMap memHashMap = new MemberHashMap();
		
		//���濡 ���� Member ������
		Member2 memberLee=new Member2(1003, "������");
		Member2 memberSon=new Member2(1005, "�չα�");
		Member2 memberPark=new Member2(1004, "�ڼ���");
		Member2 memberHong=new Member2(1002, "ȫ�浿");
		
		//���濡 �ֱ�
		memHashMap.addMember(memberLee);
		memHashMap.addMember(memberSon);
		memHashMap.addMember(memberPark);
		memHashMap.addMember(memberHong);
		memHashMap.addMember(new Member2(1001,"�̹���"));
		memHashMap.addMember(new Member2(1001,"�ӹ���"));
		
		memHashMap.showAllMember();
		
		memHashMap.removeMember(1003);
		memHashMap.showAllMember();
		
	}

}