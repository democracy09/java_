package iostream.inputstream;

import java.io.*;

public class FileInputTest1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try(FileInputStream fis = new FileInputStream("input.txt")) {
			int i;
			while((i = fis.read())!=-1) {
				System.out.println((char)i);
			}

		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("End");
	}

}
