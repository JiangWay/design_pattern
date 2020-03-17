package idv.wayne.designpattern.teashop;

import idv.wayne.designpattern.teashop.decorator.Beverage;
import idv.wayne.designpattern.teashop.decorator.BlackTeaBase;
import idv.wayne.designpattern.teashop.decorator.CoconutJelly;
import idv.wayne.designpattern.teashop.decorator.GreenTea;
import idv.wayne.designpattern.teashop.decorator.TapiocaBalls;

public class TeaShopTest {

	@org.junit.jupiter.api.Test
	public static void main(String[] args) {

		Beverage beverage = new GreenTea();
		System.out.println(beverage.getDescription() + " $" + beverage.cost());

		Beverage beverage2 = new GreenTea();
		beverage2 = new TapiocaBalls(beverage2);
		beverage2 = new TapiocaBalls(beverage2);
		beverage2 = new CoconutJelly(beverage2);
		System.out.println(beverage2.getDescription() + " $" + beverage2.cost());

		Beverage beverage3 = new BlackTeaBase(Beverage.SIZE_BIG);
		beverage3 = new TapiocaBalls(beverage3);
		beverage3 = new TapiocaBalls(beverage3);
		beverage3 = new CoconutJelly(beverage3);
		System.out.println(beverage3.getDescription() + " $" + beverage3.cost());

		Beverage beverage4 = new BlackTeaBase(Beverage.SIZE_BIG);
		beverage4 = new TapiocaBalls(beverage4);
		beverage4 = new TapiocaBalls(beverage4);
		beverage4 = new CoconutJelly(beverage4);
		System.out.println(beverage4.getDescription() + " $" + beverage4.cost());

		// ==================================================================//
		// ==========================simple factory==========================//
		// ==================================================================//

		System.out.println("simple factory");
		Drink bubbleTea = DrinksFactory.drinks(Drink.BUBBLE_TEA, Beverage.SIZE_BIG);

	}
}
