package chapter19.stream;

import java.util.ArrayList;
import java.util.List;

public class TravelTest {

	public static void main(String[] args) {
		// 가방
		List<TravelCustomer> customerList = new ArrayList<TravelCustomer>();

		// 객체 생성
		TravelCustomer customer1 = new TravelCustomer("신화진", 28, 10000);
		TravelCustomer customer2 = new TravelCustomer("정하영", 27, 20000);
		TravelCustomer customer3 = new TravelCustomer("신진혁", 36, 30000);

		// 추가
		customerList.add(customer1);
		customerList.add(customer2);
		customerList.add(customer3);

		System.out.println("==고객 명단 추가된 순서대로 출력==");
		// map : 데이터를 특정조건에 해당하는 값으로 변환해줌
		customerList.stream().map(c -> c.getName()).forEach(s -> System.out.print(s + " "));
		// mapToInt : int 형 자료로 변환
		int total = customerList.stream().mapToInt(c -> c.getPrice()).sum();
		System.out.println();
		System.out.println("총 수입 : " + total);
		// filter : 특정 조건에 맞는 데이터만 걸러낸다
		System.out.println("==20대 고객의 이름을 정렬하여 출력==");
		customerList.stream().filter(c -> c.getAge() < 30).
							  map(c -> c.getName()).sorted().
							  forEach(s -> System.out.print(s + " "));

	}

}
