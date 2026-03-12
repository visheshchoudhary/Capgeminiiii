package com.lpu;

import java.awt.DisplayMode;

import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@org.springframework.stereotype.Controller
public class Controller{
	
	@RequestMapping("/vs")
	public String homePage()
	{
		return "home";
	}
	
	@RequestMapping("/form")
	public String formPage()
	{
		return "form";
	}
	
	@RequestMapping("/register")
	public String getInfo()
	{
		return "register";
	}
	
	@RequestMapping("/d1")
	public String sendData(Model model)
	{
		model.addAttribute("name", "Ansh");   // model - data for display.jsp page
		model.addAttribute("phone", 8921385128l);
		
		return "display";
	}
	
	@RequestMapping("/d2")
	public String sendData1(Model model)
	{
		sendData(model);
		
		return "display";
	}
	
	@RequestMapping("/mv")
	public ModelAndView sendData2(ModelAndView mv)
	{
		mv.addObject("name", "raju");
		mv.addObject("phone", 9824124894l);
		mv.setViewName("display");
		
		return mv;
	}
	
	@RequestMapping("/reg")
	public ModelAndView register(@RequestParam(value = "n") String name,
			@RequestParam(value = "p") String phone, @RequestParam(value = "e") String email)
	{
		ModelAndView mv = new ModelAndView();
		mv.addObject("name", name);
		mv.addObject("phone", phone);
		mv.addObject("email", email);
		mv.setViewName("display");
		
		return mv;
	}
	
	@RequestMapping("/reg2")
	public ModelAndView register2(@ModelAttribute Student student)
	{
		ModelAndView mv = new ModelAndView();
		mv.addObject("name", student.getName());
		mv.addObject("phone", student.getPhone());
		mv.addObject("email", student.getEmail());
		mv.setViewName("display");
		
		return mv;
	}
}
