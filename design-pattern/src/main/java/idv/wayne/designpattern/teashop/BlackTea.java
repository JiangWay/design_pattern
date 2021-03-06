package idv.wayne.designpattern.teashop;

import idv.wayne.designpattern.teashop.decorator.Beverage;
import idv.wayne.designpattern.teashop.decorator.GreenTea;
import idv.wayne.designpattern.teashop.decorator.TapiocaBalls;

public class BlackTea extends Drink {

	Beverage bubbleTea;

	public BlackTea(String size) {
		bubbleTea = new GreenTea(size);
		bubbleTea = new TapiocaBalls(bubbleTea);
	}

	@Override
	public String getName() {
		return "好喝的紅茶";
	}

	@Override
	public double getPrice() {
		Beverage bubbleTea = new GreenTea();
		bubbleTea = new TapiocaBalls(bubbleTea);
		return bubbleTea.cost();
	}

	@Override
	public String getDescription() {
		return bubbleTea.getDescription();
	}

}
