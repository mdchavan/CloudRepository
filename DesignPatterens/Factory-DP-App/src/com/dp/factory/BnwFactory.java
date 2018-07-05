package com.dp.factory;

public class BnwFactory implements IAutoFactory {

	@Override
	public IAutoMobile make() {
		return new Bnw();
	}

}
