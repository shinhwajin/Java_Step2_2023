package chapter18.hashmap;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class HashMapTest2 {

	public static void main(String[] args) {
		// Map<String integer>생성 map
		Map<String, Integer> map = new HashMap<String, Integer>();

		// 팀원 데이터(성함, 학번) 저장
		map.put("신화진", 1);
		map.put("정하영", 2);
		map.put("신진혁", 3);
		map.put("조현수", 4);
		map.put("이진학", 5);
		map.put("윤혜경", 6);

		// 팀원의 인원
		System.out.println("팀원은 " + map.size() + "명");

		// 팀장의 학번을 알아내자
		System.out.println("팀장의 학번은 " + map.get("조현수"));

		// 팀원 모두의 학번 출력
		Set<String> keyset = map.keySet();
		Iterator<String> keyIterator = keyset.iterator();

		while (keyIterator.hasNext()) {
			String name = keyIterator.next();
			Integer stdId = map.get(name);
			System.out.println("이름 : " + name + " 학번 : " + stdId);
		}

	}

}