package com.luv2code.springsecurity.demo.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.ViewResolver;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.view.InternalResourceViewResolver;

@Configuration
@EnableWebMvc
@ComponentScan(basePackages="com.luv2code.springsecurity.demo")
public class DispatcherServlet {

	// define a bean for view Resolver 
	@Bean
	public ViewResolver viewResolver() {
		InternalResourceViewResolver ViewResolver=new InternalResourceViewResolver();
		ViewResolver.setPrefix("/WEB-INF/view/");
		ViewResolver.setSuffix(".jsp");
		
		return ViewResolver;
		
	}
	
	
}
