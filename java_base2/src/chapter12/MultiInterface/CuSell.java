package chapter12.MultiInterface;

public interface CuSell {

	void sell();

	// ���� �̸��� default�޼ҵ�� ������ �� �����Ƿ� �������̵� �ʿ�
/*	default void order() {
		System.out.println("�Ǹ� �ֹ�");
	}
*/
	default void sellorder() {
		System.out.println("�Ǹ� �ֹ�");
	}

}