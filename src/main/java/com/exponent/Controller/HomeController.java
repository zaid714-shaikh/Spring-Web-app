package com.exponent.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HomeController {

//	@Autowired
//	private studentService sr;

	@GetMapping(value = "/")
	public String RegisterStudent() {

		return "index";
	}
}
