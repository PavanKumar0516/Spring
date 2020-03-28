package com.capg.SpringBootJSP;

import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
@RequestMapping("/app")
public class HelloController {
	@GetMapping("/display")
	public String display(@RequestParam("uname") String uname , HttpSession session) {
		session.setAttribute("uname", uname);
		return "display";
	}
}
