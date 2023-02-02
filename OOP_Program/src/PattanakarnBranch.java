
public class PattanakarnBranch extends Product1 {
	private int payUnit() {
		return super.getUnit()/2;
	}
	
	private int freeUnit() {
		return super.getUnit()-this.payUnit();
	}
	
	@Override
	public int getTotalprice() {
		return this.payUnit()*100;
	}
	
	@Override
	public String toString() {
		return "You buy "+ this.payUnit()+" units, get free " 
						 + this.freeUnit()+ " units (" + this.getTotalprice()+ ")";
	}
}
