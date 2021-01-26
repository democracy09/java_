package iostream.decorator;

import java.io.*;

public class DataStreamTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		try(FileOutputStream fos = new FileOutputStream("data.txt");
		DataOutputStream dos = new DataOutputStream(fos);
				FileInputStream fis = new FileInputStream("data.txt");
				DataInputStream dis = new DataInputStream(fis);){
			
			dos.writeByte(100);	//�ѹ���Ʈ
			dos.write(100);		//�׹���Ʈ
			dos.writeChar('a');
			dos.writeUTF("�͸͸�");
			
			//�� �״�� �б� �ƴϸ� ������
			System.out.println(dis.readByte());
			System.out.println(dis.read());
			System.out.println(dis.readChar());
			System.out.println(dis.readUTF());
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

}
