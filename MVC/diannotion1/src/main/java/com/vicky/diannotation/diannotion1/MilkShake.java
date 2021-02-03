package com.vicky.diannotation.diannotion1;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
@Component
public class MilkShake {
	@Autowired
	Flavour flavour;
	public void ShowFlavour()
	{
		System.out.println("Flavour will "+flavour.getFlavour());
	}

}
