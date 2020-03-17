package idv.wayne.designpattern.teashop;

public class pudding extends CondimentDecorator{
	
	Beverage beverage;

	public pudding(Beverage beverage) {
		super();
		this.beverage = beverage;
	}

	@Override
	public String getDescription() {
		return beverage.getDescription() + ", 布丁";
	}

	@Override
	public double cost() {
		return 5 + beverage.cost();
	}
	
}
