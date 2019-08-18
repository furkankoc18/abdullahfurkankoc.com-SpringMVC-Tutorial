package _01_com.furkan.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@RequestMapping("/controller")
@Controller
public class HelloController {

	@RequestMapping(value="/hello",method=RequestMethod.GET)
	public String page(ModelMap model) {
		model.addAttribute("msj","abdullahfurkankoc.com Test");
			
		return "hello";
	}
	
}
