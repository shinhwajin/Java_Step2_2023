package chapter14.hashcode;

import java.util.HashMap;

public class KeyExample {

	public static void main(String[] args) {

		// Key ��ü�� �ĺ�Ű�� ����ؼ� String ���� �����ϴ� HashMap ��ü ����
		HashMap<Key, String> hashMap = new HashMap<Key, String>();

		System.out.println(hashMap);

		// �ĺ�Ű�� ��ü�� �̿��Ͽ� �̸��� ��ȯ
		hashMap.put(new Key(1), "ȫ�浿");
		System.out.println(hashMap);
		
		hashMap.put(new Key(2), "������");
		System.out.println(hashMap);

	}

}