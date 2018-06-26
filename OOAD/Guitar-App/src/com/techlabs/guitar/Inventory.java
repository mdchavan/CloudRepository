package com.techlabs.guitar;


import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class Inventory {
	private List<Guitar> guitars;

	public Inventory() {
		guitars = new LinkedList<Guitar>();

	}

	public void addGuitar(String serialNumber, double price, Builder builder, String model, Type type, Wood backWood,
			Wood topWood,int numberString) {
		GuitarSpec spec=new GuitarSpec(builder,model,type,numberString,backWood,topWood);
		
		Guitar guitar = new Guitar(serialNumber, price,spec);
		guitars.add(guitar);
		
		}
	public void display(){
		Collections.sort(guitars, new SortModel());
		Collections.reverse(guitars);
		for(Guitar guitar:guitars){
			GuitarSpec spec=guitar.getSpec();
			System.out.println(" "+guitar.getSerilNumber()+" We have a "+
					spec.getBuilder()+" "+spec.getModel()+" "+spec.getType()+
					" guitar:\n    "+spec.getBackWood()+" back and sides ,\n    "+
					spec.getTopWood()+" You can have it for only $"+
					guitar.getPrice()+" number of string "+spec.getNumStrings()+"!\n -----------");
		}
		
	}

	public Guitar getGuitar(String serialNumber) {
		for (Iterator i = guitars.iterator(); i.hasNext();) {
			Guitar guitar = (Guitar) i.next();
			if (guitar.getSerilNumber().equals(serialNumber)) {
				return guitar;
			}
		}
		return null;
	}

	public List search(GuitarSpec searchSpec) {
		List matchingGuitars=new LinkedList();
		for (Iterator i = guitars.iterator(); i.hasNext();) {
			Guitar guitar = (Guitar) i.next();
			if(guitar.getSpec().matches(searchSpec))
				matchingGuitars.add(guitar);
			}

		return matchingGuitars;
	}

}
