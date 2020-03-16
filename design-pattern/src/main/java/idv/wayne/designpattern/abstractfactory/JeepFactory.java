package idv.wayne.designpattern.abstractfactory;

public class JeepFactory extends AbstractFactory {

	@Override
	public Audi createAudi() {
		return new AudiJeep();
	}

	@Override
	public BMW createBMW() {
		return new BMWJeep();
	}


}
