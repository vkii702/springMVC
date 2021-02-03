package com.vicky.AOPannotation.aopannotation;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
    AnnotationConfigApplicationContext context=new  AnnotationConfigApplicationContext(Appconfig.class);
    primaryclass primeclass=(primaryclass)context.getBean(primaryclass.class);
    primeclass.Show();
    }
}
