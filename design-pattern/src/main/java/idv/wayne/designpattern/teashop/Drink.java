package idv.wayne.designpattern.teashop;

public abstract class Drink {
	
	// 原味茶
	final static String BLACK_TEA = "blackTea";

	// 加料茶
	final static String BUBBLE_TEA = "bubbleTea";
	
	
	String name;
	double price;
	String Description;
	
	public String getName() {
		return name;
	}
	public double getPrice() {
		return price;
	}
	public String getDescription() {
		return Description;
	}
	
	
	
}
