package chapter23.socket02;

import java.io.PrintWriter;
import java.net.Socket;
import java.util.Scanner;

public class MyClient {

	public static void main(String[] args) {
		System.out.println("�޼��� �Է� : ");
		Scanner scan = new Scanner(System.in);
		String msg = scan.nextLine();
		
		Socket s=null;
		
		try {
			s=new Socket("172.16.10.12",3001);  //���� ip�� ��Ʈ��ȣ
			// ���ڿ��� ������ ������ ���� ��Ʈ�� �غ�
			PrintWriter out = new PrintWriter(s.getOutputStream());
			// ������ ���ڿ� ������
			out.write(msg);
			// ��Ʈ���� ������ ������ ���
			out.flush();
			if(out !=null) {
				out.close(); //��Ʈ�� �ݱ�
			} 
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				if(s != null)
					s.close();
			} catch (Exception e2) {
				e2.printStackTrace();
			}
		}
		
	}

}
