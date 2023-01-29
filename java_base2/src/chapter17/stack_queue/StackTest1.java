package chapter17.stack_queue;

import java.util.Stack;

public class StackTest1 {

	public static void main(String[] args) {

		Object obj;
		// empty ���� ����
		Stack<Object> st = new Stack<Object>();

		// �Է�
		if (st.empty()) { // ������ ���������
			for (int i = 1; i <= 5; i++) {
				st.push(new String("Hi! " + i));
				System.out.println(" �Է� " + i + "��° : " + st.peek());
			}
		}

		// ���
		st.pop(); // ������ ������ 5���
		System.out.println("���� Top�� ��ġ(peek) : " + st.peek()); // 4
		st.pop(); // ������ ������ 4���
		System.out.println("���� Top�� ��ġ(peek) : " + st.peek()); // 3
		st.push(new String("Happy!"));
		System.out.println(st.peek());
		st.push(new String("Good!"));
		System.out.println(st.peek());

	}

}
