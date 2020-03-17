package idv.wayne.designpattern.teashop;

public class GreenTea extends Beverage {

	public GreenTea() {
		description = "Green Tea";
	}

	public GreenTea(String size) {
		super(size);
		description = "Black Tea";
	}

	@Override
	public double cost() {
		return super.cost() + 30;
	}

}
