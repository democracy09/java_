package innerclass;


class OutClass{
	private int num = 10;
	private static int snum = 20;
	private InClass inClass;
	
	public OutClass(){
		inClass = new InClass();
	}
	
	class InClass{
		int inum = 100;
		
		void inTest() {
			System.out.println(num);
			System.out.println(snum);
		}
	}
	
	public void usingInner() {
		inClass.inTest();
	}
	
	static class InStaticClass{
		int inNum = 100;
		static int sInNum = 200;
		
		void inTest() {
			System.out.println(inNum);
			System.out.println(sInNum);
			System.out.println(snum);
		}
		
		static void sTest() {
			System.out.println(sInNum);
			System.out.println(snum);
		}
	}
}
public class InnerTest {
	public static void main(String[] args) {
		OutClass outClass = new OutClass();
		outClass.usingInner();
		
		OutClass.InClass myinClass = outClass.new InClass();
		myinClass.inTest();
		
		System.out.println();
		
		OutClass.InStaticClass sInClass = new OutClass.InStaticClass();
		sInClass.inTest();
		
		OutClass.InStaticClass.sTest();
	}
}
