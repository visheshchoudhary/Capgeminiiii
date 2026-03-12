package com.lpu;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.ViewResolver;
import org.springframework.web.servlet.view.InternalResourceViewResolver;

@Configuration
@ComponentScan(basePackages = "com.lpu")
public class MyConfig {
	
	
	@Bean
	public ViewResolver viewResolver()
	{	
		InternalResourceViewResolver resolver = new InternalResourceViewResolver();
		resolver.setPrefix("/WEB-INF/views/"); // page folder structure i.e where is the page
		resolver.setSuffix(".jsp"); // file extension .jsp
		
		return resolver;
	}
}
