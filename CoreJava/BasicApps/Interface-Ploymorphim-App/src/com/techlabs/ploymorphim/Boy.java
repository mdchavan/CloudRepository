package com.techlabs.ploymorphim;

public class Boy implements IEmotional, IManable {

	@Override
	public void wish() {
		System.out.println("Boy wish");

	}

	@Override
	public void desire() {
		System.out.println("Boy desire");

	}

	@Override
	public void cry() {
		System.out.println("Boy cry");

	}

	@Override
	public void laugh() {
		System.out.println("Boy laugh");
	}

}
