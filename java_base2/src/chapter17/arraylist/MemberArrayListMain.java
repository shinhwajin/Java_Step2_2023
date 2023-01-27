package chapter17.arraylist;

import chapter17.Member;

public class MemberArrayListMain {

	public static void main(String[] args) {

		MemberArrayList memberArrayList = new MemberArrayList();
		//팀원들의 정보
		Member memberShin = new Member(1001, "신화진");
		Member memberJeong = new Member(1002, "정하영");
		Member memberShin2 = new Member(1003, "신진혁");
		Member memberCho = new Member(1004, "조현수");
		Member memberLee = new Member(1005, "이진학");
		Member memberYoon = new Member(1006, "윤혜경");
		//회원가입          memberArrayList 는 실질적 어레이리스트 X, 클래스 객체일 뿐
		memberArrayList.addMember(memberShin);
		memberArrayList.addMember(memberJeong);
		memberArrayList.addMember(memberShin2);
		memberArrayList.addMember(memberCho);
		memberArrayList.addMember(memberLee);
		memberArrayList.addMember(memberYoon);
		
		memberArrayList.showAllMember();
		//삭제
		memberArrayList.removeMember(memberShin.getMemberId());
		
		memberArrayList.showAllMember();
		
	}

}
