package chapter19.stream;

import java.util.Arrays;
import java.util.stream.IntStream;

public class IntArrayTest {

	public static void main(String[] args) {

		int[] arr = { 1, 2, 3, 4, 5 };

		// int => IntStream ����ȯ
		IntStream stream = Arrays.stream(arr);
		int sum = stream.sum();
		System.out.println(sum);

		// sum() �� Integer�� ��ȯ�ϹǷ� int �� ����
		// �� �� ������ ��Ʈ���� ���� �� �ٽ� �����ؾ���
		int sumVal = Arrays.stream(arr).sum();

		// long type �̹Ƿ� int �� ĳ����
		int count = (int) Arrays.stream(arr).count();

		System.out.println(sumVal);
		System.out.println(count);

		// �̹� ��������Ƿ� �Ҹ�� stream
		int count2 = (int) Arrays.stream(arr).count();// �缱�� ����

		// reduce(�ʱⰪ, ���޵Ǵ� ��� -> �� ��Ұ� �����ؾ��ϴ� ���)
		System.out.println(Arrays.stream(arr).reduce(0, (a, b) -> a + b));
	}

}
