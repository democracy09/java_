package collection.set;

import java.util.*;

public class HashSetTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashSet<String> set = new HashSet<String>();
		
		set.add("¿õ¾Ş¿õ");
		set.add("ÃÊÅ°Æ÷Å°");
		set.add("Á×ÀÚ");
		set.add("¿õ¾Ş¿õ");

		Iterator<String> ir = set.iterator();
		
		while(ir.hasNext()) {
			String str = ir.next();
			System.out.println(str);
		}
	}

}
