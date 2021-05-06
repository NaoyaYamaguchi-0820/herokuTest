package com.example.demo;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class hogeController {
	
	@RequestMapping("/")
	public String hoge() {
		return "hoge";
	}

}
