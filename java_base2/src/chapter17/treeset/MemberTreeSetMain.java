package chapter17.treeset;

public class MemberTreeSetMain {
	
	public static void main(String[] args) {
		
		MemberTreeSet memberTreeSet = new MemberTreeSet();
		
		Member3 memberPark = new Member3(1003, "¹Ú¼­ÈÍ");
		Member3 memberLee = new Member3(1001, "ÀÌÁö¿ø");
		Member3 memberSon = new Member3(1002, "¼Õ¹Î±¹");
		
		memberTreeSet.addMember(memberLee);
		memberTreeSet.addMember(memberSon);
		memberTreeSet.addMember(memberPark);
		
		memberTreeSet.showAllMember();
		
	}

}