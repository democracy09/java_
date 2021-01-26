package lambda;

public class TestStringConcat {

	public static void main(String[] args) {
		StringConImpl impl = new StringConImpl();
		impl.makeString("Hello", "WORLD");
		
		//¶÷´Ù½Ä
		StringConcat concat = (s,v)->System.out.println(s+","+v);
		concat.makeString("HELLO", "WORLD");
		
		StringConcat concat2 = new StringConcat() {
			
			@Override
			public void makeString(String s1, String s2) {
				// TODO Auto-generated method stub
				System.out.println(s1+","+s2);
			}
		};
		concat2.makeString("hello", "world");
	}

}
