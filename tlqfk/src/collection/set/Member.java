package collection.set;

public class Member {
	private int memberID;
	private String memberName;
	
	public Member() {}
	public Member(int memberID, String memberName) {
		this.memberID = memberID;
		this.memberName = memberName;
	}
	public int getMemberID() {
		return memberID;
	}
	public void setMemberID(int memberID) {
		this.memberID = memberID;
	}
	public String getMemberName() {
		return memberName;
	}
	public void setMemberName(String memberName) {
		this.memberName = memberName;
	}
	
	public String toString() {
		return memberName+"ȸ������ ���̵�� "+memberID+"�Դϴ�.";
	}
	@Override
	public int hashCode() {
		// TODO Auto-generated method stub
		return memberID;
	}
	@Override
	public boolean equals(Object obj) {
		// TODO Auto-generated method stub
		if(obj instanceof Member) {
			Member member = (Member)obj;
			
			return (member.memberID==this.memberID);
		}
		
		return false;
	}
	
	
}
