package chapter19.stream;

import java.util.ArrayList;
import java.util.List;

public class TravelTest {

	public static void main(String[] args) {
		// ����
		List<TravelCustomer> customerList = new ArrayList<TravelCustomer>();

		// ��ü ����
		TravelCustomer customer1 = new TravelCustomer("��ȭ��", 28, 10000);
		TravelCustomer customer2 = new TravelCustomer("���Ͽ�", 27, 20000);
		TravelCustomer customer3 = new TravelCustomer("������", 36, 30000);

		// �߰�
		customerList.add(customer1);
		customerList.add(customer2);
		customerList.add(customer3);

		System.out.println("==�� ��� �߰��� ������� ���==");
		// map : �����͸� Ư�����ǿ� �ش��ϴ� ������ ��ȯ����
		customerList.stream().map(c -> c.getName()).forEach(s -> System.out.print(s + " "));
		// mapToInt : int �� �ڷ�� ��ȯ
		int total = customerList.stream().mapToInt(c -> c.getPrice()).sum();
		System.out.println();
		System.out.println("�� ���� : " + total);
		// filter : Ư�� ���ǿ� �´� �����͸� �ɷ�����
		System.out.println("==20�� ���� �̸��� �����Ͽ� ���==");
		customerList.stream().filter(c -> c.getAge() < 30).
							  map(c -> c.getName()).sorted().
							  forEach(s -> System.out.print(s + " "));

	}

}
