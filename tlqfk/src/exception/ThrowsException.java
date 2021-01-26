package exception;

import java.io.*;

public class ThrowsException {
	
	public Class loadClass(String fileName, String ClassName) throws FileNotFoundException, ClassNotFoundException {
		FileInputStream fis = new FileInputStream(fileName);
		Class c =Class.forName(ClassName);
		return c;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ThrowsException test = new ThrowsException();
		
		try {
			test.loadClass("a.txt", "java.lang.String");
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch blockS
			e.printStackTrace();
		}catch(Exception e) {
			System.out.println(e);
		}
		System.out.println("end");
	}

}
