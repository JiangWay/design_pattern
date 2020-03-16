package idv.wayne.designpattern.proxypattern;

public class Heartener implements Programmer{
	
    private Programmer programmer ;
    
	
    //靜態代理
	public Heartener(Programmer programmer) {
		this.programmer = programmer;
	}
	
	
	public void encourage() {
		//鼓勵的話
		System.out.println(getClass().getSimpleName() +" : 挖屋 好棒棒!!");
	}

	@Override
	public void coding() {
		// 當工程師寫程式時，鼓勵他XD
		encourage();
		
		// 工程師就會寫程式
		programmer.coding();
	}

}
