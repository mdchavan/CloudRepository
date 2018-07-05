package com.dp.factory;

public class Toyato implements IAutoMobile {

	@Override
	public void start() {
		System.out.println("Start Toyato .");
	}

	@Override
	public void stop() {
		System.out.println("Stop Toyato .");
	}

}
