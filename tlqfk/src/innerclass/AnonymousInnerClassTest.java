package innerclass;

class Outer2{
	
	int outNum = 100;
	static int sNum = 200;
	
	Runnable getRunnable(final int i) {
		int num = 100;		//지역변수는 final
		
		//익명내부클래스
		return new Runnable(){

			@Override
			public void run() {
				// TODO Auto-generated method stub
				
				System.out.println(num);
				System.out.println(i);
				System.out.println(outNum);
				System.out.println(Outer.sNum);
			}
			
		};		//세미콜론 ㅈㄴ 필수임
		
	}
	
	//익명 내부 클래스
	Runnable runner = new Runnable() {
		
		@Override
		public void run() {
			// TODO Auto-generated method stub
			System.out.println("TEST");
		}
	};		//자동완성 ㅈㄴ가능
}

public class AnonymousInnerClassTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Outer2 outer = new Outer2();
		outer.runner.run();
		Runnable runnable = outer.getRunnable(50);
		
		runnable.run();
	}

}
