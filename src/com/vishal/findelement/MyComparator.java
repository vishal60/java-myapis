package com.vishal.findelement;

import java.util.Comparator;

public class MyComparator implements Comparator<Character> {

	@Override
	public int compare(Character arg0, Character arg1) {
		
		return -arg0.compareTo(arg1);
	}

}
