package com.tictak.game;

public enum Mark {
	CROSS,
	NAUGHT,
	EMPTY;
	public String toString(){
		switch(this){
		case CROSS:
			return "x";
		case NAUGHT:
			return "0";
			default :
				return"";
		}
	}

}
