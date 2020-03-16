package idv.wayne.designpattern.simplefactory;

public abstract class BMW {
	
	private String brand;
	private String type;
	
	public BMW() {
		this.brand = "BMW";
	}

	public String getBrand() {
		return brand;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}
	
	
}
