package idv.wayne.designpattern.teashop;

import idv.wayne.designpattern.teashop.decorator.Beverage;
import idv.wayne.designpattern.teashop.decorator.BlackTeaBase;
import idv.wayne.designpattern.teashop.decorator.Milk;
import idv.wayne.designpattern.teashop.decorator.TapiocaBalls;

public class BubbleTea extends Drink {

	Beverage bubbleTea;

	public BubbleTea(String size) {
		bubbleTea = new BlackTeaBase(size);
		bubbleTea = new TapiocaBalls(bubbleTea);
		bubbleTea = new Milk(bubbleTea);
		System.out.println("品名 : "+getName()+ ", 價格 : "+getPrice() + ", 產品描述 : " + getDescription());
	}

	@Override
	public String getName() {
		return "好喝的珍奶";
	}

	@Override
	public double getPrice() {
		return bubbleTea.cost();
	}

	@Override
	public String getDescription() {
		return bubbleTea.getDescription();
	}

}
