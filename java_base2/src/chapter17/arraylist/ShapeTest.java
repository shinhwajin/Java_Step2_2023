package chapter17.arraylist;

import java.util.ArrayList;

class Shape {
	void draw() {
		System.out.println("draw Shape");
	}
}

class Circle extends Shape {
	@Override
	void draw() {
		System.out.println("draw Circle");
	}
	void circle() {
		System.out.println("����� �Դϴ�");
	}
}

class Rectangle extends Shape {
	@Override
	void draw() {
		System.out.println("draw Rectangle");
	}
	void rectangle() {
		System.out.println("�簢�� �Դϴ�");
	}
}

class Triangle extends Shape {
	@Override
	void draw() {
		System.out.println("draw Triangle");
	}
	void triangle() {
		System.out.println("�ﰢ�� �Դϴ�");
	}
}

public class ShapeTest {
	
	//shape �� shape�� ��ӹ��� ��� Ŭ���� Ÿ���� ����ϴ� ArrayList
	ArrayList<Shape> sList = new ArrayList<Shape>();

	public static void main(String[] args) {
		
		ShapeTest sTest=new ShapeTest();
		System.out.println("---- ��ĳ���� ----");
		sTest.addShape();  //Shape sc=new Circle
		sTest.testCasting();

	}

	
	public void addShape() {
		sList.add(new Circle());    //Circle s = new Circle();
		sList.add(new Rectangle());
		sList.add(new Triangle());
		for(Shape s:sList) {
			s.draw();
		}
	}
	
	public void testCasting() {
		for(int i=0;i<sList.size();i++) {
			
			Shape s=sList.get(i);   //�ϴ� �θ�(Shape) Ÿ������ ������
			
			if(s instanceof Circle) {
				Circle c=(Circle) s;  //�ٿ�ĳ����
				c.circle();
			} else if(s instanceof Rectangle) {
				Rectangle r=(Rectangle) s;  //�ٿ�ĳ����
				r.rectangle();
			} else if(s instanceof Triangle) {
				Triangle t=(Triangle) s;  //�ٿ�ĳ����
				t.triangle();
			} else {
				System.out.println("�������� �ʴ� Ÿ���Դϴ�");
			}
		}
	}
	
}