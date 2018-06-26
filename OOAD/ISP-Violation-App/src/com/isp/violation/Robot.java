package com.isp.violation;

public class Robot implements IWorker {

	@Override
	public void starWork() {
		System.out.println("Robat start work");		
	}

	@Override
	public void stopWork() {
		System.out.println("Robat stop work");
	}

	@Override
	public void startEat() {
	}

	@Override
	public void stopEat() {
	}

}
