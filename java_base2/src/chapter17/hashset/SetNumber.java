package chapter17.hashset;

import java.util.HashSet;

public class SetNumber {

	public static void main(String[] args) {

		HashSet<Integer> hs = new HashSet<Integer>();

		while (true) {
			// ���� 45�� �߻�
			int v = (int) (Math.random() * 45 + 1);
			// int v=new Random().nextInt(45)+1;

			hs.add(v);

			if (hs.size() >= 6)
				break;

		}
		System.out.println(hs);
	}

}