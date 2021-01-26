package iostream.writer;

import java.io.*;

public class FileWriterTest {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		FileWriter fw = new FileWriter("writer.txt");
		fw.write('A');
		
		char[] buf = {'B','C','D','E','F'};
		
		fw.write(buf);
		fw.write("¾È´¨Â»");
		
		fw.write(buf,2,2);
		fw.close();
		
		System.out.println("end");
	}

}
