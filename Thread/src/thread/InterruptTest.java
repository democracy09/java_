package thread;

public class InterruptTest extends Thread{
	public void run() {
		int i;
		
		for(i=0;i<100;i++) {
			System.out.println(i);
		}
		try {
			sleep(5000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			System.out.println(e);
			System.out.println("wake");
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		InterruptTest test = new InterruptTest();
		test.start();
		test.interrupt();
		
		System.out.println("end");
	}

}
