package collection.set.treeset;

import java.util.*;

class MyCompare implements Comparator<String>{

	@Override
	public int compare(String s1, String s2) {
		// TODO Auto-generated method stub
		return s1.compareTo(s2)*(-1);
	}
	
}

public class ComparatorTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
				TreeSet<String> treeSet = new TreeSet<String>(new MyCompare());
				
				treeSet.add("dd");
				treeSet.add("bb");
				treeSet.add("aa");
				
				for(String str : treeSet) {
					System.out.println(str);
				}
	}

}
