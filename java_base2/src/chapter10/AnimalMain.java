package chapter10;

public class AnimalMain {

	public static void main(String[] args) {

		System.out.println("-----곰-----");
		Bear bear=new Bear();
		System.out.println("곰의 눈은 "+bear.getEye()+"개");
		System.out.println("곰의 다리는 "+bear.getLeg()+"개");
		System.out.println("곰의 특징은 "+bear.woong);
		
		System.out.println("-----사자-----");
		Lion lion=new Lion();
		System.out.println("사자의 눈은 "+lion.getEye()+"개");
		System.out.println("사자의 다리는 "+lion.getLeg()+"개");
		System.out.println("사자의 특징은 "+lion.galgi);
		
		System.out.println("-----거미-----");
		Spider spider=new Spider();
		System.out.println("거미의 눈은 "+spider.getEye()+"개");
		System.out.println("거미의 다리는 "+spider.getLeg()+"개");
		System.out.println("거미의 특징은 "+spider.web);
		

	}

}