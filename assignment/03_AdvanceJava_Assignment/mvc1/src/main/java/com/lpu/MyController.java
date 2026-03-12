package com.lpu;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller // take request and send response to client(browser)
public class MyController {
	
	@RequestMapping("/hi")
	public String takeReqHi()
	{
		return "page.jsp";
	}
	
	@RequestMapping("/login")
	public String getLogin()
	{
		return "login.jsp";
	}
	
	@RequestMapping("/logout")
	public String getLogout()
	{
		return "logout.jsp";
	}
}
