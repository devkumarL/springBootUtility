package com.devkumar.demo;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class ViewController {
	

	@RequestMapping("/view")
	public String welcome(Model model) {
		model.addAttribute("message", "heyyyy123");
		return "view";
	}
	
}
