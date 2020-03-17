package idv.wayne.designpattern.teashop;

public class CoconutJelly extends CondimentDecorator{
	
	Beverage beverage;

	public CoconutJelly(Beverage beverage) {
		super();
		this.beverage = beverage;
	}

	@Override
	public String getDescription() {
		return beverage.getDescription() + ", 椰果";
	}

	@Override
	public double cost() {
		return 5 + beverage.cost();
	}
	
}
