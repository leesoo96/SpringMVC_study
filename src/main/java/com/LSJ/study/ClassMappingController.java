package com.LSJ.study;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/contents")
public class ClassMappingController {
	
	@RequestMapping("/classMappingview")
	public String view() {
		return "/contents/classMappingview";
		
//		최종 요청 경로 : /contents + /classMappingview 
//		=> /contents/classMappingview 
	}
}
