package idv.wayne.designpattern.teashop.decorator;

public abstract class Beverage {

	String description = "Unkonwn Beverage";
	String size = "中杯";// 預設中杯

	public final static String SIZE_SMALL = "小杯";
	public final static String SIZE_MEDIUM = "中杯";
	public final static String SIZE_BIG = "大杯";

	public Beverage() {

	}

	public Beverage(String size) {
		this.size = size;
	}

	public String getDescription() {
		return description + ", " + size;
	}

	public double cost() {
		switch (size) {
		case SIZE_SMALL:
			return -5;
		case SIZE_BIG:
			return 5;
		default:
			return 0;
		}
	}


	

}
