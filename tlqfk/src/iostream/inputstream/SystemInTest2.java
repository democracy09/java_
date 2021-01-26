package iostream.inputstream;

import java.io.*;

public class SystemInTest2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("ют╥б");
		try {
			int i = System.in.read();
			System.out.println(i);
			System.out.println((char)i);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
