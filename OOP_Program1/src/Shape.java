
public abstract class Shape {
	
	private String color;
	
	public Shape(String color) {
		this.color = color;
	}
	
	public Shape() {
		color = null;
	}
	
	//abstract method
	public abstract double getArea();
	
	//return string
	public String toString() {
		return "color = " + this.color;
	}
}
