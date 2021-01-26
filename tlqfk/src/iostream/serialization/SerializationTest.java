package iostream.serialization;

import java.io.*;

class Person implements Serializable{		//Externalizable : 구현할 수 있는 직렬화 인터페이스, 입출력구현 가능
	String name;
	transient String job;		//직렬화 불가(소켓등)
	
	public Person(String name, String job) {
		this.name = name;
		this.job = job;
	}
	
	public String toString() {
		return name+","+job;
	}

}

public class SerializationTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Person personLee = new Person("순신뤼","엔쥐뉘워");
		Person personKim = new Person("유신정변","쌩님");
		
		try(FileOutputStream fos = new FileOutputStream("serial.dat");
				ObjectOutputStream oos = new ObjectOutputStream(fos)){
			oos.writeObject(personLee);
			oos.writeObject(personKim);
		}catch(IOException e) {
			System.out.println(e);
		}
		
		try(FileInputStream fis = new FileInputStream("serial.dat");
				ObjectInputStream ois = new ObjectInputStream(fis)){
			Person p1 = (Person)ois.readObject();
			Person p2 = (Person)ois.readObject();
			
			System.out.println(p1);
			System.out.println(p2);
		}catch(IOException e) {
			System.out.println(e);
			
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
