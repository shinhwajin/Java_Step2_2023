package chapter12.MultiInterface;

public interface CuBuy {

	void buy();

	default void order() {
		System.out.println("���� �ֹ�");
	}
}