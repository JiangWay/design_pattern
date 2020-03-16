package idv.wayne.designpattern.rest.controller;

import java.lang.reflect.Proxy;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import idv.wayne.designpattern.proxypattern.Heartener;
import idv.wayne.designpattern.proxypattern.PgRyan;
import idv.wayne.designpattern.proxypattern.PgWayne;
import idv.wayne.designpattern.proxypattern.Programmer;

@RestController
@RequestMapping("/proxy-pattern")
public class ProxyPatternRestController {

	
	@GetMapping("/static-proxey")
	public void encourageAll() {
		Programmer wayne = new PgWayne();
		Programmer ryan = new PgRyan();
		
		Heartener heartener = new Heartener(wayne);
		Heartener heartener2 = new Heartener(ryan);
		
		heartener.coding();
		heartener2.coding();
		
	}
	
	@GetMapping("/dynamic-proxy")
	public void dynamicencourageAll() {
		 Programmer pgs = new PgWayne();
		 Programmer hearteners = (Programmer) Proxy.newProxyInstance(pgs.getClass().getClassLoader(), pgs.getClass().getInterfaces(), (proxy, method, args) -> {

	            // 如果是调用coding方法，那么水军就要点赞了
	            if (method.getName().equals("coding")) {
	            	System.out.println("我是程式鼓勵員 來鼓勵你們惹");
	                method.invoke(pgs, args);

	            } else {
	                // 如果不是调用coding方法，那么调用原对象的方法
	                return method.invoke(pgs, args);
	            }

	            return null;
	        });

		 hearteners.coding();
		 
	}
	
	
}
