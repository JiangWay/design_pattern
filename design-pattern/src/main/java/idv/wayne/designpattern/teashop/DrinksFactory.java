package idv.wayne.designpattern.teashop;

public abstract class DrinksFactory {

	// 原味茶
	final static String BLACK_TEA = "blackTea";

	// 加料茶
	final static String BUBBLE_TEA = "bubbleTea";

	public static Beverage drinks(String drink, String size) {

		switch (drink) {

		case BLACK_TEA:
			Beverage blackTea = new GreenTea();
			System.out.println(blackTea.getDescription() + " $" + blackTea.cost());
			return blackTea;

		case BUBBLE_TEA:
			Beverage bubbleTea = new GreenTea();
			bubbleTea = new TapiocaBalls(bubbleTea);
			System.out.println(bubbleTea.getDescription() + " $" + bubbleTea.cost());
			return bubbleTea;

		}

		return null;

	}
}
