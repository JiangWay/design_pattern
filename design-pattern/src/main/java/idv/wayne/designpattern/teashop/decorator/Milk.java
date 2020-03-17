package idv.wayne.designpattern.teashop.decorator;

public class Milk extends CondimentDecorator{
	
	Beverage beverage;

	public Milk(Beverage beverage) {
		super();
		this.beverage = beverage;
	}

	@Override
	public String getDescription() {
		return beverage.getDescription() + ", 牛奶(+15)";
	}

	@Override
	public double cost() {
		return 15 + beverage.cost();
	}
	
}
