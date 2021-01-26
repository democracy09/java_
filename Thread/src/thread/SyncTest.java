package thread;

class Bank{
	private int money = 10000;
	
	public int getMoney() {
		return money;
	}

	public void setMoney(int money) {
		this.money = money;
	}

	public  void saveMoney(int save) {
		synchronized (this) {		// lock걸 객체 지정
			int m = this.getMoney();
		
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		setMoney(m+save);
		}
		
		
		
	}
	
	public synchronized void minusMoney(int minus) {		//synchronized 키워드 : 객체 lock
	int m = this.getMoney();
		
		try {
			Thread.sleep(200);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		setMoney(m-minus);
	}
}

class Park extends Thread{
	public void run() {		// 자원에 lock해야지 쓰레드에 해밧자 의미없슴
		synchronized(SyncTest.myBank) {		//객체 lock
			System.out.println("start save");
			SyncTest.myBank.saveMoney(3000);
			System.out.println("save money: "+SyncTest.myBank.getMoney());
		}
	}
}

class ParkWife extends Thread{
	public void run() {
		synchronized(SyncTest.myBank) {
		System.out.println("start minus");
		SyncTest.myBank.minusMoney(1000);
		System.out.println("minus money: "+SyncTest.myBank.getMoney());
		}
	}
}

public class SyncTest {

	public static Bank myBank = new Bank();
	
	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		Park p = new Park();
		p.start();
		
		Thread.sleep(200);
		
		ParkWife pw = new ParkWife();
		pw.start();
	}

}
