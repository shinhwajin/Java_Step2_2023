package chapter10;

public class DriverMain {

	public static void main(String[] args) {
		Driver driver=new Driver();
		
		driver.drive(new Bus()); //->��ü �����ǰ� Driver�� ���� Bus��ü�� run�� ����
		driver.drive(new Taxi());
		//Taxi taxi=new Taxi();
		//driver.drive(taxi);

		//Vehicle vehicle=new Bus() �ϱ� ��ü �����Ǹ鼭 drive() 
	}

}