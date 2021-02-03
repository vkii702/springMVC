package com.vicky.diannotation.diannotion1;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Flavour {
	@Value("banana")
	String Flavour;

	public String getFlavour() {
		return Flavour;
	}
	}

