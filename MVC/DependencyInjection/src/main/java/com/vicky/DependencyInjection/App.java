package com.vicky.DependencyInjection;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        Resource res=new ClassPathResource("Beans.xml");
        BeanFactory factory=new XmlBeanFactory(res);
		Democlass dClass=(Democlass)factory.getBean("demo");
		dClass.show();
		Democlass deClass=(Democlass)factory.getBean("demo1");
		deClass.disp();
		
    }
}
