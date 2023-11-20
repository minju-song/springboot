package com.yedam.app;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import lombok.RequiredArgsConstructor;

@Controller
@RequiredArgsConstructor
public class TestsController {
	private final TestService testService;
	@GetMapping("/")
	public String viewTest(Model model) {
		model.addAttribute("info", "타임리프가 적용된 경우");
		return "viewTest";
	}
	
	@GetMapping("/contents")
	public String test(Model model) {
		return "contents";
	}
	@GetMapping("/contents2")
	public String test2(Model model) {
		return "contents2";
	}
	
	
	
	@GetMapping("apiTest")
	public String apiTest() {
		return "apiTest";
	}
	
	@PostMapping("apiTest")
	public void testapi() {
		testService.getPosts();
		
		
	}
}
