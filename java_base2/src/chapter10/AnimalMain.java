package chapter10;

public class AnimalMain {

	public static void main(String[] args) {

		System.out.println("-----��-----");
		Bear bear=new Bear();
		System.out.println("���� ���� "+bear.getEye()+"��");
		System.out.println("���� �ٸ��� "+bear.getLeg()+"��");
		System.out.println("���� Ư¡�� "+bear.woong);
		
		System.out.println("-----����-----");
		Lion lion=new Lion();
		System.out.println("������ ���� "+lion.getEye()+"��");
		System.out.println("������ �ٸ��� "+lion.getLeg()+"��");
		System.out.println("������ Ư¡�� "+lion.galgi);
		
		System.out.println("-----�Ź�-----");
		Spider spider=new Spider();
		System.out.println("�Ź��� ���� "+spider.getEye()+"��");
		System.out.println("�Ź��� �ٸ��� "+spider.getLeg()+"��");
		System.out.println("�Ź��� Ư¡�� "+spider.web);
		

	}

}