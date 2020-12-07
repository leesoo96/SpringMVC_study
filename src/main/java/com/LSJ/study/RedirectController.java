package com.LSJ.study;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class RedirectController {
//	redirect -> 다른 페이지로 이동시킬 때 사용한다!
//  가장 많이 쓰이는 방식
 	@RequestMapping("/studentConfirm")
	public String stuRedirect(HttpServletRequest requset, Model model) {
		String id = requset.getParameter("id");
		if(id.equals("buzz")) { // get방식으로 확인함!
			return "redirect:student/stuOk";
		}
		return "redirect:student/stuNo";
	}
	
	@RequestMapping("/student/stuOk")
	public String stuOk(Model model) {
		return "student/stuOk";
	}
	
	@RequestMapping("/student/stuNo")
	public String stuNo(Model model) {
		return "student/stuNo";
	}
// ---------------------------------------------------------
	
	@RequestMapping("/student/studentURL1")
	public String stuURL1(Model model) {
		return "redirect:http://localhost:8090/study/student/studentURL1.jsp";
	}
	
	@RequestMapping("/student/studentURL2")
	public String stuURL2(Model model) {
		return "redirect:student/studentURL2";
	}
}
