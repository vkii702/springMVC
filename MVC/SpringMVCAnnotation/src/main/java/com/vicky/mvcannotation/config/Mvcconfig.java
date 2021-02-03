package com.vicky.mvcannotation.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.view.InternalResourceViewResolver;

@Configuration
@ComponentScan(basePackages="com.vicky.mvcannotation")
//helps to import mvc config from pre-defined package
@EnableWebMvc
public class Mvcconfig {
	//It states that method is going to return the object of any class
	@Bean
	//It is useful for configuring views for all 
			//the requests,here we are configuring that 
			//all the views would be located in '/views/' folder
			//and would have extension as .jsp
	public InternalResourceViewResolver getResolverObj()
	{
		InternalResourceViewResolver resolver=new InternalResourceViewResolver();
		resolver.setPrefix("/views/");
		resolver.setSuffix(".jsp");
		return resolver;
	}
}
