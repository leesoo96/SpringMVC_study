package com.LSJ.study;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class RequestMappingController {

	@RequestMapping("/reqMapping/index")
	public String getIndex() {
		return "reqMapping/index";
	}
	
	@RequestMapping(method = RequestMethod.POST, value = "/student")
	public ModelAndView getStudent(HttpServletRequest request) {
		System.out.println("RequestMethod.GET");
		
		String id = request.getParameter("id");
		System.out.println("id = " + id);
		
//		model 사용X
//		model.addAttribute("studentId", id);
		
		ModelAndView mv = new ModelAndView();
		mv.setViewName("student/studentId");
		mv.addObject("studentId", id);
		
//		return "student/studentId";
		return mv;
	}
}
