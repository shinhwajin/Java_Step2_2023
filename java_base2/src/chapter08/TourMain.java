package chapter08;

import java.util.Scanner;

public class TourMain {

	public static void main(String[] args) {
		
		Scanner scan=new Scanner(System.in);
		//������ ���
		System.out.print("������ �� : ");
		int n=scan.nextInt();
		
		//�ʱ�ȭ�� ���Ͽ� �޸� Ȯ�� �� ������ (Guide�� ��ü)
		TGuide guide=new TGuide(n);  //Guide class�� n��¥�� �迭 guest, �迭 guest�� Guest class �����

		System.out.println("������ ���");
		for(int i=0;i<n;i++) {
			System.out.print((i+1)+".�̸� : ");
			guide.guest[i].setName(scan.next());
			System.out.print((i+1)+".���� : ");
			guide.guest[i].setGender(scan.next());
			System.out.println("-------------");
		}
		
		
		System.out.println();
		while(true) {
			System.out.println("1.������ ����\n2.������ ����\n3.����");
			System.out.print("\n���� > ");
			int selectNum=scan.nextInt();
			
			if(selectNum==1) {
				for(int i=0;i<n;i++) {
					System.out.println((i+1)+".�̸� : "+guide.guest[i].getName());
					System.out.println((i+1)+".���� : "+guide.guest[i].getGender());
					System.out.println((i+1)+".������ : "+guide.guest[i].getPoint());
					System.out.println("-------------");
				}//for
			} else if(selectNum==2) {
				System.out.println("���� �������� �����Ͻðڽ��ϱ�? : ");
				TGuide.point=scan.next();
				System.out.println(TGuide.point+"�� ������ ����");
			} else {
				break;
			}//if
			System.out.println();
		}//while
		System.out.println("���α׷� ����");
		

	}
}