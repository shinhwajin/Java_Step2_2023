package chapter09;

public class CSportsCar extends Car {
	
	@Override
public void speedUp() {
	speed +=10;
	System.out.println("speed : "+speed);
}
/*
	// final�̹Ƿ� �����ǰ� �ȵ�
public void stop() {
	System.out.println("������ī�� ����ϴ�");
	speed=0;
}					*/

	public static void main(String[] args) {
	CSportsCar ac=new CSportsCar();
	ac.speedUp();
	System.out.println(ac.speed);
	ac.stop();
	
}

}