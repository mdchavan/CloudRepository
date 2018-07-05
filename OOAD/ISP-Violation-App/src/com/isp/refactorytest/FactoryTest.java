package com.isp.refactorytest;

import com.isp.refactory.IWork;
import com.isp.refactory.IWorker;
import com.isp.refactory.Man;
import com.isp.refactory.Robot;

public class FactoryTest {

	public static void main(String[] args) {
		atCafeArea(new Man());
		//atCafeArea(new Robot());
		atWorkstation(new Man());
		atWorkstation(new Robot());
		}

	private static void atWorkstation(IWork worker) {
		worker.startWork();
		worker.stopWork();
	}

	private static void atCafeArea(IWorker worker) {
		worker.startEat();
		worker.stopEat();
	}

}
