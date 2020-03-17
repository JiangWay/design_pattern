package idv.wayne.designpattern.teashop.decorator;

public class BlackTeaBase extends Beverage {

	public BlackTeaBase() {
		description = "Black Tea";
	}

	public BlackTeaBase(String size) {
		super(size);
		description = "Black Tea(" + cost() + ")";
	}

	@Override
	public double cost() {
		return super.cost() + 30;
	}

}
