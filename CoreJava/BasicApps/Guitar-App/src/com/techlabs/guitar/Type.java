package com.techlabs.guitar;

public enum Type {
	ACOUSTIC, ELETRIC;
	public String toString() {
		switch (this) {
		case ACOUSTIC:
			return "acoustic";
		case ELETRIC:
			return "elctric";
		default:
			return "";
		}

	}

}
