package idv.wayne.designpattern.simplefactory;

public abstract class SimpleFactory {


	public static Audi createAudi(String type) {
		switch (type) {
		case "Jeep":
			return new AudiJeep();
		case "SUV":
			return new AudiSUV();
		default:
			return null;
		}
	}
	public static BMW createBMW(String type) {
		switch (type) {
		case "Jeep":
			return new BMWJeep();
		case "SUV":
			return new BMWSUV();
		default:
			return null;
		}
	}

}
