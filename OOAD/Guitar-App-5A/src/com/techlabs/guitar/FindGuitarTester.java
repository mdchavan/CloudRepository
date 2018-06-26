package com.techlabs.guitar;

import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public class FindGuitarTester {
	public static void main(String[] args) {
		Inventory inventory = new Inventory();
		initializeInventory(inventory);
		
		GuitarSpec whatErinLikes = new GuitarSpec(Builder.COLLINGS, "Stratocastor", Type.ELETRIC,5, Wood.ALDER, Wood.ALDER);
		MandolinSpec whatErinLikes1 = new MandolinSpec(Builder.COLLINGS, "Ztratocastor", Type.ELETRIC,Style.A, Wood.ALDER, Wood.ALDER);

		//inventory.display();
		System.out.println("==========================Guitar=======================================\n");
		List matchingGuitars = inventory.search(whatErinLikes);
		if (!matchingGuitars.isEmpty()) {
			System.out.println("Erin you might like these guitars");
			for(Iterator i=matchingGuitars.iterator();i.hasNext();){
				Guitar guitar=(Guitar)i.next();
				InstrumentSpec spec=guitar.getSpec();
				GuitarSpec gspec=(GuitarSpec)spec;
				System.out.println("We have a "+
				gspec.getBuilder()+" "+gspec.getModel()+" "+gspec.getType()+
				" guitar:\n    "+gspec.getBackWood()+" back and sides ,\n    "+
				gspec.getTopWood()+" You can have it for only $"+
				guitar.getPrice()+" number of string "+gspec.getNumStrings()+"!\n -----------");
			}
		} else
			System.out.println("Sorry, Erin, you have nothing for you.");
		
		System.out.println("==========================Guitar List=======================================\n");
		inventory.displayGuitars();
		
		System.out.println("===================Mandolin==============================================\n");
		List matchingMandolins = inventory.search(whatErinLikes1);
		if (!matchingMandolins.isEmpty()) {
			System.out.println("Erin you might like these mandolin");
			for(Iterator i=matchingMandolins.iterator();i.hasNext();){
				Mandolin mandolin=(Mandolin)i.next();
				InstrumentSpec spec=mandolin.getSpec();
				MandolinSpec mspec=(MandolinSpec)spec;
				System.out.println("We have a "+
				mspec.getBuilder()+" "+mspec.getModel()+" "+mspec.getType()+
				" guitar:\n    "+mspec.getBackWood()+" back and sides ,\n    "+
				mspec.getTopWood()+" You can have it for only $"+
				mandolin.getPrice()+" number of string "+mspec.getStyle()+"!\n -----------");
			}
		} else
			System.out.println("Sorry, Erin, you have nothing for you.");
		
		System.out.println("==========================Mandolin List=======================================\n");
		inventory.displayMandolin();

	}

	private static void initializeInventory(Inventory inventory) {
		inventory.addGuitar("V9693", 1499.95, Builder.COLLINGS, "Stratocastor", Type.ELETRIC, Wood.ALDER, Wood.ALDER,5);
		inventory.addGuitar("V9694", 1500.00, Builder.COLLINGS, "Ztratocastor", Type.ELETRIC, Wood.ALDER, Wood.ALDER,5);
		inventory.addGuitar("V9695", 1300.40, Builder.COLLINGS, "Btratocastor", Type.ELETRIC, Wood.ALDER, Wood.ALDER,5);
		inventory.addGuitar("V9696", 1700.98, Builder.COLLINGS, "Qtratocastor", Type.ELETRIC, Wood.ALDER, Wood.ALDER,5);
		inventory.addGuitar("V9697", 1220.00, Builder.COLLINGS, "Atratocastor", Type.ELETRIC, Wood.ALDER, Wood.ALDER,5);

		
		inventory.addMandolin("V9682", 2500.00, Builder.COLLINGS, "Ztratocastor", Type.ELETRIC, Wood.ALDER, Wood.ALDER,Style.A);
		inventory.addMandolin("V9683", 1900.00, Builder.COLLINGS, "Stratocastor", Type.ELETRIC, Wood.ALDER, Wood.ALDER,Style.F);
		inventory.addMandolin("V9684", 2200.00, Builder.COLLINGS, "Atratocastor", Type.ELETRIC, Wood.ALDER, Wood.ALDER,Style.A);
		inventory.addMandolin("V9685", 2400.00, Builder.MARTIN, "Dtratocastor", Type.ELETRIC, Wood.ALDER, Wood.ALDER,Style.A);
		inventory.addMandolin("V9686", 2100.00, Builder.FENDER, "Qtratocastor", Type.ELETRIC, Wood.ALDER, Wood.ALDER,Style.A);

	}

}
