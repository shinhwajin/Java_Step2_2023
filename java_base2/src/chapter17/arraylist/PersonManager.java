package chapter17.arraylist;

import java.util.ArrayList;
import java.util.Scanner;

public class PersonManager {
	
	public void personMgr() {
		int select;
		Person p;
		
		ArrayList<Person> personArr=new ArrayList<Person>();
		
		while(true) {
			System.out.println("1. 회원추가");
			System.out.println("2. 회원탈퇴");
			System.out.println("3. 회원정보");
			System.out.println("4. 종   료");
			System.out.print("항목선택 : ");
			
			Scanner scan=new Scanner(System.in);
			select=scan.nextInt();
			
			//if switch
			p=new Person();
			
			if(select==1) {
				System.out.println("-----정보추가-----");
				System.out.print("이름 : ");
				p.setName(scan.next());
				System.out.print("나이 : ");
				p.setAge(scan.nextInt());
				System.out.print("전화 : ");
				p.setTel(scan.next());
				System.out.println("정보가 저장되었습니다.");
				personArr.add(p);
			} else if(select==2) {
				System.out.println("-----정보삭제-----");
				System.out.print("삭제할 정보 : ");
				personArr.remove(scan.next());
			} else if(select==3) {
				System.out.println("-----정보조회-----");
				for(int i=0;i<personArr.size();i++) {
					System.out.println(personArr.get(i));
				}
			} else if(select==4) {
				System.out.println("프로그램 종료");
				break;
			} else {
				System.out.println("다시 입력하세요.");
			}
			
			
			
			
			
			
			
			
			
			
/*			switch (select) {
			case 1:
				System.out.println("-----정보추가-----");
				System.out.print("이름 : ");
				p.setName(scan.next());
				System.out.print("나이 : ");
				p.setAge(scan.nextInt());
				System.out.print("전화 : ");
				p.setTel(scan.next());
				System.out.println("정보가 저장되었습니다.");
				personArr.add(p);
				break;
			case 2:
				System.out.println("-----정보삭제-----");
				System.out.print("삭제할 정보 : ");
				personArr.remove(scan.next());
				break;
			case 3:
				System.out.println("-----정보조회-----");
				for(int i=0;i<personArr.size();i++) {
					System.out.println(personArr.get(i));
				}
				break;
			case 4:
				System.out.println("프로그램 종료");
				System.exit();
				break;
			default:
				System.out.println("다시 입력하세요.");
			}
	*/		
		}
	}

}