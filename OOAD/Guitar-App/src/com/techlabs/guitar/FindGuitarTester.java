package com.techlabs.guitar;

import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public class FindGuitarTester {
	public static void main(String[] args) {
		Inventory inventory = new Inventory();
		initializeInventory(inventory);
		
		GuitarSpec whatErinLikes = new GuitarSpec(Builder.COLLINGS, "Stratocastor", Type.ELETRIC,5, Wood.ALDER, Wood.ALDER);
		inventory.display();
		System.out.println("=================================================================\n");
		List matchingGuitars = inventory.search(whatErinLikes);
		if (!matchingGuitars.isEmpty()) {
			System.out.println("Erin you might like these guitars");
			for(Iterator i=matchingGuitars.iterator();i.hasNext();){
				Guitar guitar=(Guitar)i.next();
				GuitarSpec spec=guitar.getSpec();
				System.out.println("We have a "+
				spec.getBuilder()+" "+spec.getModel()+" "+spec.getType()+
				" guitar:\n    "+spec.getBackWood()+" back and sides ,\n    "+
				spec.getTopWood()+" You can have it for only $"+
				guitar.getPrice()+" number of string "+spec.getNumStrings()+"!\n -----------");
			}
		} else
			System.out.println("Sorry, Erin, you have nothing for you.");

	}

	private static void initializeInventory(Inventory inventory) {
		inventory.addGuitar("V9693", 1499.95, Builder.COLLINGS, "Stratocastor", Type.ELETRIC, Wood.ALDER, Wood.ALDER,5);
		inventory.addGuitar("V9694", 1500.00, Builder.COLLINGS, "Ztratocastor", Type.ELETRIC, Wood.ALDER, Wood.ALDER,5);
		inventory.addGuitar("V9695", 1300.40, Builder.COLLINGS, "Btratocastor", Type.ELETRIC, Wood.ALDER, Wood.ALDER,5);
		inventory.addGuitar("V9696", 1700.98, Builder.COLLINGS, "Qtratocastor", Type.ELETRIC, Wood.ALDER, Wood.ALDER,5);
		inventory.addGuitar("V9697", 1220.00, Builder.COLLINGS, "Atratocastor", Type.ELETRIC, Wood.ALDER, Wood.ALDER,5);

	}

}
