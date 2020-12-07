package com.LSJ.study;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class ModelAttributeController {

	@RequestMapping("/model/index")
	public String index() {
		return "model/index";
	}
	
	@RequestMapping("/student/studentView")                  // 커맨드 객체 이용
	public String studentView(@ModelAttribute("studentInfo") StudentInformation studentInformation) {
		return "student/studentView";
	}
}
