
public class Coffee extends Drink{
	private int typeCoffee;
	private char sizeCoffee;
	private Barista barista;
	
	public Coffee (int type, char sizeCoffee, int typeCoffee, Barista barista) {
		super(type,' ');
		this.typeCoffee = typeCoffee;
		this.sizeCoffee = sizeCoffee;
		this.barista = barista;
	}
	
	public Coffee (int type, int typeCoffee) {
		super(type,' ');
		this.typeCoffee = typeCoffee;
		this.sizeCoffee = ' ';
		this.barista = null;
	}
	
	
}
