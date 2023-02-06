package chapter23.socket03;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;

public class CopyClient extends Thread {

	Socket s;
	BufferedReader in;
	PrintWriter out;
	ChatServer server;
	String ip;

	public CopyClient(Socket s, ChatServer cs) {
		// �����ڸ� ���ؼ� ���� Client�� Socket ������ Server�� ������ ����
		this.s = s;
		this.server = cs;

		try {
			out = new PrintWriter(s.getOutputStream(), true);
			in = new BufferedReader(new InputStreamReader(s.getInputStream()));
			ip = s.getInetAddress().getHostAddress();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	@Override
	public void run() {
		while(true) {
			try {
				String msg = in.readLine();
				//������
				if(msg.equals("~X")) {
					out.print("~X");
					server.removeClient(this);
					break;
				}
				//ä����
				server.sendMessage(ip+" : "+msg);
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
	}
}
