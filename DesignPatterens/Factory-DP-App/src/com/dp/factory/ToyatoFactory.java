package com.dp.factory;

public class ToyatoFactory implements IAutoFactory {

	@Override
	public IAutoMobile make() {
		return new Toyato();
	}
}
