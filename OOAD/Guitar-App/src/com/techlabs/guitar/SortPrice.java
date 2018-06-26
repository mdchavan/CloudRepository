package com.techlabs.guitar;

import java.util.Comparator;

public class SortPrice implements Comparator<Guitar> {

		@Override
		public int compare(Guitar guitar1, Guitar guitar2) {
			if (guitar1.getPrice() == guitar2.getPrice())
				return 0;
			else if (guitar1.getPrice() > guitar2.getPrice())
				return 1;
			else
				return -1;
		}

	}



