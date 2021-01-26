package exception;

public class IDFormatTest {

	private String userID;
	
	
	public String getUserID() {
		return userID;
	}


	public void setUserID(String userID) throws IDFormatException {
		if(userID==null) {
			throw new IDFormatException("���̵�� null�� �� �����ϴ�");
		}
		else if(userID.length()<8||userID.length()>20) {
			throw new IDFormatException("���̵�� 8�� �̸� 20�� �ʰ� �� �� �����ϴ�.");
		}

		this.userID = userID;
	}


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		IDFormatTest idTest = new IDFormatTest();
		
		String MyId = null;
		try {
			idTest.setUserID(MyId);
		} catch (IDFormatException e) {
			// TODO Auto-generated catch block
			System.out.println(e);
		}
		
		MyId = "123456";
		try {
			idTest.setUserID(MyId);
		} catch (IDFormatException e) {
			// TODO Auto-generated catch block
			System.out.println(e);
		}
	}

}
