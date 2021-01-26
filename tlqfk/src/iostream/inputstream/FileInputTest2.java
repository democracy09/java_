package iostream.inputstream;

import java.io.*;

public class FileInputTest2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try(FileInputStream fis = new FileInputStream("input2.txt")) {
			int i;
			byte[] bs = new byte[10];
			while((i = fis.read(bs))!=-1) {
//				for(byte b :bs) {
//					System.out.print((char)b);
//				}
				
				for(int k=0;k<i;k++) {			//버퍼에 남은 쓰레기값 방지
					System.out.print((char)bs[k]);
				}
				System.out.println();
			}

		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("End");
	}

}
