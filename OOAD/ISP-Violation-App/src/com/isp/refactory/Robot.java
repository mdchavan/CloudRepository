package com.isp.refactory;

public class Robot implements IRobot{

	@Override
	public void startWork() {
		System.out.println("Robot start work.");
	}

	@Override
	public void stopWork() {
		System.out.println("Robot stop work.");
	}
	

}
