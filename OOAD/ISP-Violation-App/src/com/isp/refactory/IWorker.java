package com.isp.refactory;

public interface IWorker extends IWork, IEat {
	public void startWork();
	public void stopWork();
	public void startEat();
	public void stopEat();

}
