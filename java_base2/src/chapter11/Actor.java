package chapter11;

import java.util.Scanner;

public class Actor {
	
	public static void main(String[] args) {
		
		String[][] actor = { {"[�۰�ȣ]", "����", "����", "����"}, 
	            { "[�����]", "���ϵ�", "������ �׳�", "�����ϰ� �����ϰ�"}, 
	            { "[�̺���]", "��������", "����", "����"} };
			
		int cnt=0;
			
		System.out.print("�˻��� ��� : ");
		Scanner scan=new Scanner(System.in);
		String actName=scan.next();
		
		for(int i=0;i<actor.length;i++) {
			if(actor[i][0].equals("["+actName+"]")) {    //�˻��� ��찡 �ִ��� ������ �Ǵ�
				for(int j=0;j<actor[i].length;j++) {
					System.out.println(actor[i][j]);
				}//inner for
			} else {
				cnt++;
				if(cnt>=actor.length) {
					System.out.println("�ش��찡 �������� �ʽ��ϴ�.");
				}//inner if
			}//outer if
		}//outer for
		
		
	}
}

	