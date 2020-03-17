package idv.wayne.designpattern.teashop;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/tea-shop")
public class TeaShopController {
	
	@GetMapping("/")
	public String initTeaShop() {
		
		return "teaShop";
	}
}
