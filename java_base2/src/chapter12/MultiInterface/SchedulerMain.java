package chapter12.MultiInterface;

import java.io.IOException;
import java.util.Scanner;

public class SchedulerMain {

	public static void main(String[] args) throws IOException {
		
		Scanner scan=new Scanner(System.in);
		
		while(true) {
			System.out.println();
			System.out.println("R or r : �� �� ���ʷ� �Ҵ�");
			System.out.println("L or l : �����ְų� ��Ⱑ ���� ���� �������� �Ҵ�");
			System.out.println("P or p : ���� skill ���� ���� ���� �������� �Ҵ�");
			System.out.println("S or s : ����");
			System.out.print("��ȭ ��� ����� �����ϼ��� : ");

			//���ڸ� �ƽ�Ű�ڵ�� ����ȯ
			//���1
			//charAt(0) : ����(char) �Ǵ� ���ڿ�(String) => ASCII (int)
			char input=scan.nextLine().charAt(0);
			int ch=System.in.read();  //System.in.read() : �ֿܼ� �Է¹ޱ� ��� �Է°��� �ƽ�Ű�ڵ尪

			//���2
			//String mun=scan.nextLine();
			//int ch=mun.charAt(0);  // String.charAt(0) ���ĺ��� ���� int(�ƽ�Ű�ڵ�) �� �ٲ���
			
			
			Scheduler scheduler=null;
			
			//��ü ����
			if(ch=='R'||ch=='r') {
				scheduler=new SchRoundRobin();
			} else if (ch=='L'||ch=='l') {
				scheduler=new SchLeastJob();
			} else if (ch=='P'||ch=='p') {
				scheduler=new SchPriorityAllocation();
			} else if (ch=='S'||ch=='s') {
				System.out.println("��ȭ ����� �����մϴ�.");
				break;
			}else {
				System.out.println("�������� �ʴ� ����Դϴ�.");
			}
			scheduler.getNextCall();
			scheduler.sendCallToAgent();
		}

		


		
	}

}