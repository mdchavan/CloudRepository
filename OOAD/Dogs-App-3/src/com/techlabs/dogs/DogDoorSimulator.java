package com.techlabs.dogs;

public class DogDoorSimulator {

	public static void main(String[] args) {
		DogDoor door=new DogDoor();
		Remote remote=new Remote(door);
		
		BarkRecognizer recognizer=new BarkRecognizer(door);
		System.out.println("Fido starts barking.");
		recognizer.recognize("Woof");
		System.out.println("\n Fido has gone outside.....");
		System.out.println("\nFido's all done..........");
		
		try{
			Thread.currentThread().sleep(1000);
		}
		catch(InterruptedException e){
			}
		
		System.out.println(".........but he's stuck outside!");
		System.out.println("\n Fido starts barking.");
		recognizer.recognize("Woof");
		System.out.println("\nFido's back inside..............");

	}

}
