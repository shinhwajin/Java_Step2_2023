package chapter09;

public class InheritanceMain {

	public static void main(String[] args) {
		IStrawberry obj=new IStrawberry();
		
		obj.Set1("Berry", "����");
		obj.Set2("����", "��");
		obj.Set3("����", 7000);
		
		obj.Disp();
		System.out.println("------------");
		obj.Disp2();
		System.out.println("------------");
		obj.Disp3();
		
		
	}

}