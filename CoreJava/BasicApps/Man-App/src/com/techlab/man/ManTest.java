package com.techlab.man;

public class ManTest {

	public static void main(String[] args) {
		// TODO Auto-generated method
		// caseStudy();

		// caseStudy1();
		playGround(new Boy());
		playGround(new Kid());

	}

	private static void caseStudy1() {
		Man man1 = new Boy();
		man1.read();
		man1.walk();
		man1.play();
	}

	private static void caseStudy() {
		Man man = new Man();
		System.out.println(" Case 1 : ");
		playGround(man);
		System.out.println(" Case 2 : ");
		Boy boy = new Boy();
		boy.eat();
		boy.play();
		boy.read();
		boy.walk();
	}

	public static void playGround(Man man) {
		man.play();
		man.read();
		man.walk();

	}

}
