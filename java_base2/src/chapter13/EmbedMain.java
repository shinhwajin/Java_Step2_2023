package chapter13;

import javax.swing.JOptionPane;

class Out2 {

	static int a = 1;
	int b;

	public static class In {

		public String Infun() {
			return (a + "��° static ���� Ŭ����");
		}
		
	}
	
}

public class EmbedMain {

	public static void main(String[] args) {

		// 1.static�� Ŭ���������� ���� ������ ������
		Out2.In obj = new Out2.In();
		// 2.���ο� �ִ� �޼ҵ�
		String str = obj.Infun();

		JOptionPane.showMessageDialog(null, str + "\nSuccess");

	}

}