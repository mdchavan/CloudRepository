package com.techlabs.ploymorphim;

public class Polymorphism {

	public static void main(String[] args) {
		Polymorphism poly = new Polymorphism();
		Boy boy = new Boy();
		Man man = new Man();
		poly.atTheMovie(boy);
		// poly.atTheMovie(man);

		poly.atTheParty(man);
		poly.atTheParty(boy);

	}

	private void atTheParty(IManable manable) {
		manable.wish();
		manable.desire();

	}

	private void atTheMovie(IEmotional emotional) {
		emotional.cry();
		emotional.laugh();

	}

}
