package com.pactera.web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.util.StringUtils;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class HelloController {

	@RequestMapping(value = "sayHello")
	public ModelAndView sayHello(String name) {

		ModelAndView mav = new ModelAndView("hello");

		if (!StringUtils.isEmpty(name)) {
			mav.addObject("hello", "Hello, " + name + "!");
		}

		return mav;
	}
}
