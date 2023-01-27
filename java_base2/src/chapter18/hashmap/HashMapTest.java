package chapter18.hashmap;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class HashMapTest {

	public static void main(String[] args) {

		Map<String, Integer> map = new HashMap<String, Integer>(); // �� ���ڰ� key. (String)

		map.put("��ġ", 85);
		map.put("ȫ�浿", 90);
		map.put("�ڼ�", 89);
		map.put("���屺", 75);
		System.out.println("�� Entry �� : " + map.size());

		// ��ü ã��
		System.out.println("\tȫ�浿 : " + map.get("ȫ�浿"));

		// ��ü Ű ��� �ޱ�
		Set<String> keySet = map.keySet();
		Iterator<String> keyIterator = keySet.iterator();

		while (keyIterator.hasNext()) {
			String key = keyIterator.next();
			Integer value = map.get(key);
			System.out.println("\t" + key + " : " + value); // Ű : ����
		}

		System.out.println();

		map.remove("ȫ�浿");
		System.out.println("�� Entry �� : " + map.size());

		Set<Map.Entry<String, Integer>> entrySet = map.entrySet();
		Iterator<Map.Entry<String, Integer>> entryInterator = entrySet.iterator();

		while (entryInterator.hasNext()) {
			Map.Entry<String, Integer> entry = entryInterator.next();
			String key = entry.getKey();
			Integer value = entry.getValue();
			System.out.println("\t" + key + " : " + value); // Ű : ����
		}

	}

}