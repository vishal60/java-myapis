package com.vishal.findelement;

import java.util.Iterator;
import java.util.LinkedHashSet;

public class FindElement {
	private static String s;
	private static LinkedHashSet<Character> ts;	

	public static Character nonRepeatingCharAt(String str, int index) throws InvalidArgumentException{
		
		if(index<0)
			throw new InvalidArgumentException();
		
		s = str;
		ts = new LinkedHashSet<Character>();
		for (int i = 0; i < str.length(); i++) {
			if(ts.contains(s.charAt(i)))
				ts.remove(s.charAt(i));
			else
				ts.add(s.charAt(i));
		}
		
		Iterator<Character> itr = ts.iterator();						
		for(int i=1; itr.hasNext()&&i<index; i++)
			itr.next();		
		
		if(itr.hasNext())
			return itr.next();
		else
			throw new InvalidArgumentException();
		
	}
}
