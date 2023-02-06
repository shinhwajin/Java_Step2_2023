package chapter23.socket01;

import java.net.ServerSocket;
import java.net.Socket;

public class MyServer extends Thread {
	//�ʵ�
	ServerSocket ss;
	//������
	public MyServer() {
		try {
			// Ŭ���̾�Ʈ�� ������ �� �ʿ��� ��Ʈ ��ȣ�� �ݵ�� �����ؾ��ϸ�
			// ���� ��Ʈ��ȣ�� 3000���븦 ����ϴ� ���� �Ϲ����̴�
			ss = new ServerSocket(3000);  // ���� �غ�Ϸ�
			System.out.println("���� �Ϸ�!!");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}//������
	@Override
	public void run() {
		//�����ڰ� �ö����� ��ٸ�
		while(true) {
			try {
				Socket s = ss.accept();  // �����ڸ� �޾Ƶ���
				String ip = s.getInetAddress().getHostAddress();
				System.out.println(ip+"�� �Դٰ�!");
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
	}
	public static void main(String[] args) {
		MyServer ms = new MyServer();
		ms.start();
		//new MyServer().start();
	}

}
