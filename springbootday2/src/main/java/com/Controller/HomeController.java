package com.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HomeController {
	

	@RequestMapping("/")
	public String prelogin() {
		return "login";
	}
	@RequestMapping("/log")
	public String login()
	{
		return "success";
	}
	
	@RequestMapping("/register")
	public String preregister()
	{
		return "register";
	}
	@RequestMapping("/reg")
	public String register()
	{
		return "login";
	}
}
