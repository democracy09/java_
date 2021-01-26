package iostream.others;

import java.io.*;

public class RandomAccessFileTest {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		RandomAccessFile rf = new RandomAccessFile("random.txt","rw");
		rf.writeInt(100);
		System.out.println(rf.getFilePointer());
		rf.writeDouble(3.14);
		rf.writeUTF("�椷��");
		
		
		rf.seek(0);
		int i = rf.readInt();			//���������� �ʱ�ȭ�ؾߴ�
		double d = rf.readDouble();
		String str = rf.readUTF();
		
		System.out.println(i);
		System.out.println(d);
		System.out.println(str);
		
		rf.close();
	}

}
