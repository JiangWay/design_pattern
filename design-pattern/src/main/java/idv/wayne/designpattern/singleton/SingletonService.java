package idv.wayne.designpattern.singleton;

import org.springframework.stereotype.Service;

@Service
public class SingletonService {

	private String serviceName;

	private int count = 0;

	public String getServiceName() {
		return serviceName;
	}

	public void setServiceName(String serviceName) {
		this.serviceName = serviceName + count + "\n 如果是singleton 數字應當累加";
		count++;
	}

}
