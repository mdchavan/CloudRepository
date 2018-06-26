package com.isp.refactorytest;

import com.isp.refactory.IEat;
import com.isp.refactory.IRobot;
import com.isp.refactory.Man;
import com.isp.refactory.Robot;

public class FactoryTest {

	public static void main(String[] args) {
		atCafeArea(new Man());
		atWorkstation(new Man());
		atWorkstation(new Robot());
	}

	private static void atWorkstation(IRobot worker) {
		worker.startWork();
		worker.stopWork();
	}

	private static void atCafeArea(IEat worker) {
		worker.startEat();
		worker.stopEat();
	}

}
