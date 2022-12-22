
public class Product {
	//attributes
	public String id;
	public int unit;
	public double price;
	//methods
	public void setId(String ID) {
		id = ID;
	}
	public String getId() {
		return id;
	}
	public void setUnit(int UNIT) {
		unit = UNIT;
	}
	public int getUnit() {
		return unit;
	}
	public void setPrice(double PRICE) {
		price = PRICE;
	}
	public double getPrice() {
		return price;
	}
	public double calculate() {
		return unit * price;
	}
	public void output() {
		
	}
}
