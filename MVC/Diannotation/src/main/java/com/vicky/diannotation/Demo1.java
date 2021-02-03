package com.vicky.diannotation;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
@Component
public class Demo1 {
	@Autowired
	Demo2 demo2;
	
	public void showColor()
	{
		System.out.println("demo2 color"+demo2.getColor());
	}

}
