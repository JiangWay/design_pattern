package idv.wayne.designpattern.simplefactory;

public class SimpleFactoryTest {

	@org.junit.jupiter.api.Test
	public void test() {

		System.out.println("----- Audi Factory -----");
		Audi AudiJeep = SimpleFactory.createAudi("Jeep");
		Audi AudiSUV = SimpleFactory.createAudi("SUV");
		
		System.out.println(AudiJeep.getBrand() + "的" + AudiJeep.getType());
		System.out.println(AudiSUV.getBrand() + "的" + AudiSUV.getType());
		
		System.out.println("----- BMW Factory -----");
		BMW BMWJeep = SimpleFactory.createBMW("Jeep");
		BMW BMWSUV = SimpleFactory.createBMW("SUV");
		
		System.out.println(BMWJeep.getBrand() + "的" + BMWJeep.getType());
		System.out.println(BMWSUV.getBrand() + "的" + BMWSUV.getType());
	}
}