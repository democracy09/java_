package iostream.inputstream;

import java.io.*;

public class SystemInTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("ÀÔ·Â");
		try {
			int i;
			InputStreamReader isr= new InputStreamReader(System.in);
			while((i= isr.read()) != '³¡') {
				System.out.print((char)i);
			}
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
