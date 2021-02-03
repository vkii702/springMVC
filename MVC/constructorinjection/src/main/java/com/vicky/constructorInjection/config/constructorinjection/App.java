package com.vicky.constructorInjection.config.constructorinjection;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

import com.vicky.constructorInjection.config.*;

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
		DemoClass dClass=(DemoClass)factory.getBean("demo");
		System.out.println(dClass.getColor());
    }
}
