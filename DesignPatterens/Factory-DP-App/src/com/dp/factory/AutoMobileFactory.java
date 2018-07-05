package com.dp.factory;

public class AutoMobileFactory {
	private static AutoMobileFactory factory;
	private  AutoMobileFactory(){
		
	}
	public static AutoMobileFactory getInstanceOfFactory(){
		if(factory==null){
			factory=new AutoMobileFactory();
			return factory;
		}
		else
			return factory;
	}
	public IAutoMobile make(AutoType autoType){
		switch(autoType){
		case AUDI:
			return new AudiFactory().make();

		case BNW:
			return new BnwFactory().make();
		
		case TOYATO:
			
			return new ToyatoFactory().make();
			default :
				return null;
		}
	}
}
