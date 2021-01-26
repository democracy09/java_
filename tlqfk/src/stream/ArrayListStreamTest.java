package stream;

import java.util.*;
import java.util.stream.*;

public class ArrayListStreamTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<String> sList = new ArrayList<String>();
		sList.add("thomas");
		sList.add("newt");
		sList.add("gally");
		
		Stream<String> stream = sList.stream();
		stream.forEach(s->System.out.print(s+" "));
		System.out.println();
		
		//재사용 불가, sorted : Comparable 구현
		sList.stream().sorted().forEach(s->System.out.println(s));
		System.out.println();
		
		sList.stream().map(s->s.length()).forEach(n->System.out.println(n));
	}

}
