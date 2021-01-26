package innerclass;

class Outer2{
	
	int outNum = 100;
	static int sNum = 200;
	
	Runnable getRunnable(final int i) {
		int num = 100;		//���������� final
		
		//�͸���Ŭ����
		return new Runnable(){

			@Override
			public void run() {
				// TODO Auto-generated method stub
				
				System.out.println(num);
				System.out.println(i);
				System.out.println(outNum);
				System.out.println(Outer.sNum);
			}
			
		};		//�����ݷ� ���� �ʼ���
		
	}
	
	//�͸� ���� Ŭ����
	Runnable runner = new Runnable() {
		
		@Override
		public void run() {
			// TODO Auto-generated method stub
			System.out.println("TEST");
		}
	};		//�ڵ��ϼ� ��������
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
