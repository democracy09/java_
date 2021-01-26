package iostream.serialization;

import java.io.*;

class Person implements Serializable{		//Externalizable : ������ �� �ִ� ����ȭ �������̽�, ����±��� ����
	String name;
	transient String job;		//����ȭ �Ұ�(���ϵ�)
	
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
		Person personLee = new Person("���ŷ�","���㴵��");
		Person personKim = new Person("��������","�ߴ�");
		
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
