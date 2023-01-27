package chapter10;

public class Driver {
	
	public void drive(Vehicle vehicle) {  //객체를 매개변수로 설정하면 메소드 통해서 객체 갖고올 수 있음 
		vehicle.run();  //최상위객체를 넣어주면서 자식객체들 다 사용 가능
	}

}