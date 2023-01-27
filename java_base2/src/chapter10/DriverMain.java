package chapter10;

public class DriverMain {

	public static void main(String[] args) {
		Driver driver=new Driver();
		
		driver.drive(new Bus()); //->객체 생성되고 Driver로 가서 Bus객체의 run을 읽음
		driver.drive(new Taxi());
		//Taxi taxi=new Taxi();
		//driver.drive(taxi);

		//Vehicle vehicle=new Bus() 니까 객체 생성되면서 drive() 
	}

}