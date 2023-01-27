package chapter21.outputstream;

import java.io.FileOutputStream;
import java.io.IOException;

public class FileOutputStream01 {
	
	public static void main(String[] args) throws IOException {
		
		FileOutputStream fos = new FileOutputStream("output1.txt"); //��ü ����
		FileOutputStream fs = new FileOutputStream("output2.txt"); //Ư�� �ε��� �����ؼ� ����
		
		try (fos){
			
			byte[] bs = new byte[26];
			byte data=65; //A
			
			for(int i=0;i<bs.length;i++) {
				bs[i]=data;
				data++;
			}
			fos.write(bs);//�迭 �Ѳ����� ���� => input1.txt
			fs.write(bs, 2, 10);  //�迭�� 2�� ����� 10���� ���� => input2.txt
		} catch (IOException e) {
			e.printStackTrace();
		}
		System.out.println("������ �Ϸ�Ǿ����ϴ�.");
	}

}
