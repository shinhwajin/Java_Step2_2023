package chapter10;

public class CalMinus extends CalculatorExam{

	//CalMinusŬ������ ����� CalculatorExam Ŭ������ ��ӹ�������.
	//�������̵��� �̿��Ͽ� Calculator�� getResult()�Լ���
	//���ڷ� ���� n1�� n2�� ���ִ� �Լ��� ����ϴ�.
	
	@Override
	public int getResult(int n1, int n2) {
		return n1-n2;
	}

}