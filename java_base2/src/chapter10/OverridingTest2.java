package chapter10;

import chapter09.Customer;
import chapter09.VIPCustomer;

public class OverridingTest2 {
	
	public static void main(String[] args) {
		
		//�θ�=�ڽ� (�ڵ�����ȯ)
		Customer vc=new VIPCustomer(10003, "��ġ", 20000);  //�θ� �ڽ� ��ġ�� ��Ӱ��� ǥ��
		System.out.println(vc.showCustomer());

	}

}