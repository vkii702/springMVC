package com.vicky.mvcannotation.config;

import org.springframework.web.servlet.support.AbstractAnnotationConfigDispatcherServletInitializer;

public class myfirstcontroller extends AbstractAnnotationConfigDispatcherServletInitializer    {

	@Override
	protected Class<?>[] getRootConfigClasses() {
		// TODO Auto-generated method stub
		return new Class[]{Mvcconfig.class};
	}

	@Override
	protected Class<?>[] getServletConfigClasses() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	protected String[] getServletMappings() {
		// TODO Auto-generated method stub
		//here we mention that any url request after by '/'
				//has to be received by DispatcherServlet and 
				//then should be forwaded
				//to MvcConfig
		return new String[]{"/"};
	}



}
