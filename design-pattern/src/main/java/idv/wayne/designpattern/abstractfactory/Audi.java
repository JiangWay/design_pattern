package idv.wayne.designpattern.abstractfactory;

public abstract class Audi {
	
	private String brand;
	private String type;
	
	public Audi() {
		this.brand = "Audi";
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
