package idv.wayne.designpattern.teashop.decorator;

public class GreenTea extends Beverage {

	public GreenTea() {
		description = "Green Tea";
	}

	public GreenTea(String size) {
		super(size);
		description = "Green Tea";
	}

	@Override
	public double cost() {
		return super.cost() + 30;
	}

}
