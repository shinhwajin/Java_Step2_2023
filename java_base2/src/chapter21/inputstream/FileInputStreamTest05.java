package chapter21.inputstream;

import java.io.FileInputStream;
import java.io.FileOutputStream;

public class FileInputStreamTest05 {
	
	public static void main(String[] args) {

		try (FileOutputStream fos = new FileOutputStream("resource.txt", true);  //����
				FileInputStream fis = new FileInputStream("resource.txt")){
			//����
			fos.write(71);  // A �����Ǵ� ���ڷ� ����
			fos.write(72);  // B �����Ǵ� ���ڷ� ����
			fos.write(73);  // C �����Ǵ� ���ڷ� ����
			//�б�
			System.out.print((char)fis.read()+" ");
			System.out.print((char)fis.read()+" ");
			System.out.print((char)fis.read()+" ");
			System.out.print((char)fis.read()+" ");
			System.out.print((char)fis.read()+" ");
			
		} catch (Exception e) {
			// TODO: handle exception
		}
		
	}

}
