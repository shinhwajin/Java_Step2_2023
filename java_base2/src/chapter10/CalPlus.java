package chapter10;

public class CalPlus extends CalculatorExam{
	
	//CalPlusŬ������ ����� CalculatorExam Ŭ������ ��ӹ�������.
	//�������̵��� �̿��Ͽ� Calculator�� getResult()�Լ���
	//���ڷ� ���� n1�� n2�� �����ִ� �Լ��� ����ϴ�.
	//���� ���ϰ��� -1�̸� �ȵǰ���??
	
	@Override
	public int getResult(int n1, int n2) {
		return n1+n2;
	}

}