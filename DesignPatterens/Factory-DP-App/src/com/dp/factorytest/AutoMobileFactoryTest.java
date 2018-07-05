package com.dp.factorytest;

import com.dp.factory.AutoMobileFactory;
import com.dp.factory.AutoType;
import com.dp.factory.IAutoMobile;

public class AutoMobileFactoryTest {
	public static void main(String[] args) {
		AutoMobileFactory factory=AutoMobileFactory.getInstanceOfFactory();
		IAutoMobile autoMobile=factory.make(AutoType.BNW);
		autoMobile.start();
		autoMobile.stop();
		IAutoMobile audi=factory.make(AutoType.AUDI);
		audi.start();
		audi.stop();
		
	}


}
