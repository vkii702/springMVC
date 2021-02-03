package com.vicky.diannotation.diannotion1;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
    	AnnotationConfigApplicationContext context=new  AnnotationConfigApplicationContext(Diconfig.class);
    	MilkShake m1=context.getBean(MilkShake.class);
    	m1.ShowFlavour();
    }
}
