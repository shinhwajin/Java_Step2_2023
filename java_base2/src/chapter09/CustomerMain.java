package chapter09;

public class CustomerMain {

	public static void main(String[] args) {

		//VIP 고객
		System.out.println("--------------VIP--------------");
		int price=10000;
		VIPCustomer vipcs=new VIPCustomer(1004, "홍길동", 900);
		
		int vipprice=vipcs.calcPrice(price);
		System.out.println(vipcs.getCustomerName()+"님이 "+vipprice+"원을 지불 완료하였습니다.");
		System.out.println(vipcs.showCustomer());
		
		//일반고객
		System.out.println("--------------일반고객--------------");
		price=10000;
		Customer cs=new Customer(1005,"홍길순");
		int csprice=cs.calcPrice(price);
		System.out.println(cs.getCustomerName()+"님이 "+csprice+"원을 지불 완료하였습니다.");
		System.out.println(cs.showCustomer());
		
		System.out.println();
		Customer cs1=new Customer();
		cs1.setCustomerName("김창우");
		System.out.println(cs1.getCustomerName()+"님이 "+cs1.calcPrice(price)+"원을 지불 완료하였습니다.");
		System.out.println(cs1.showCustomer());

	}

}