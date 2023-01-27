package Example;

import java.util.ArrayList;
import java.util.Scanner;

public class CompanyService {
	
	Scanner scan = new Scanner(System.in);
	ArrayList<CompanyBasics> compList = new ArrayList<CompanyBasics>();

	public void saveWorker() {
		
		CompanyBasics cb = new CompanyBasics();

		System.out.println("---팀원 등록---");
		System.out.print("등록할 직원의 이름을 입력하세요 : ");
		cb.setName(scan.next());
		System.out.print("등록할 직원의 부서를 입력하세요 : ");
		cb.setPart(scan.next());
		System.out.print("등록할 직원의 주소를 입력하세요 : ");
		cb.setAddr(scan.next());
		System.out.print("등록할 직원의 생일을 입력하세요 : ");
		cb.setBirthday(scan.next());
		compList.add(cb);
	}
	
	public void search() {
		
		if(compList.size()==0) {
			System.out.println("등록된 직원이 없습니다.");
		}
		System.out.print("찾으려는 직원의 이름을 입력하세요 : ");
		String nm = scan.next();
		
		for(int i=0;i<compList.size();i++) {
			if(compList.get(i).getName().equals(nm)) {
				System.out.println(compList.get(i));
				break;
			} else if(i+1 == compList.size()) {
				System.err.println("찾으려는 직원의 이름이 없습니다.");
			}
		}
		
	}

}
