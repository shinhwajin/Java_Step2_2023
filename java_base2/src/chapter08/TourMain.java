package chapter08;

import java.util.Scanner;

public class TourMain {

	public static void main(String[] args) {
		
		Scanner scan=new Scanner(System.in);
		//관광객 등록
		System.out.print("관광객 수 : ");
		int n=scan.nextInt();
		
		//초기화를 통하여 메모리 확보 및 고객생성 (Guide의 객체)
		TGuide guide=new TGuide(n);  //Guide class에 n개짜리 배열 guest, 배열 guest는 Guest class 끌어옴

		System.out.println("관광객 등록");
		for(int i=0;i<n;i++) {
			System.out.print((i+1)+".이름 : ");
			guide.guest[i].setName(scan.next());
			System.out.print((i+1)+".성별 : ");
			guide.guest[i].setGender(scan.next());
			System.out.println("-------------");
		}
		
		
		System.out.println();
		while(true) {
			System.out.println("1.관광지 정보\n2.목적지 변경\n3.종료");
			System.out.print("\n선택 > ");
			int selectNum=scan.nextInt();
			
			if(selectNum==1) {
				for(int i=0;i<n;i++) {
					System.out.println((i+1)+".이름 : "+guide.guest[i].getName());
					System.out.println((i+1)+".성별 : "+guide.guest[i].getGender());
					System.out.println((i+1)+".목적지 : "+guide.guest[i].getPoint());
					System.out.println("-------------");
				}//for
			} else if(selectNum==2) {
				System.out.println("어디로 목적지를 변경하시겠습니까? : ");
				TGuide.point=scan.next();
				System.out.println(TGuide.point+"로 목적지 변경");
			} else {
				break;
			}//if
			System.out.println();
		}//while
		System.out.println("프로그램 종료");
		

	}
}