package chapter17.arraylist;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

public class PersonManager2 {
	
	public void personMgr() {
		int select;
		Person p;
		
		ArrayList<Person> personArr=new ArrayList<Person>();
		
		while(true) {
			
			System.out.println("1. ȸ���߰�");
			System.out.println("2. ȸ��Ż��");
			System.out.println("3. ȸ������");
			System.out.println("4. ��  ��");
			System.out.print("�׸��� : ");
			
			Scanner scan=new Scanner(System.in);
			select=scan.nextInt();
			
			//if switch
			switch (select) {
			
			case 1: //�����߰�
				p = new Person();//������ �߰��Ҷ����� Person��ü�� 						    ���� �����Ѵ�.
				
				System.out.println("-----�����߰�-----");
				System.out.print("�̸� : ");
				p.setName(scan.next());
				
				System.out.print("���� : ");
				p.setAge(scan.nextInt());
				
				System.out.print("��ȭ : ");
				p.setTel(scan.next());
		//==============================================================		
				personArr.add(p);
				System.out.println("������ ����Ǿ����ϴ�.");

			System.out.println("---------------------------------");
				break;
				
			case 2: //��������
				System.out.println("-----��������-----");
				System.out.print("������ �̸� : ");
				String name = scan.next();
				
				for(int i = 0; i < personArr.size(); i++){
					
					if((personArr.get(i).getName()).equals(name)){
						personArr.remove(i);//personArr�� i��° ������ �����Ѵ�.
						System.out.println(name + "�� ������ �����߽��ϴ�.");
						break;
						
					}else{
						
						if(i + 1 == personArr.size())
							System.out.println(name + "�� �������� �ʽ��ϴ�.");
					}
				}
				
				break;
				
			case 3: //��ü����
			      System.out.println("--------��ü����--------");
			      System.out.println("����ο� " + personArr.size() + "��");
				/*		      
			      for(int i = 0; i < personArr.size(); i++){
					System.out.println("�̸� : " + personArr.get(i).getName());

					System.out.println("���� : " + personArr.get(i).getAge());

					System.out.println("��ȣ : " + personArr.get(i).getTel());
					System.out.println("--------------------");
				}*/

				//for�� ��� Iterator�� �̿��� while�� ��� ����
				Iterator<Person> it = personArr.iterator();
				while(it.hasNext()){ 
					p = it.next();
					System.out.println("�̸� : " + p.getName());
					System.out.println("���� : " + p.getAge());
					System.out.println("��ȣ : " + p.getTel());	
					System.out.println("---------------------");
				}
				break;
				
				default:
					System.out.println("���α׷� ����");
					return;
			}
		}
	}

}
