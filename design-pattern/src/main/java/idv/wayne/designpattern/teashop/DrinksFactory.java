package idv.wayne.designpattern.teashop;

public abstract class DrinksFactory {

	public static Drink drinks(String drink, String size) {

		switch (drink) {

		case Drink.BLACK_TEA:
			return new BlackTea(size);

		case Drink.BUBBLE_TEA:
			return new BubbleTea(size);

		}

		return null;

	}
}
