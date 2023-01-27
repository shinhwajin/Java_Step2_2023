package chapter17.arraylist;

import java.util.ArrayList;

class Animal {
	public void move() {
		System.out.println("������ �����Դϴ�.");
	}
}

class Human extends Animal {
	public void move() {
		System.out.println("����� �ι߷� �Ƚ��ϴ�.");
	}

	public void readBook() {
		System.out.println("����� å�� �н��ϴ�.");
	}
}

class Tiger extends Animal {
	public void move() {
		System.out.println("ȣ���̴� �׹߷� �Ƚ��ϴ�.");
	}

	public void hunt() {
		System.out.println("ȣ���̴� ����� �մϴ�.");
	}
}

class Eagle extends Animal {
	public void move() {
		System.out.println("�������� �ϴ��� ���ϴ�.");
	}

	public void fly() {
		System.out.println("�������� ������ ��� ���ƴٴմϴ�.");
	}
}

public class AnimalTest {

	ArrayList<Animal> aniList = new ArrayList<Animal>();

	// addAnimal -> ��ĳ���� �޼ҵ� / �ڽ��� �θ�� �ڵ�����ȯ
	public void addAnimal() {
		aniList.add(new Human());
		aniList.add(new Tiger());
		aniList.add(new Eagle());
		for (Animal a : aniList)
			a.move();  //�θ� �����ִ� �޼ҵ� + �ڽ��� �������̵� ����
	}

	// testCasting -> �ٿ�ĳ���� �޼ҵ�
	public void testCasting() {
		for (int i = 0; i < aniList.size(); i++) {
			
			Animal a = aniList.get(i); //�θ� ArrayList�� ��ü�� ani��ü�� ����

			if (a instanceof Human) {
				Human h = (Human) a;
				h.readBook();
			} else if (a instanceof Tiger) {
				Tiger t = (Tiger) a;
				t.hunt();
			} else if (a instanceof Eagle) {
				Eagle e = (Eagle) a;
				e.fly();
			} else
				System.out.println("���� �ȵ�");
		}
	}
	
	public static void main(String[] args) {

		AnimalTest aTest = new AnimalTest();
		aTest.addAnimal();
		System.out.println("---�ٿ�ĳ����---");
		aTest.testCasting();

	}

}