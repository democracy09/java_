package iostream.outputstream;

import java.io.*;

public class FileOutputTest2 {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		byte[] bs = new byte[26];
		byte data = 65;
		for(int i=0;i<bs.length ; i++) {
			bs[i]=data;
			data++;
		}
		try(FileOutputStream fos = new FileOutputStream("alpha.txt",true);		//true : °è¼Ó ¾îÆæµå
				FileInputStream fis = new FileInputStream("alpha.txt")){
			fos.write(bs);
			int ch;
			while((ch=fis.read())!=-1) {
				System.out.print((char)ch);
			}
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			System.out.println(e);
		}
	}

}
