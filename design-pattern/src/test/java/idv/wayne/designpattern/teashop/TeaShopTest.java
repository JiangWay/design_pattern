package idv.wayne.designpattern.teashop;

public class TeaShopTest {
	
	@org.junit.jupiter.api.Test
	public static void main(String[] args) {
		
		Beverage beverage = new GreenTea();
		System.out.println(beverage.getDescription() + " $" +beverage.cost());
		
		Beverage beverage2 = new GreenTea();
		beverage2 = new TapiocaBalls(beverage2);
		beverage2 = new TapiocaBalls(beverage2);
		beverage2 = new CoconutJelly(beverage2);
		System.out.println(beverage2.getDescription() + " $" +beverage2.cost());
		
		Beverage beverage3 = new BlackTea(Beverage.SIZE_BIG);
		beverage3 = new TapiocaBalls(beverage3);
		beverage3 = new TapiocaBalls(beverage3);
		beverage3 = new CoconutJelly(beverage3);
		System.out.println(beverage3.getDescription() + " $" +beverage3.cost());
		
		Beverage beverage4 = new BlackTea(Beverage.SIZE_BIG);
		beverage4 = new TapiocaBalls(beverage4);
		beverage4 = new TapiocaBalls(beverage4);
		beverage4 = new CoconutJelly(beverage4);
		System.out.println(beverage4.getDescription() + " $" +beverage4.cost());
		
		
	}
}
