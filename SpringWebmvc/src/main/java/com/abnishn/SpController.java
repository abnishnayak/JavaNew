package com.abnishn;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class SpController {
	@RequestMapping("/")
	public String display() {
		return "index";
	}
}
