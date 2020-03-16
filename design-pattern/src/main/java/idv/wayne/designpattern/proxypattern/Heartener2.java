package idv.wayne.designpattern.proxypattern;

public class Heartener2 implements Programmer{
	
    
    private PgWayne wayne ;
	
    //透明代理
	public Heartener2() {
		this.wayne = new PgWayne();
	}
	
	
	public void encourage() {
		//鼓勵的話
		System.out.println("挖屋 好棒棒!!");
	}

	@Override
	public void coding() {
		// 當工程師寫程式時，鼓勵他XD
		encourage();
		
		// 工程師就會寫程式
		wayne.coding();
	}

}
