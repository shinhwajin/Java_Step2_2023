package chapter16.generic1;

public class GenMain {

	public static void main(String[] args) {
		
		Gen gen=new Gen();
		
		//정수형
		Integer[] iArr= {1,2,3,4,5};
		gen.printArr(iArr);		
		//더블형
		Double[] dArr= {1.1,2.2,3.3,4.4,5.5};
		gen.printArr(dArr);
		//문자형
		Character[] cArr= {'a','b','c','d','e'};
		gen.printArr(cArr);
		

	}

}