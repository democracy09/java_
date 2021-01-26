package exception;

public class IDFormatTest {

	private String userID;
	
	
	public String getUserID() {
		return userID;
	}


	public void setUserID(String userID) throws IDFormatException {
		if(userID==null) {
			throw new IDFormatException("아이디는 null일 수 없습니다");
		}
		else if(userID.length()<8||userID.length()>20) {
			throw new IDFormatException("아이디는 8자 미만 20자 초과 일 수 없습니다.");
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
