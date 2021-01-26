package collection.set.treeset;

import java.util.*;

public class TreeSetTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TreeSet<String> treeSet = new TreeSet<String>();
		
		treeSet.add("dd");
		treeSet.add("bb");
		treeSet.add("aa");
		
		for(String str : treeSet) {
			System.out.println(str);
		}
	}

}
