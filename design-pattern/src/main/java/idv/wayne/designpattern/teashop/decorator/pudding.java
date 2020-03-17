package idv.wayne.designpattern.teashop.decorator;

public class pudding extends CondimentDecorator{
	
	Beverage beverage;

	public pudding(Beverage beverage) {
		super();
		this.beverage = beverage;
	}

	@Override
	public String getDescription() {
		return beverage.getDescription() + ", 布丁(+10)";
	}

	@Override
	public double cost() {
		return 10 + beverage.cost();
	}
	
}
