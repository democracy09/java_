package objectexample;

class Mydate {
	int day;
	int month;
	int year;
	
	public Mydate(int date, int month, int year) {
		this.day=date;
		this.month=month;
		this.year=year;
	}
	
	public boolean equals(Mydate date) {
		return ((this.day==date.day)?true:false);
	}
}

public class MydateExample{
	public static void main(String[] args) {
		Mydate date1 = new Mydate(15,12,2020);
		Mydate date2 = new Mydate(10,12,2020);
		
		System.out.println(date1.equals(date2));
		System.out.println(date1.hashCode());
	}
}