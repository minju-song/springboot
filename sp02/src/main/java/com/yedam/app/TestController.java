package com.yedam.app;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class TestController {

	@GetMapping("/")
	public String viewTest(Model model) {
		model.addAttribute("info", "타임리프가 적용된 경우");
		return "viewTest";
	}
	
	@GetMapping("apiResult")
	public String apiResult() {
		return "apiResult";
	}
	
	@GetMapping("apiAccount")
	public String apiAccount() {
		return "apiAccount";
	}
	
	@GetMapping("calendar")
	public String calendar() {
		return "calendar";
	}
}
