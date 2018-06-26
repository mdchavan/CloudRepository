package com.techlabs.guitar;


import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class Inventory {
	
	private List inventory;
	private List inventorym;

	public Inventory() {
		inventory = new LinkedList<Guitar>();
		inventorym=new LinkedList();

	}
	
	public void addInstrument(String serialNumber,double price,InstrumentSpec spec){
		Instrument instrument=null;
		if(spec instanceof GuitarSpec){
			instrument=new Guitar(serialNumber,price,(GuitarSpec)spec);
		}
		else if(spec instanceof MandolinSpec){
			instrument=new Mandolin(serialNumber,price,(MandolinSpec)spec);
		}
		inventory.add(instrument);
	}

	public Instrument get(String serialNumber){
		for(Iterator i=inventory.iterator();i.hasNext();){
			Instrument instrument=(Instrument)i.next();
			if(instrument.getSerialNumber().equals(serialNumber)){
				return instrument;
			}
		}
		return null;
	}
	public void addGuitar(String serialNumber, double price, Builder builder, String model, Type type, Wood backWood,
			Wood topWood,int numberString) {
		GuitarSpec spec=new GuitarSpec(builder,model,type,numberString,backWood,topWood);
		Guitar guitar = new Guitar(serialNumber, price,spec);
		inventory.add(guitar);
		
		}
	public void addMandolin(String serialNumber, double price, Builder builder, String model, Type type, Wood backWood,
			Wood topWood,Style style) {
		MandolinSpec spec=new MandolinSpec(builder,model,type,style,backWood,topWood);
		Mandolin mandolin = new Mandolin(serialNumber, price,spec);
		inventorym.add(mandolin);
		
		}
	public List search(GuitarSpec searchSpec) {
		List matchingGuitars=new LinkedList();
		for (Iterator i = inventory.iterator(); i.hasNext();) {
			Guitar guitar = (Guitar) i.next();
			if(guitar.getSpec().matches(searchSpec))
				matchingGuitars.add(guitar);
			}
		return matchingGuitars;
	}
	public List search(MandolinSpec searchSpec) {
		List matchingMandolins=new LinkedList();
		for (Iterator i = inventorym.iterator(); i.hasNext();) {
			Mandolin mandolin = (Mandolin) i.next();
			if(mandolin.getSpec().matches(searchSpec))
				matchingMandolins.add(mandolin);
			}

		return matchingMandolins;
	}
	
	public void displayGuitars(){
		//Collections.sort(guitars, new SortModel());
		//Collections.reverse(guitars);
		for (Iterator i = inventory.iterator(); i.hasNext();){
			Guitar guitar=(Guitar)i.next();
			InstrumentSpec spec=guitar.getSpec();
			GuitarSpec gspec=(GuitarSpec)spec;
			System.out.println(" "+guitar.getSerialNumber()+" We have a "+
					gspec.getBuilder()+" "+gspec.getModel()+" "+gspec.getType()+
					" guitar:\n    "+spec.getBackWood()+" back and sides ,\n    "+
					gspec.getTopWood()+" You can have it for only $"+
					guitar.getPrice()+" number of string "+gspec.getNumStrings()+"!\n -----------");
		}
		
	}
	
	public void displayMandolin(){
		//Collections.sort(guitars, new SortModel());
		//Collections.reverse(guitars);
		for (Iterator i = inventorym.iterator(); i.hasNext();){
			Mandolin mandolin=(Mandolin)i.next();
			InstrumentSpec spec=mandolin.getSpec();
			MandolinSpec mspec=(MandolinSpec)spec;
			System.out.println(" "+mandolin.getSerialNumber()+" We have a "+
					mspec.getBuilder()+" "+mspec.getModel()+" "+mspec.getType()+
					" guitar:\n    "+spec.getBackWood()+" back and sides ,\n    "+
					mspec.getTopWood()+" You can have it for only $"+
					mandolin.getPrice()+" number of string "+mspec.getStyle()+"!\n -----------");
		}
		
	}

}
