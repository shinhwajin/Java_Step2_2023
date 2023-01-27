package chapter08;

public class TGuide {

	static String point;
	TGuest[] guest;
	
	//积己磊 檬扁拳
	public TGuide(int n) {
		point="惯府";
		guest=new TGuest[n];
	
	//按眉 积己
		for(int i=0;i<guest.length;i++) {
			guest[i]=new TGuest();
		}
		
		
	}
}