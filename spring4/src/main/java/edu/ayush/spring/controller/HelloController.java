package edu.ayush.spring.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class HelloController {

	@GetMapping("/hello")
	public ModelAndView hello(Model model) {

		ModelAndView mv = new ModelAndView();
		mv.setViewName("welcome");
		return mv;
	}
}
