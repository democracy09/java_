package lambda;

interface PrintString{
	void showString(String str);
}

public class TestLambda {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		PrintString lambdastr = s->System.out.println(s);	//�͸�޼ҵ� ����
		
		lambdastr.showString("TEST");
		
		showMyString(lambdastr);
		
		PrintString test = returnString();
		test.showString("Test");
	}
	
	public static void showMyString(PrintString p) {
		p.showString("test");
	}
	
	public static PrintString returnString() {
		return s->System.out.println(s+"?");
	}

}
