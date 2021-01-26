package exception;

import java.io.*;

public class ExceptionTest {

	public static void main(String[] args) {
		try(FileInputStream fis = new FileInputStream("A.txt");) {

		} catch (FileNotFoundException e) {
			System.out.println(e);
		} catch (IOException e) {
			System.out.println(e);
		}
	}

}
