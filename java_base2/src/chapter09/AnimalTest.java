package chapter09;

class Animal{
	public void move() {
		System.out.println("������ �����Դϴ�.");
	}
}

class Human extends Animal{
	public void move() {
		System.out.println("����� �ι߷� �Ƚ��ϴ�.");
	}
	public void readBook() {
		System.out.println("����� å�� �н��ϴ�.");
	}
}

class Tiger extends Animal{
	public void move() {
		System.out.println("ȣ���̴� �׹߷� �Ƚ��ϴ�.");
	}
	public void hunt() {
		System.out.println("ȣ���̴� ����� �մϴ�.");
	}
}

class Eagle extends Animal{
	public void move() {
		System.out.println("�������� �ϴ��� ���ϴ�.");
	}
	public void fly() {
		System.out.println("�������� ������ ��� ���ƴٴմϴ�.");
	}
}

public class AnimalTest {
	
	public static void main(String[] args) {
		AnimalTest aTest=new AnimalTest();
		
		//Animal animal=new Animal();
		//Animal animal=new Human();
		aTest.moveAnimal(new Human());  //�θ��� animal ���� �ڸ��� �ڽĵ� �� �� �ִ�?
		aTest.moveAnimal(new Tiger());
		aTest.moveAnimal(new Eagle());
		
	}
	
	public void moveAnimal(Animal animal) {
		animal.move();
	}
	
	
}