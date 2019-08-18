package _02_com.furkan.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@RequestMapping("/02_controller")
@Controller
public class HelloController {
	
	@GetMapping(value="/hello")
	public String getHello(ModelMap model) {
		model.addAttribute("test","GetMapping example");
		return "hello";
	}
		
	
	
}
