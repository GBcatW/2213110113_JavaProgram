
public class Theater extends Movie{
	private int theaterNo;
	
	public Theater() {
		super();
		this.theaterNo = 0;
	}
	
	public Theater(String id, String name, Director director, int theaterNo) {
		super(id,name,director);
		this.theaterNo = theaterNo;
	}
	
	public String getTheaterName() {
		if(theaterNo >= 1 && theaterNo <= 11) {
			return "Basic Theater";
		}
		else if(theaterNo >= 12 && theaterNo <= 14) {
			return "Sweet Theater";
		}
		else {
			return "Premium Theater";
		}
	}
	
	public String toString() {
		return getTheaterName()+ ": " + super.toString();
	}
}
