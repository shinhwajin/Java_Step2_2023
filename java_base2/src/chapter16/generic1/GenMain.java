package chapter16.generic1;

public class GenMain {

	public static void main(String[] args) {
		
		Gen gen=new Gen();
		
		//������
		Integer[] iArr= {1,2,3,4,5};
		gen.printArr(iArr);		
		//������
		Double[] dArr= {1.1,2.2,3.3,4.4,5.5};
		gen.printArr(dArr);
		//������
		Character[] cArr= {'a','b','c','d','e'};
		gen.printArr(cArr);
		

	}

}