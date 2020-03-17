package idv.wayne.designpattern.rest.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import idv.wayne.designpattern.singleton.SingletonService;

@RestController
public class SingletonController {

	@Autowired
	private SingletonService singletonService;
	
	
	@GetMapping("/getSingleton")
	public String getSingleton() {
		String serviceName = "I'm singleton,not groot";
		singletonService.setServiceName(serviceName);
		return singletonService.getServiceName();
	}
	
	@GetMapping("/getprototype")
	public String getprototype() {
		String serviceName = "I'm prototype,not groot";
		SingletonService prototype = new SingletonService();
		prototype.setServiceName(serviceName);
		return prototype.getServiceName();
	}
	

	
	
}
