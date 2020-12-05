package com.LSJ.study;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.LSJ.study.member.Member;

@Controller
public class formController {
	
	@RequestMapping("form/confirmUserInfo")
	public String confirmUserInfo(HttpServletRequest request, Model model) {
		String id = request.getParameter("userid");
		String pw = request.getParameter("pwd");
		model.addAttribute("userid", id);
		model.addAttribute("pwd", pw);
		
		return "form/confirmUserInfo";
	}
		
	@RequestMapping("form/confirmUserInfo2")
	public String confirmUserInfo2(@RequestParam("name") String name,
								   @RequestParam("age") int age, 
								   Model model) {
		
		model.addAttribute("name", name);
		model.addAttribute("age", age);
		
		return "form/confirmUserInfo2";
	}
	
/*	-------------------------------------------------------------------
	기존의 방식 -> 코드 양이 많아지는 단점!
	@RequestMapping("form/member")
	public String memberData(@RequestParam("name") String name,
							 @RequestParam("id") String id,
							 @RequestParam("pw") String pw,
							 Model model) {
		
		Member member = new Member();
		member.setName(name);
		member.setId(id);
		member.setPw(pw);
		
		model.addAttribute("memberInfo", member);
		
		return "form/member";
	}
*/	
//	*커맨드 객체 이용! -> 코드가 단순해지고 아주 편한 것 같다ㅠㅠ VO, DTO같다
	@RequestMapping("form/member")
	public String memberData(Member member) {
		return "form/member";
	}
	
//	@PathVariable -> 경로에 변수를 넣어 매핑
	
}
