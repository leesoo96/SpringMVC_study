package com.LSJ.study;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

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
	
	@RequestMapping("/model/modelExam")
	public String modelExam(Model model) {
		model.addAttribute("data", "모델~");
		
		return "/model/modelExam";
	}
	
	@RequestMapping("/model/modelAndview")
	public ModelAndView modelAndView() {
		ModelAndView mv = new ModelAndView();
		mv.addObject("work", "모델과 뷰를 동시에 수행합니다!");
		mv.setViewName("/model/modelAndview"); // 뷰의 이름 설정
		
		return mv;
	}
}
