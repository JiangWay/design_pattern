package idv.wayne.designpattern.teashop;

public class BlackTea extends Beverage {

	public BlackTea() {
		description = "Black Tea";
	}
	
	public BlackTea(String size) {
		super(size);
		description = "Black Tea";
	}
	
	@Override
	public double cost() {
		return super.cost() + 30;
	}

}
