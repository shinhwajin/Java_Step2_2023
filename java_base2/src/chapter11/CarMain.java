package chapter11;

public class CarMain {

/*	public static void main(String[] args) {
		method(new ManualCar());
		System.out.println("==================");
		method(new AICar());
		System.out.println();

	}//main

	public static void method(Car car) {
		car.drive();
		car.stop();
	}*/
	
	public static void main(String[] args) {
		
		System.out.println("---------자율주행---------");
		Car mycar=new AICar();
		mycar.run();
		Car hiscar=new ManualCar();
		hiscar.run();
		
	}
	
}