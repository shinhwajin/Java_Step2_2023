package chapter15;

public class StringTest1 {

	public static void main(String[] args) {
		
		String javaStr=new String("java ");  //heap
		String androidStr=new String(" android");
		System.out.println(javaStr);
		System.out.println(javaStr.hashCode()); //10����
		System.out.println(System.identityHashCode(javaStr)); //16����
		
		javaStr=javaStr.concat(androidStr);
		System.out.println();
		System.out.println(javaStr);
		System.out.println(System.identityHashCode(javaStr)); //16����

	}

}