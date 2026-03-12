package com.lpu.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.lpu.Entity.Student1;
import com.lpu.Service.Student1Service;

@org.springframework.stereotype.Controller
public class Controller {
	
	@Autowired
	private Student1Service service;

	@RequestMapping("/register")
	public ModelAndView saveStudent1(@ModelAttribute Student1 student)
	{
		Student1 save = service.saveStudent(student);
		ModelAndView mv = new ModelAndView();
		
		mv.addObject("id", save.getId());
		mv.addObject("name", save.getName());
		mv.addObject("phone", save.getPhone());
		mv.addObject("email", save.getEmail());
		mv.setViewName("display.jsp");
		
		return mv;
	}
	
	
	@RequestMapping("/fetch")
	public ModelAndView fetchById(@RequestParam("id") int id)
	{
		Student1 fetch = service.findById(id);
		
		ModelAndView mv = new ModelAndView();
		
		if(fetch != null)
		{
			mv.addObject("id", fetch.getId());
			mv.addObject("name", fetch.getName());
			mv.addObject("phone", fetch.getPhone());
			mv.addObject("email", fetch.getEmail());
		}
		else
			mv.addObject("name", "Student not found");
		
		mv.setViewName("display.jsp");
		
		return mv;
	}
}
