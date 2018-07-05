package com.dp.singleton;

public class Singleton {
	private static Singleton singleton;
	private Singleton(){
		
	}
	public static Singleton getSingletonInstance(){
		if(singleton==null){
			singleton=new Singleton();
			return singleton;
		}
		else 
			return singleton;
	}
	public void showHashCode(){
		System.out.println(singleton.hashCode());
	}

}
