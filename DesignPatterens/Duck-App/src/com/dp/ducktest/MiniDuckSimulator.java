package com.dp.ducktest;

import com.dp.duck.Duck;
import com.dp.duck.FlyRocketPowered;
import com.dp.duck.MallardDuck;
import com.dp.duck.ModelDuck;

public class MiniDuckSimulator {

	public static void main(String[] args) {
		Duck mallard=new MallardDuck();
		mallard.performQuack();
		mallard.performFly();
		Duck model=new ModelDuck();
		model.performFly();
		model.setFlyBehavior(new FlyRocketPowered());
		model.performFly();
	}

}
