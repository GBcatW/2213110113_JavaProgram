
public class Date {
	private int dMonth;
	private int dDay;
	private int dYear;
	
	//default constructor
	//postcondition : dMonth = 1, dDay = 1, dYear = 1900
	public Date() {
		this.dMonth = 1;
		this.dDay = 1;
		this.dYear = 1900;
	}
	
	//Constructor
	public Date(int month, int day, int year) {
		//dMonth = month;
		//dDay = day;
		//dYear = year;
		setDate(month, day, year);
	}
	
	public void setDate(int month, int day, int year) {
		dMonth = month;
		dDay = day;
		dYear = year;
	}
	
	public int getMonth() {
		return dMonth;
	}
	
	public int getDay() {
		return dDay;
	}
	
	public int getYear() {
		return dYear;
	}
	
	//Method to return the date in the from mm-dd-yy
	public String toString() {
		return getMonth() + "-" + getDay() + "-" + getYear();
	}
}
