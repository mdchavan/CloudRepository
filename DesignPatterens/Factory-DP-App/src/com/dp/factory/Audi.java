package com.dp.factory;

public class Audi implements IAutoMobile {

	@Override
	public void start() {
		System.out.println("Start Audi ");
	}

	@Override
	public void stop() {
		System.out.println("Stop Audi ");
	}

}
