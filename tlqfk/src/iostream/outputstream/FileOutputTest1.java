package iostream.outputstream;

import java.io.*;

public class FileOutputTest1 {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try(FileOutputStream fos = new FileOutputStream("output.txt",true)){
			fos.write(65);
			fos.write(66);
			fos.write(67);
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			System.out.println(e);
		}
	}

}
