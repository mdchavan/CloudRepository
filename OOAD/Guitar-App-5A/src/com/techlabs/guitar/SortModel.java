package com.techlabs.guitar;

import java.util.Comparator;

public class SortModel implements Comparator<Guitar> {

	@Override
	public int compare(Guitar guitarSpec1, Guitar guitarSpec2) {

		return guitarSpec1.getSpec().getModel().compareTo(guitarSpec2.getSpec().getModel());
		
	}

}
