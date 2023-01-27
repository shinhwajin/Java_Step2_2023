package chapter21.inputstream;

import java.io.FileInputStream;
import java.io.IOException;

public class FileInputStreamTest04 {
	
	public static void main(String[] args) throws IOException {

		try (FileInputStream fis = new FileInputStream("input3.txt")) {
			byte[] bs=new byte[10]; //���۷� Ȱ��
			
			int i;
			while((i=fis.read(bs))!= -1 ) {
				//�����б� : 10���� �������� ���
				for(int j=0;j<i;j++) {
					System.out.print((char)bs[j]+" ");
				}//10�� ��� �Ϸ�
				System.out.println(" : "+i+"����Ʈ ����");
			}

		} catch (IOException e) {
			e.printStackTrace();
		} 
		System.out.println("end");
		
	}

}
