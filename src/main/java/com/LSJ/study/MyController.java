package com.LSJ.study;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class MyController {
	
	@RequestMapping("/view")
	public String view() {
		return "view";
	}
	
	@RequestMapping("/contents/contentsView")
	public String contentsView(Model model) {
		model.addAttribute("id","buzz");
		
		return "contents/contentsView";
	}
}
