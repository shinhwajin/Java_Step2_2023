package Example;

import java.util.ArrayList;
import java.util.Scanner;

public class CompanyService {
	
	Scanner scan = new Scanner(System.in);
	ArrayList<CompanyBasics> compList = new ArrayList<CompanyBasics>();

	public void saveWorker() {
		
		CompanyBasics cb = new CompanyBasics();

		System.out.println("---���� ���---");
		System.out.print("����� ������ �̸��� �Է��ϼ��� : ");
		cb.setName(scan.next());
		System.out.print("����� ������ �μ��� �Է��ϼ��� : ");
		cb.setPart(scan.next());
		System.out.print("����� ������ �ּҸ� �Է��ϼ��� : ");
		cb.setAddr(scan.next());
		System.out.print("����� ������ ������ �Է��ϼ��� : ");
		cb.setBirthday(scan.next());
		compList.add(cb);
	}
	
	public void search() {
		
		if(compList.size()==0) {
			System.out.println("��ϵ� ������ �����ϴ�.");
		}
		System.out.print("ã������ ������ �̸��� �Է��ϼ��� : ");
		String nm = scan.next();
		
		for(int i=0;i<compList.size();i++) {
			if(compList.get(i).getName().equals(nm)) {
				System.out.println(compList.get(i));
				break;
			} else if(i+1 == compList.size()) {
				System.err.println("ã������ ������ �̸��� �����ϴ�.");
			}
		}
		
	}

}
