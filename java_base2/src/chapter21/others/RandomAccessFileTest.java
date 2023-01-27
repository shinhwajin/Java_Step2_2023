package chapter21.others;

import java.io.IOException;
import java.io.RandomAccessFile;

public class RandomAccessFileTest {
	// ����� Ŭ���� �߿��� �����ϰ� ������� ���ÿ� ������ Ŭ����
	// �����͸� �̿��Ͽ� ���ÿ� ������� �����ϴ�
	// �پ��� �ڷ��� �޼ҵ� ����
	public static void main(String[] args) throws IOException {

		RandomAccessFile rf = new RandomAccessFile("random.txt", "rw");
		rf.writeInt(100); //4
		System.out.println("���� �������� ��ġ : " + rf.getFilePointer());
		rf.writeDouble(3.14); //8
		System.out.println("���� �������� ��ġ : " + rf.getFilePointer());
		rf.writeUTF("���̿ɴϴ�"); //�ѱ��ڴ� 3byte 3*5+2(null) =17
		System.out.println("���� �������� ��ġ : " + rf.getFilePointer());
		
		rf.seek(0);
		System.out.println("���� �������� ��ġ : " + rf.getFilePointer());
		
		int i=rf.readInt();
		double d=rf.readDouble();
		String u=rf.readUTF();
		
		System.out.println("-------------------");
		System.out.println("���� �������� ��ġ : " + rf.getFilePointer());
		System.out.println(i);
		System.out.println(d);
		System.out.println(u);

	}

}
