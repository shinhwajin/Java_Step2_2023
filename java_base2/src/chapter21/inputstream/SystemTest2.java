package chapter21.inputstream;

import java.io.IOException;

public class SystemTest2 {
	
	public static void main(String[] args) {
		System.out.println("���ĺ� �������� ���� [Enter]�� ��������");
		
		int i;
		try {
			while((i=System.in.read()) != '\n') {
				System.out.print((char)i+" ");  //����
				System.out.print(i+" ");
			}		
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

}
