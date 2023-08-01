package com.example.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/page")
public class JspPageController {
	
	@GetMapping("/welcome-page")
	public String test() {
		return "welcome";
	}

}
