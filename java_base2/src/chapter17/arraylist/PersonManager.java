package chapter17.arraylist;

import java.util.ArrayList;
import java.util.Scanner;

public class PersonManager {
	
	public void personMgr() {
		int select;
		Person p;
		
		ArrayList<Person> personArr=new ArrayList<Person>();
		
		while(true) {
			System.out.println("1. ȸ���߰�");
			System.out.println("2. ȸ��Ż��");
			System.out.println("3. ȸ������");
			System.out.println("4. ��   ��");
			System.out.print("�׸��� : ");
			
			Scanner scan=new Scanner(System.in);
			select=scan.nextInt();
			
			//if switch
			p=new Person();
			
			if(select==1) {
				System.out.println("-----�����߰�-----");
				System.out.print("�̸� : ");
				p.setName(scan.next());
				System.out.print("���� : ");
				p.setAge(scan.nextInt());
				System.out.print("��ȭ : ");
				p.setTel(scan.next());
				System.out.println("������ ����Ǿ����ϴ�.");
				personArr.add(p);
			} else if(select==2) {
				System.out.println("-----��������-----");
				System.out.print("������ ���� : ");
				personArr.remove(scan.next());
			} else if(select==3) {
				System.out.println("-----������ȸ-----");
				for(int i=0;i<personArr.size();i++) {
					System.out.println(personArr.get(i));
				}
			} else if(select==4) {
				System.out.println("���α׷� ����");
				break;
			} else {
				System.out.println("�ٽ� �Է��ϼ���.");
			}
			
			
			
			
			
			
			
			
			
			
/*			switch (select) {
			case 1:
				System.out.println("-----�����߰�-----");
				System.out.print("�̸� : ");
				p.setName(scan.next());
				System.out.print("���� : ");
				p.setAge(scan.nextInt());
				System.out.print("��ȭ : ");
				p.setTel(scan.next());
				System.out.println("������ ����Ǿ����ϴ�.");
				personArr.add(p);
				break;
			case 2:
				System.out.println("-----��������-----");
				System.out.print("������ ���� : ");
				personArr.remove(scan.next());
				break;
			case 3:
				System.out.println("-----������ȸ-----");
				for(int i=0;i<personArr.size();i++) {
					System.out.println(personArr.get(i));
				}
				break;
			case 4:
				System.out.println("���α׷� ����");
				System.exit();
				break;
			default:
				System.out.println("�ٽ� �Է��ϼ���.");
			}
	*/		
		}
	}

}