package com.isp.violationtest;

import com.isp.violation.*;

public class ViolationTest {

	public static void main(String[] args) {
		atCafeArea( new Man());
		atCafeArea( new Robot());
		atWorkstation( new Man());
		atWorkstation( new Robot());

	}

	private static void atWorkstation(IWorker worker) {
		worker.starWork();
		worker.stopWork();
		
	}

	private static void atCafeArea(IWorker worker) {
		worker.startEat();
		worker.stopEat();
	}

}
