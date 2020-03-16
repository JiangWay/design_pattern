package idv.wayne.designpattern.proxypattern;

public class PgWayne implements Programmer {

	@Override
	public void coding() {
		System.out.println(getClass().getSimpleName() + " : 寫程式......");

	}

}
