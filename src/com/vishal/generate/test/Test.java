package com.vishal.generate.test;

import com.vishal.generate.Generate;

class Test {
	public static void main(String[] args) {
		String[][] x = {{"U","P"},{"H","R"},{"E","L"},{"E","B"},
					    {"T","R"},{"O","P"},{"A","C"},{"M","H"}};
		
		Generate.allWords(x);
		System.out.println(Generate.findWord("BROCHURE"));
		System.out.println(Generate.findWord("PAMPHLET"));
	
		Generate.printList();
	}		
}		
	 	
