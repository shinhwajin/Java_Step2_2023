package chapter09;

public class CustomerMain {

	public static void main(String[] args) {

		//VIP ��
		System.out.println("--------------VIP--------------");
		int price=10000;
		VIPCustomer vipcs=new VIPCustomer(1004, "ȫ�浿", 900);
		
		int vipprice=vipcs.calcPrice(price);
		System.out.println(vipcs.getCustomerName()+"���� "+vipprice+"���� ���� �Ϸ��Ͽ����ϴ�.");
		System.out.println(vipcs.showCustomer());
		
		//�Ϲݰ�
		System.out.println("--------------�Ϲݰ�--------------");
		price=10000;
		Customer cs=new Customer(1005,"ȫ���");
		int csprice=cs.calcPrice(price);
		System.out.println(cs.getCustomerName()+"���� "+csprice+"���� ���� �Ϸ��Ͽ����ϴ�.");
		System.out.println(cs.showCustomer());
		
		System.out.println();
		Customer cs1=new Customer();
		cs1.setCustomerName("��â��");
		System.out.println(cs1.getCustomerName()+"���� "+cs1.calcPrice(price)+"���� ���� �Ϸ��Ͽ����ϴ�.");
		System.out.println(cs1.showCustomer());

	}

}