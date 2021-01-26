package iostream.reader;

import java.io.*;

public class FIleReaderTest {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		FileReader fis = new FileReader("reader.txt");
		int i;
		while((i=fis.read())!=-1) {
			System.out.println((char)i);
		}
	}

}
