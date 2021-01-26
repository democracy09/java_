package iostream.decorator;

import java.io.*;
import java.net.*;

public class FileCopy {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		long milliseconds = 0;
		
		try(FileInputStream fis = new FileInputStream("alpha.txt");
				FileOutputStream fos = new FileOutputStream("copy.txt");
				BufferedInputStream bis = new BufferedInputStream(fis);
				BufferedOutputStream bos = new BufferedOutputStream(fos)){

			milliseconds = System.currentTimeMillis();
			
			int i;
			while((i=bis.read())!=-1) {
				bos.write(i);
			}
			
			milliseconds = System.currentTimeMillis() - milliseconds;
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		Socket socket = new Socket();
		
		BufferedReader isr = new BufferedReader(new InputStreamReader(socket.getInputStream()));
		isr.readLine();
		
		System.out.println("½Ã°£ : "+milliseconds);
		
		
	}

}
