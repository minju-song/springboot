package com.yedam.app;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import lombok.RequiredArgsConstructor;

@Controller
@RequiredArgsConstructor
public class api {
	
	private final TestService testService;
	
	@GetMapping("apiTest")
	public String apiTest() {
		return "apiTest";
	}
	
	@PostMapping("apiTest")
	public void testapi() {
		testService.getPosts();
		
		
	}
}
