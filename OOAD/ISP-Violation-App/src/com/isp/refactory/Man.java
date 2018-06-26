package com.isp.refactory;

public class Man implements IRobot,IEat {

	@Override
	public void startWork() {
		System.out.println("Man start work");
	}

	@Override
	public void stopWork() {
		System.out.println("Man stop work");
	}

	@Override
	public void startEat() {
		System.out.println("Man start eat");
	}

	@Override
	public void stopEat() {
		System.out.println("Man stop eat");
	}

}
