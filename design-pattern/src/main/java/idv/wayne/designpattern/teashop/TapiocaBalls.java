package idv.wayne.designpattern.teashop;

public class TapiocaBalls extends CondimentDecorator{
	
	Beverage beverage;

	public TapiocaBalls(Beverage beverage) {
		super();
		this.beverage = beverage;
	}

	@Override
	public String getDescription() {
		return beverage.getDescription() + ", 珍珠";
	}

	@Override
	public double cost() {
		return 5 + beverage.cost();
	}
	
}
