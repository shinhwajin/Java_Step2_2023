package chapter08;

public class TGuide {

	static String point;
	TGuest[] guest;
	
	//������ �ʱ�ȭ
	public TGuide(int n) {
		point="�߸�";
		guest=new TGuest[n];
	
	//��ü ����
		for(int i=0;i<guest.length;i++) {
			guest[i]=new TGuest();
		}
		
		
	}
}