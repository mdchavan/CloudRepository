package com.dp.singletontest;

import com.dp.singleton.Demo;
import com.dp.singleton.Singleton;

public class SingletonTest {

	public static void main(String[] args) {
		Singleton sigletonFirst=Singleton.getSingletonInstance();
		Singleton singletonSecond=Singleton.getSingletonInstance();
		sigletonFirst.showHashCode();
		singletonSecond.showHashCode();
		System.out.println("===============================");
		Demo demo1=new Demo();
		Demo demo2=new Demo();
		Demo demo3=demo2;
		System.out.println("demo1 : "+demo1.hashCode());
		System.out.println("demo2 : "+demo2.hashCode());
		System.out.println("demo3 : "+demo3.hashCode());

	}

}
