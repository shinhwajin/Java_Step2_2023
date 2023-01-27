package chapter17.arraylist;

import java.util.ArrayList;
import java.util.Iterator;

public class ArrayEx1 {

	public static void main(String[] args) {
		// Collection => List => ArrayList
		ArrayList<Integer> list = new ArrayList<Integer>();
		System.out.println("list.size() : " + list.size());

		list.add(100);
		list.add(20);
		System.out.println("list.size() : " + list.size());

		for (int i = 0; i < list.size(); i++)
			System.out.println(list.get(i));

		// �ε����� �����ϴ� ������ ���̰� ������ �������� �ӵ��� ������
		// �� �������� �ذ��ϱ� ���� Iterator
		System.out.println("------------------------------------------");
		// 1) List ������ �ڿ��� �ݺ��ڷ� ��ȯ
		Iterator<Integer> it = list.iterator();

		// 2) �ݺ��ڸ� �ݺ������� ����
		while (it.hasNext()) { // �ݺ��� �ȿ��� Ŀ�� �̵�               (.hasNext()���� �� ������)
			int v = it.next(); // unBoxing�Ͽ� ��ü�� �⺻�ڷ�������     (.next()�о��)
			System.out.println(v);
		}

	}

}