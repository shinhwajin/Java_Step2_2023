package chapter12.MultiInterface;

import java.io.IOException;
import java.util.Scanner;

public class SchedulerMain {

	public static void main(String[] args) throws IOException {
		
		Scanner scan=new Scanner(System.in);
		
		while(true) {
			System.out.println();
			System.out.println("R or r : 한 명씩 차례로 할당");
			System.out.println("L or l : 쉬고있거나 대기가 가장 적은 상담원에게 할당");
			System.out.println("P or p : 업무 skill 값이 가장 높은 상담원에게 할당");
			System.out.println("S or s : 종료");
			System.out.print("전화 상담 방식을 선택하세요 : ");

			//문자를 아스키코드로 형변환
			//방법1
			//charAt(0) : 문자(char) 또는 문자열(String) => ASCII (int)
			char input=scan.nextLine().charAt(0);
			int ch=System.in.read();  //System.in.read() : 콘솔에 입력받기 모든 입력값을 아스키코드값

			//방법2
			//String mun=scan.nextLine();
			//int ch=mun.charAt(0);  // String.charAt(0) 알파벳에 대해 int(아스키코드) 로 바꿔줌
			
			
			Scheduler scheduler=null;
			
			//객체 생성
			if(ch=='R'||ch=='r') {
				scheduler=new SchRoundRobin();
			} else if (ch=='L'||ch=='l') {
				scheduler=new SchLeastJob();
			} else if (ch=='P'||ch=='p') {
				scheduler=new SchPriorityAllocation();
			} else if (ch=='S'||ch=='s') {
				System.out.println("전화 상담을 종료합니다.");
				break;
			}else {
				System.out.println("지원되지 않는 기능입니다.");
			}
			scheduler.getNextCall();
			scheduler.sendCallToAgent();
		}

		


		
	}

}