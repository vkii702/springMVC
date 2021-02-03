package com.vicky.inheritenceinjection.config.inheritenceinjection;

public class DemoC {
	DeomP demop;

	public DeomP getDemop() {
		return demop;
	}

	public void setDemop(DeomP demop) {
		this.demop = demop;
	}
	public void ShowColor()
	{
		System.out.println("Color in case of:"+demop.getColor());
	}

}
