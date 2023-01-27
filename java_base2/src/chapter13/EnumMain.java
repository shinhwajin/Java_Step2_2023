package chapter13;

import java.util.Scanner;

public class EnumMain {

	public enum Item {Start, Pause, Exit}

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		while (true) {
			System.out.print("���ڸ� �Է��ϼ���[0:���ӽ���, 1:�Ͻ�����, 2:��������] : ");

			int n = scan.nextInt();

			Item start = Item.Start;// start�� 0
			Item pause = Item.Pause;// pause�� 1
			Item exit = Item.Exit;// exit�� 2

			if (n == start.ordinal()) { // n == 0 / enum Item�� start�� ���� ��ȣ
				System.out.println("������ ���۵�");
			} else if (n == pause.ordinal()) {
				System.out.println("������ �Ͻ�������");
			} else {
				System.out.println("��������");
				return;
			}

		} // while

	}
}