package com.techlabs.dogs;

public class DogDoorSimulator {

	public static void main(String[] args) {
		DogDoor door=new DogDoor();
		Remote remote=new Remote(door);
		
		System.out.println("\n Fido bark to go outside.....");
		remote.pressButton();
		System.out.println("\nFido has gone outside.....");
		System.out.println("\nFido's all done.......");
		try{
			Thread.currentThread().sleep(10000);
		}catch(InterruptedException e){
			
		}
		System.out.println(".........but he's stuck outside!");
		System.out.println("\nFido starts barking........");
		System.out.println("..........So Gina garbs the remote control.");
		remote.pressButton();
		System.out.println("\nFido's back inside..............");

	}

}
