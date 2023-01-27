package chapter18.hashmap;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class HashMapTest2 {

	public static void main(String[] args) {
		// Map<String integer>���� map
		Map<String, Integer> map = new HashMap<String, Integer>();

		// ���� ������(����, �й�) ����
		map.put("��ȭ��", 1);
		map.put("���Ͽ�", 2);
		map.put("������", 3);
		map.put("������", 4);
		map.put("������", 5);
		map.put("������", 6);

		// ������ �ο�
		System.out.println("������ " + map.size() + "��");

		// ������ �й��� �˾Ƴ���
		System.out.println("������ �й��� " + map.get("������"));

		// ���� ����� �й� ���
		Set<String> keyset = map.keySet();
		Iterator<String> keyIterator = keyset.iterator();

		while (keyIterator.hasNext()) {
			String name = keyIterator.next();
			Integer stdId = map.get(name);
			System.out.println("�̸� : " + name + " �й� : " + stdId);
		}

	}

}